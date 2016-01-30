package br.com.qzmobile.common.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.PedidoBean;
import br.com.qzmobile.common.jdbc.util.PedidoRowMapper;

@Repository("pedidoDAOExt")
public class PedidoDAOExt extends PedidoDAO {

	private static final String GET_ALL_BY_FILIAL = "SELECT * "
			+ "FROM %tabInf% " + "WHERE ID_FILIAL = ? ";

	private static final String GET_PEDIDOS_BY_CLIENTE = "SELECT * "
			+ "FROM delivery.PEDIDO " + "WHERE id_cliente = ? "
			+ " ORDER BY  dt_entrega DESC , nr_pedido DESC ";

	
	private static final String GET_NRPEDIDOS = "SELECT * "
			+ "FROM delivery.PEDIDO "
			+ "WHERE DATE_FORMAT(dt_entrega, '%d/%m/%Y') = ?"
			+ " ORDER BY nr_pedido DESC ";

	private static final String UPDATE_STATUS_PEDIDO = "UPDATE delivery.PEDIDO "
			+ " SET status = ? " + " WHERE id = ? ";

	private static final String GET_ALL_BY_FILIAL_ORDER_BY_ID_DESC = "SELECT ID "
			+ "FROM %tabInf% "
			+ "WHERE ID_FILIAL = ? "
			+ "ORDER BY ID DESC "
			+ "LIMIT 1 ";

	private static final String GET_ALL_ORDERED = 
			"SELECT * "
			+ "FROM delivery.PEDIDO " + 
			" ORDER BY dt_entrega, nr_pedido ASC ";
	
	private static final String GET_PEDIDOS_ANTIGOS = "SELECT * "
			+ "FROM delivery.PEDIDO "
			+ "WHERE ID_FILIAL = ?  "
			+ "AND DATE_FORMAT(dt_entrega, '%Y/%m/%d') < CURRENT_DATE" 
			+ " ORDER BY dt_entrega DESC ";

	private static final String GET_PEDIDOS_AGENDADOS = "SELECT * "
			+ "FROM delivery.PEDIDO "
			+ "WHERE ID_FILIAL = ?  "
			+"  AND DATE_FORMAT(dt_entrega, '%Y/%m/%d') > CURRENT_DATE "
			+ " ORDER BY dt_entrega ASC ";

	private static final String GET_PEDIDOS_DE_HOJE = "SELECT * "
			+ "FROM delivery.PEDIDO "
			+ "WHERE ID_FILIAL = ?  "
			+"  AND DATE_FORMAT(dt_entrega, '%Y/%m/%d') = CURRENT_DATE "
			+ " ORDER BY dt_entrega DESC ";
	
	
	private static final String UPDATE_TAXA_PEDIDO = "UPDATE delivery.PEDIDO "
			+ " SET vl_total = vl_total - taxa_extra, taxa_extra = 0.0  WHERE id = ? ";
	
	

	public List<PedidoBean> getPedidosAntigos(long idFilial) throws SQLException {

		return this.getRecordList(GET_PEDIDOS_ANTIGOS, new Object[] { idFilial });
	}

	public List<PedidoBean> getPedidosAgendados(long idFilial) throws SQLException {

		return this.getRecordList(GET_PEDIDOS_AGENDADOS, new Object[] { idFilial });
	}

	public List<PedidoBean> getPedidosDeHoje(long idFilial) throws SQLException {

		return this.getRecordList(GET_PEDIDOS_DE_HOJE, new Object[] { idFilial });
	}



	@Autowired
	private ItemPedidoDAOExt itemPedidoDAOExt;
	
	
	@Autowired
	private DescontoDAO descontoDAO;

	@Autowired
	private ClienteDAOExt clienteDAOExt;

	public long getNrPedido(String dtEntrega) throws SQLException {

		final Object[] parametros = new Object[] { dtEntrega };
		List<PedidoBean> pedidos = this
				.getRecordList(GET_NRPEDIDOS, parametros);
		if (pedidos == null || pedidos.size() == 0) {
			return 1;
		} else {
			return pedidos.get(0).getNrPedido() + 1;
		}
	}

