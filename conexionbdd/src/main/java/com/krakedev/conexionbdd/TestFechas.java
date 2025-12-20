package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		
		//Date - java.util.Date
		//Date - java.sql.Date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd hh:mm:ss");

		String fechaStr = "2020/03/22 10:05:04";
		
		try {
			
			//java.util.Date
			Date fecha =  sdf.parse(fechaStr);
			System.out.println(fecha);
			
			//Expresar en milisegundos
			//nuevo tipo de dato long permite para mayor capacidad enteros largos
			long fechaMili =fecha.getTime();
			System.out.println(fechaMili);
			//JAVA sql dat , partiendo de un java.util.Date
			java.sql.Date fechaSQL = new java.sql.Date(fechaMili);
			
			System.out.println(fechaSQL);
			
			Time timeSQL = new Time(fechaMili);
			System.out.println(timeSQL);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
