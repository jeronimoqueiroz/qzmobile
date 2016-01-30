package br.com.qzmobile.common.util;

import java.util.List;

public class StringUtils {
	
	private static final String BLANK = " ";
	private static final String COMA = ",";
	private static final String BIND = " = ? ";
	public static String buildArray2String(List<String> itens){
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < itens.size(); i++) {
			String column = itens.get(i);
			if((i +1) == itens.size()){
				buffer.append(BLANK).append(column);
			}else{
				buffer.append(BLANK).append(column+COMA);
			}
		}
		return buffer.toString();
	}
	
	
	public static String buildUpdateArray2String(List<String> itens){
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < itens.size(); i++) {
			String column = itens.get(i);
			if((i +1) == itens.size()){
				buffer.append(BLANK).append(column).append(BIND);
			}else{
				buffer.append(BLANK).append(column).append(BIND).append(COMA);
			}
		}
		return buffer.toString();
	}
	
	
	public static String buildRepetir(String repetir,int numeroVezes){
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < numeroVezes; i++) {
			if((i +1) == numeroVezes){
				buffer.append(repetir);
			}else{
				buffer.append(repetir+COMA);
			}
		}
		return buffer.toString();
	}
	

}
