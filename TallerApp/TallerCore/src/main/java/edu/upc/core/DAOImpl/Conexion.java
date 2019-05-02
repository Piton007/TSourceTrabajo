package edu.upc.core.DAOImpl;
import static edu.upc.core.Util.UtilCore.getPropiedad;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public static Connection getConexion() throws Exception{
		Class.forName(getPropiedad("conexion.jdbc"));
		return (DriverManager.getConnection(getPropiedad("conexion.url"),
											getPropiedad("conexion.user"),
											getPropiedad("conexion.password")));
	}
}
