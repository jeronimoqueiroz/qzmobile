package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.FuncionarioBean;


@Repository("funcionarioDAOExt")
public class FuncionarioDAOExt extends FuncionarioDAO {

	private static final String GET_ALL_BY_FILIAL =
			"SELECT * " +
			"FROM FUNCIONARIO " + 
			"WHERE ID_FILIAL = ? " ;
	
	
	private static final String GET_ALL_BY_FILIAL_SETOR =
			"SELECT * " +
			"FROM FUNCIONARIO " + 
			"WHERE ID_FILIAL = ? " +
			"AND ID_SETOR = ? " ;
	// -------------------------------------------------------------------------------------
	
	
	   public List<FuncionarioBean> getAllByFilial(long idFilial) throws SQLException{
	    	
	    	return this.getRecordList(GET_ALL_BY_FILIAL, new Object[]{idFilial});
	    }
	   
	   public List<FuncionarioBean> getAllByFilialSetor(long idFilial, long idSetor) throws SQLException{
	    	
	    	return this.getRecordList(GET_ALL_BY_FILIAL_SETOR, new Object[]{idFilial, idSetor});
	    }
		
}
