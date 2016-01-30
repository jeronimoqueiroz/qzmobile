package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.AtividadeBean;
import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.PedidoBean;
import br.com.qzmobile.common.bean.ProdutoBean;
import br.com.qzmobile.common.bean.StatusAtividadeBean;



@Repository("atividadeDAOExt")
public class AtividadeDAOExt extends AtividadeDAO {

	public static final String STATUS_AGENDADO = "Agendado";
	public static final  String STATUS_EM_ANDAMENTO = "Em andamento";
	public static final  String STATUS_PRONTO_PARA_ENTREGA = "Pronto para entrega";
	public static final  String STATUS_EXPEDIDO = "Expedido";
	public static final String STATUS_CANCELADO = "Cancelado";
	
	
	@Autowired
	ItemPedidoDAOExt itemPedidoDAOExt;
	
	@Autowired
	StatusAtividadeDAOExt statusAtividadeDAOExt;
	
	private static final String GET_ATIVIDADE_PEDIDO = "select * from ATIVIDADE where id_pedido = ? ";
	
	
	private static final String CHANGE_STATUS_PEDIDO = "update ATIVIDADE set status= ?  where id_pedido = ? ";
	
	public AtividadeBean getAtividadePorPedido(Long idPedido) throws SQLException{
		return this.getRecord(GET_ATIVIDADE_PEDIDO, new Object[]{idPedido});
	}
	
	public void changeStatusPorPedido(Long idPedido, String status){
		this.jdbcTemplate.update(CHANGE_STATUS_PEDIDO, new Object[]{status, idPedido});
	}
	
	public List<AtividadeBean> getAll() {
		
		List<AtividadeBean> lista = super.getAll();
		
		for (AtividadeBean atividade : lista) {
			
			List<ItemPedidoBean> itens = null;
			try {
				itens = itemPedidoDAOExt.getItensPedidoPorPedido(atividade.getIdPedido());
				
				StatusAtividadeBean statusAtiv = statusAtividadeDAOExt.getStatusPorDescricao(atividade.getStatus());
				atividade.setStatusAtividade(statusAtiv);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			atividade.setItensPedido(itens);
			
		}
		
		
		return lista;
	}

	public void setItemPedidoDAOExt(ItemPedidoDAOExt itemPedidoDAOExt) {
		this.itemPedidoDAOExt = itemPedidoDAOExt;
	}

	public void setStatusAtividadeDAOExt(StatusAtividadeDAOExt statusAtividadeDAOExt) {
		this.statusAtividadeDAOExt = statusAtividadeDAOExt;
	}






}
