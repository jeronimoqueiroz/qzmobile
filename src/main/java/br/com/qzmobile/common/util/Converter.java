package br.com.qzmobile.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Converter {

	// =======================================================================
	// # Arrays - Lists #
	// =======================================================================

	public static String arrayToString(String[] array, String separator){

		StringBuilder result = new StringBuilder();
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				if (i != 0) {
					result.append(separator);
				}
				result.append(array[i]);
			}
		}
		return result.toString();
	}
	
	// -----------------------------------------------------------------------

	public static Integer[] stringArrayToIntArray(String[] sArray) throws Exception {
		if (sArray == null) return null;
		Integer intArray[] = new Integer[sArray.length];
		for (int i = 0; i < sArray.length; i++) {
			intArray[i] = Integer.parseInt(sArray[i]);
		}
		return intArray;
	}	

	// -----------------------------------------------------------------------
	
	public static String listToString(List<String> list, String separator){

		StringBuilder result = new StringBuilder();
		if (list.size() > 0) {
			for (String element : list) {
				if (result.length() > 0) {
					result.append(separator);
				}
				result.append(element);
			}
		}
		return result.toString();
	}

	// -----------------------------------------------------------------------
	
	public static String listToSqlInString(List<String> list){

		StringBuilder result = new StringBuilder();
		if (list.size() > 0) {
			for (String element : list) {
				if (result.length() > 0) {
					result.append(",");
				}
				result.append("'"+element+"'");
			}
		}
		return result.toString();
	}

	// -----------------------------------------------------------------------
	
	
	// =======================================================================
	// # Datas #
	// =======================================================================
	
	public static String millisecsToString(long millisecs){

		Date date = new Date(millisecs);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formatter.format(date);
	}
	
	// -----------------------------------------------------------------------

	public static String dateToStamp(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		return formatter.format(date);
	}

	// -----------------------------------------------------------------------

	public static long dateDiff(Date initDate, Date finalDate){
		return finalDate.getTime() - initDate.getTime();
	}
	
	// -----------------------------------------------------------------------

	public static int millisecsToDays(long millisecs){
		return (int) (millisecs / (1000 * 3600 * 24));
	}

}