	// -------------------------------------------------------------------------------------

	
	public List<PedidoBean> getAllByFilial(long idFilial) throws SQLException {

		return this.getRecordList(GET_ALL_BY_FILIAL, new Object[] { idFilial });
	}

	public List<PedidoBean> getAllOrdered() throws SQLException {

		return this.getRecordList(GET_ALL_ORDERED, new Object[] {});
	}


	public List<PedidoBean> getPedidosByCliente(Long idCliente)
			throws SQLException {
		final Object[] parametros = new Object[] { idCliente };
		return this.getRecordList(GET_PEDIDOS_BY_CLIENTE, parametros);
	}

	public List<PedidoBean> getPedidosFullByCliente(Long idCliente)
			throws SQLException {
		final Object[] parametros = new Object[] { idCliente };

		PedidoRowMapper rowMapper = new PedidoRowMapper();
		rowMapper.setClienteDAOExt(clienteDAOExt);
		rowMapper.setItemPedidoDAOExt(itemPedidoDAOExt);

		return this.jdbcTemplate.query(GET_PEDIDOS_BY_CLIENTE, parametros,
				rowMapper);

	}
	
	
	public void removeTaxaEntrega(Long idPedido){
		
		final Object[] parametros = new Object[] { idPedido };
		this.jdbcTemplate.update(UPDATE_TAXA_PEDIDO, parametros);
		
	}

	public void updateStatusPedido(Long idPedido, String status) {

		final Object[] parametros = new Object[] { status, idPedido };
		this.jdbcTemplate.update(UPDATE_STATUS_PEDIDO, parametros);

	}

	public List<PedidoBean> getAllByFilialOrderByIdDesc(long idFilial)
			throws SQLException {

		return this.getRecordList(GET_ALL_BY_FILIAL_ORDER_BY_ID_DESC,
				new Object[] { idFilial });
	}

	public Long insertPedido(PedidoBean vo) {
		
		vo.setStCancelaTxEntrega(false);
		vo.setMotivoRetiraTaxa("");
		vo.setIdMotorista(1L);
		
		System.out.println(this.buildSimpleInsert());
		Long key = 0l;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try {
			conn = this.jdbcTemplate.getDataSource().getConnection();
			prep = conn.prepareStatement(this.buildSimpleInsert(),
					Statement.RETURN_GENERATED_KEYS);
			prep.setDouble(1, vo.getVlTotal());
			prep.setLong(2, vo.getIdFilial());
			prep.setLong(3, vo.getIdCliente());
			prep.setLong(4, vo.getIdUsuario());
			prep.setLong(5, vo.getNrPedido());
			prep.setTimestamp(6, new Timestamp(vo.getDtEntrega().getTime()));
			prep.setString(7, vo.getStatus());
			prep.setDate(8, new Date(new java.util.Date().getTime()));

			prep.setString(9, vo.getLogradouro());
			prep.setString(10, vo.getNumeroEndereco());
			prep.setString(11, vo.getComplementoEndereco());
			prep.setString(12, vo.getReferenciaEndereco());
			prep.setString(13, vo.getBairro());
			prep.setString(14, vo.getCidade());
			prep.setString(15, vo.getUf());
			prep.setString(16, vo.getTelefoneContato());
			prep.setString(17, vo.getUsaEnderecoResidencia());
			prep.setLong(18, vo.getDistancia());
			prep.setDouble(19, vo.getTaxaExtra());
			prep.setBoolean(20, vo.getStCancelaTxEntrega());
			prep.setString(21, vo.getMotivoRetiraTaxa());
			prep.setLong(22, vo.getIdMotorista());
			
			prep.executeUpdate();
			rs = prep.getGeneratedKeys();

			if (rs != null && rs.next()) {
				key = rs.getLong(1);
			}

			vo.setId(key);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null) {
					conn.close();
				}
				if (prep != null) {

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return key;
	}

	public void setItemPedidoDAOExt(ItemPedidoDAOExt itemPedidoDAOExt) {
		this.itemPedidoDAOExt = itemPedidoDAOExt;
	}

	public void setClienteDAOExt(ClienteDAOExt clienteDAOExt) {
		this.clienteDAOExt = clienteDAOExt;
	}

	public void setDescontoDAO(DescontoDAO descontoDAO) {
		this.descontoDAO = descontoDAO;
	}

}
