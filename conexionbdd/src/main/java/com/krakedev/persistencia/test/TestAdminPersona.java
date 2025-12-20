package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;
import com.krakedev.persistencia.utils.Convertidor;

//System.out.println solo se va a poder usa en los tests

public class TestAdminPersona {

	public static void main(String[] args) {

		EstadoCivil ec = new EstadoCivil("U","Union Libre");
		
		Persona p = new Persona("1712135443","Julio","Jaramillo",ec);
		
		try {
			Date fechaNac = Convertidor.convertirFecha("2020/02/01");
			Date horaNac = Convertidor.convertirHora("06:00");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorada(new BigDecimal(8974.00));
			p.setNumeroHijos(4);
		AdminPersona.insertar(p);
		
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
		
		
	
		
		
		
		
	}

}
