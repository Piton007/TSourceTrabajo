package edu.upc.core.util;

import java.util.ResourceBundle;

public class UtilCore {

	public static String getPropiedad(String clave){
		ResourceBundle rb = ResourceBundle.getBundle("db");
		return rb.getString(clave);
	}
}
