package br.com.qzmobile.common.jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import br.com.qzmobile.common.bean.ClienteBean;
import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.PedidoBean;
import br.com.qzmobile.common.dao.ClienteDAOExt;
import br.com.qzmobile.common.dao.ItemPedidoDAOExt;

public class PedidoRowMapper implements RowMapper<PedidoBean> {

	private ItemPedidoDAOExt itemPedidoDAOExt;
	private ClienteDAOExt clienteDAOExt;  
	
	@Override
	public PedidoBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoBean pedido = new PedidoBean();
		pedido.setId(rs.getLong("id"));
		pedido.setVlTotal(rs.getDouble("vl_total"));
		pedido.setNrPedido(rs.getLong("nr_pedido"));
		pedido.setDtEntrega(rs.getDate("dt_entrega"));
		pedido.setDtAlteracao(rs.getDate("dt_alteracao"));
		pedido.setIdCliente(rs.getLong("id_cliente"));
		pedido.setIdFilial(rs.getLong("id_filial"));
		pedido.setStatus(rs.getString("status"));
		pedido.setIdUsuario(rs.getLong("id_usuario"));
		
		pedido.setDistancia(rs.getLong("distancia"));
		pedido.setBairro(rs.getString("bairro"));
		pedido.setCidade(rs.getString("cidade"));
		pedido.setStCancelaTxEntrega(rs.getBoolean("stCancelaTxEntrega"));
		pedido.setMotivoRetiraTaxa(rs.getString("motivoRetiraTaxa"));
		pedido.setIdMotorista(rs.getLong("idMotorista"));
		
		ClienteBean cliente = clienteDAOExt.getById(rs.getLong("id_cliente"));
		
		
		pedido.setCliente(cliente);
		
		List<ItemPedidoBean> itens = itemPedidoDAOExt.getItensPedidoPorPedido(rs.getLong("id"));
		pedido.setItensPedido(itens);
		
		return pedido;
	}

	public void setItemPedidoDAOExt(ItemPedidoDAOExt itemPedidoDAOExt) {
		this.itemPedidoDAOExt = itemPedidoDAOExt;
	}

	public void setClienteDAOExt(ClienteDAOExt clienteDAOExt) {
		this.clienteDAOExt = clienteDAOExt;
	}

}
