package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement ps;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Maycolsac2000");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement("insert into personas (cedula,nombre,apellido,estado_civil_codigo,estatura,cantidad_ahorrada,numero_hijos,fecha_nacimiento,hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,"1712131365");
			ps.setString(2,"Mimi");
			ps.setString(3, "Alomoto");
			ps.setString(4, "C");
			ps.setDouble(5, 1.90);
			ps.setBigDecimal(6, new BigDecimal(8000.35));
			ps.setInt(7, 0);
			
		

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

			String fechaStr = "2020/03/22 10:05:04";
			
			try {
				
				//java.util.Date
				Date fecha =  sdf.parse(fechaStr);
				System.out.println(fecha);
				
				//Expresar en milisegundos
				//nuevo tipo de dato long permite para mayor capacidad enteros largos
				long fechaMili =fecha.getTime();
				System.out.println(fechaMili);
				//Crear un java.sql.Date , partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMili);
				
				System.out.println(fechaSQL);
				//java.sql.Time time obtenemos la hora apartir de una fechamilisegundos 
				Time timeSQL = new Time(fechaMili);
				System.out.println(timeSQL);
				ps.setDate(8,fechaSQL);
				ps.setTime(9, timeSQL);
				
				ps.executeUpdate();
				System.out.println("Se agrego correctamente");
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
