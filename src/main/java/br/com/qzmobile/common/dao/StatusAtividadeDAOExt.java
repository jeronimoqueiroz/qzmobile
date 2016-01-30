package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import org.springframework.stereotype.Repository;
import br.com.qzmobile.common.bean.StatusAtividadeBean;


@Repository("statusAtividadeDAOExt")
public class StatusAtividadeDAOExt extends StatusAtividadeDAO {
	
	private static final String GET_STATUS_DESCRICAO = "SELECT * FROM STATUS_ATIVIDADE where nm_status = ? ";
	

	   public StatusAtividadeBean getStatusPorDescricao(String descricao) throws SQLException{
	    	
	    	return this.getRecord(GET_STATUS_DESCRICAO, new Object[]{descricao});
	    }

}
