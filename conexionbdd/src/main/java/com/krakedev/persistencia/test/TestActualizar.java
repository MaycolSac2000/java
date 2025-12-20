package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
	
	EstadoCivil ec = new EstadoCivil("C","Casado");
		
		Persona p = new Persona("1712135443","JJ","MM",ec);
		
		try {
			Date fechaNac = Convertidor.convertirFecha("2021/01/01");
			Date horaNac = Convertidor.convertirHora("00:00");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorada(new BigDecimal(45.00));
			p.setNumeroHijos(4);
		AdminPersona.actualizar(p);
			
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
	}

}
