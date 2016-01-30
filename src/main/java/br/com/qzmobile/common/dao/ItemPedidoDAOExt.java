package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ClienteBean;
import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.ProdutoBean;
import br.com.qzmobile.common.jdbc.util.TotalItemPedidoRowMapper;
import br.com.qzmobile.common.util.TotalItemPedidoVO;


@Repository("itemPedidoDAOExt")
public class ItemPedidoDAOExt extends ItemPedidoDAO {
	
	@Autowired
	ProdutoDAOExt produtoDAOExt;

	private static final String GET_BY_ITENS_PEDIDO =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE id_pedido = ? ";


	private static final String GET_ALL_BY_FILIAL =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE ID_FILIAL = ? " ;
	
	private static final String UPDATE_VALOR_TOTAL_PEDIDO =
	" UPDATE PEDIDO "+
	" SET vl_total = ("+
	" SELECT SUM(qtd * vl_produto) "+ 
	" FROM ITEM_PEDIDO it, "+
	"      PRODUTO     pr "+
	" WHERE id_pedido = ? "+
	" AND it.id_produto = pr.id ) "+
	" WHERE id = ? ";
	
	
	private static final String TOTAIS_PEDIDOS_PRODUTO = 
			" SELECT PRD.NM_PRODUTO, SUM(ITEM.QTD) AS TOTAL " +
			" FROM ITEM_PEDIDO ITEM, "+
            "        PEDIDO      PED, "+
            "        PRODUTO     PRD  "+
            " WHERE ID_PRODUTO = ?    "+ 
            " AND ITEM.ID_PEDIDO = PED.ID "+
            " AND ITEM.ID_PRODUTO = PRD.ID "+
            " AND PED.DT_ENTREGA BETWEEN ? AND  ? "+
            " GROUP BY PRD.NM_PRODUTO ";
	
	
	private static final String TOTAIS_PEDIDOS = 
			" SELECT PRD.NM_PRODUTO, SUM(ITEM.QTD) AS TOTAL " +
			" FROM ITEM_PEDIDO ITEM, "+
            "        PEDIDO      PED, "+
            "        PRODUTO     PRD  "+
            " WHERE ITEM.ID_PEDIDO = PED.ID "+
            " AND ITEM.ID_PRODUTO = PRD.ID "+
            " AND PED.DT_ENTREGA BETWEEN ? AND  ? "+
            " GROUP BY PRD.NM_PRODUTO ";

	// -------------------------------------------------------------------------------------
	
	
	public List<TotalItemPedidoVO> getTotalItemPedido(ProdutoBean produto, Date dtInicial, Date dtFinal){
		
		
		final Object[] parametros = new Object[]{produto.getId(), new Timestamp(dtInicial.getTime()), new Timestamp(dtFinal.getTime())};
		
		List<TotalItemPedidoVO> lista = this.jdbcTemplate.query(TOTAIS_PEDIDOS_PRODUTO, parametros, new TotalItemPedidoRowMapper());
		
		
		return lista;
		
	}
	
	public List<TotalItemPedidoVO> getTotalItemPedido(Date dtInicial, Date dtFinal){
			
			
			final Object[] parametros = new Object[]{new Timestamp(dtInicial.getTime()), new Timestamp(dtFinal.getTime())};
			
			List<TotalItemPedidoVO> lista = this.jdbcTemplate.query(TOTAIS_PEDIDOS, parametros, new TotalItemPedidoRowMapper());
			
			
			return lista;
			
		}
	
	public List<ItemPedidoBean> getItensPedidoPorPedido(Long idPedido) throws SQLException {
		final Object[] parametros = new Object[]{idPedido};
		
		List<ItemPedidoBean> lista = this.getRecordList(GET_BY_ITENS_PEDIDO, parametros);
		
		for (ItemPedidoBean itemPedidoBean : lista) {
			
			ProdutoBean produto = produtoDAOExt.getById(itemPedidoBean.getIdProduto());
			itemPedidoBean.setProduto(produto);
			
			
		}
		
		
		return lista;
	}
	
	

   public List<ItemPedidoBean> getAllByFilial(long idFilial) throws SQLException{
    	
    	return this.getRecordList(GET_ALL_BY_FILIAL, new Object[]{idFilial});
    }


public void setProdutoDAOExt(ProdutoDAOExt produtoDAOExt) {
	this.produtoDAOExt = produtoDAOExt;
}
   
   
public void delete(ItemPedidoBean vo){
	this.jdbcTemplate.update(this.buildSimpleDelete(), vo.toPk());
	
	this.updateValorTotalPedido(vo.getIdPedido() );
}

public void delete(Long id){
	Object[] parans = new Object[]{id}; 
	
	this.jdbcTemplate.update(this.buildSimpleDelete(), parans);
	
	this.updateValorTotalPedido( id );
}

public void save(ItemPedidoBean vo){
	if(vo.toPk() == null || vo.toPk()[0] == null || ((Long)vo.toPk()[0]) == 0){
		this.jdbcTemplate.update(this.buildSimpleInsert(), vo.toInsert());
	}else{
		this.jdbcTemplate.update(this.buildSimpleUpdate(), vo.toUpdate());
	}
	
	this.updateValorTotalPedido(vo.getIdPedido() );
}

// ------------------------------------------------------------------------

public void update(ItemPedidoBean vo){
	this.jdbcTemplate.update(this.buildSimpleUpdate(), vo.toUpdate());
	//this.updateValorTotalPedido(vo.getIdPedido() );
}


public void updateValorTotalPedido(Long idPedido){
	Object[] parans = new Object[]{idPedido, idPedido}; 
	this.jdbcTemplate.update(UPDATE_VALOR_TOTAL_PEDIDO, parans);
}

// ------------------------------------------------------------------------

public void insert(ItemPedidoBean vo){
	this.jdbcTemplate.update(this.buildSimpleInsert(), vo.toInsert());
	//this.updateValorTotalPedido(vo.getIdPedido() );
}
	   

	   
}
