package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ConexionBDD {

	private static final String DRIVE="org.postgresql.Driver"; 
	private static final String URL="jdbc:postgresql://localhost:5432/postgres";
	private static final String USUARIO="postgres" ;
	private static final String CLAVE = "Maycolsac2000";
	//Para saber en que clase sale el error
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception{
		
		Connection connection = null;
		try {
			Class.forName(DRIVE);
			connection = DriverManager.getConnection(URL,USUARIO,CLAVE);
			LOGGER.debug("Conexion Exitosa");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Erorr en la infraestructura",e );
			throw new Exception("Error en la infraestructura");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			LOGGER.error("Error al conectarse revise usuario y clave",e);
			throw new Exception("Error al conectarse revise usuario y clave");
		}
		
		return connection;
		
	}
	
	
	
}
