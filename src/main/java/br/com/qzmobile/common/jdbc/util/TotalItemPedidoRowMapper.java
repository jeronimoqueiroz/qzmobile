package br.com.qzmobile.common.jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.qzmobile.common.util.TotalItemPedidoVO;

public class TotalItemPedidoRowMapper implements RowMapper<TotalItemPedidoVO> {

	
	@Override
	public TotalItemPedidoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		TotalItemPedidoVO total = new TotalItemPedidoVO();
		total.setNmProduto(rs.getString("NM_PRODUTO"));
		total.setTotal(rs.getLong("TOTAL"));
		
		return total;
	}

	
}
