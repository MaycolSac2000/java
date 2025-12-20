package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReto32 {

	public static void main(String[] args) {
		//Variable de coneccion
		Connection connection = null;
		//Variable para preparar la consulta
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		
		// try and catch de class.forName
		try {
			//Driver de posgresql que se utilizara
			Class.forName("org.postgresql.Driver");
			//A la variable de conexion le asignamos la cadena de conexion de la base de datos
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Maycolsac2000");
			//Mensaje si la conexion fue existosa
			System.out.println("Conexion Exitosa a la bd");
			//
			ps = connection.prepareStatement("insert into clientes (cedula,nombre,apellido,edad)"
					+ "values(?,?,?,?)");
			ps.setString(1,"1109765498");
			ps.setString(2,"Yo");
			ps.setString(3,"yoyo");
			ps.setInt(4,22);
			
			ps2 = connection.prepareStatement("insert into compras (id_compra,cedula,fecha_compra,monto)\r\n"
					+ "values(?,?,?,?)");
			ps2.setInt(1, 11);
			ps2.setString(2, "1109765498");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaCompraStr = "2025/12/18"; 
			
			try {
				Date fechaCompra = sdf.parse(fechaCompraStr);
				
				long fechaCompraMili = fechaCompra.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaCompraMili);
				ps2.setDate(3, fechaSQL);
				ps2.setBigDecimal(4, new BigDecimal(26));
				ps.execute();
				ps2.execute();
				System.out.println("Se insertaron correctamente");
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
