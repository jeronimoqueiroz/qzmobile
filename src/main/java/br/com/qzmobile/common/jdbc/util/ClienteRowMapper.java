package br.com.qzmobile.common.jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import br.com.qzmobile.common.bean.ClienteBean;
import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.PedidoBean;
import br.com.qzmobile.common.dao.ItemPedidoDAOExt;
import br.com.qzmobile.common.dao.PedidoDAOExt;

public class ClienteRowMapper implements RowMapper<ClienteBean> {

	private PedidoDAOExt pedidoDAOExt;
	
	@Override
	public ClienteBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClienteBean cliente = new ClienteBean();
		cliente.setId(rs.getLong("id"));
		cliente.setBairro(rs.getString("bairro"));
		cliente.setCidade(rs.getString("cidade"));
		cliente.setCnpj(rs.getString("cnpj"));
		cliente.setCpf(rs.getString("cpf"));
		cliente.setEmail(rs.getString("email"));
		cliente.setIdFilial(rs.getLong("idFilial"));
		cliente.setIe(rs.getString("ie"));
		cliente.setLogradouro(rs.getString("logradouro"));
		cliente.setNmCliente(rs.getString("nmCliente"));
		cliente.setNmEmpresaCliente(rs.getString("empresaCliente"));
		cliente.setStSexo(rs.getString("stSexo"));
		cliente.setTelefone(rs.getString("telefone"));
		cliente.setTpCliente(rs.getString("tpCliente"));
		cliente.setUf(rs.getString("uf"));
		cliente.setWebsite(rs.getString("website"));
		cliente.setFormaConhecimento(rs.getString("formaConhecimento"));
		cliente.setQualCampanha(rs.getString("qualCampanha"));
		cliente.setQualWebsite(rs.getString("qualWebsite"));
		cliente.setTelefoneCelular(rs.getString("telefoneCelular"));
		cliente.setTelefoneComercial(rs.getString("telefoneComercial"));
		cliente.setEmailTrabalho(rs.getString("emailTrabalho"));
		cliente.setReferenciaEndereco(rs.getString("referenciaEndereco"));
		cliente.setDtNascimento(rs.getDate("referenciaEndereco"));
		cliente.setGenero(rs.getString("genero"));
		cliente.setNumeroEndereco(rs.getString("numeroEndereco"));
		cliente.setComplementoEndereco(rs.getString("complementoEndereco"));
		cliente.setQualAnuncio(rs.getString("qualAnuncio"));
		cliente.setQualRede(rs.getString("qualRede"));
		cliente.setNomeEmpresa(rs.getString("nomeEmpresa"));
		cliente.setSetorContato(rs.getString("setorContato"));
		
		List<PedidoBean> pedidos = pedidoDAOExt.getPedidosByCliente(rs.getLong("id"));
		cliente.setPedidos(pedidos);
		
		return cliente;
	}

	public void setPedidoDAOExt(PedidoDAOExt pedidoDAOExt) {
		this.pedidoDAOExt = pedidoDAOExt;
	}


}
