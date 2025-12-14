package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiaSemana;

public class TestAlarmas {

	
	public static void main(String[] args) {
		
		Alarma a1 = new Alarma(DiaSemana.LUNES, 3, 02);
		Alarma a2 = new Alarma(DiaSemana.DOMINGO, 10, 0);
		Alarma a3 = new Alarma(DiaSemana.MARTES, 11, 0);
		
		AdminAlarmas  admin = new AdminAlarmas();
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		
		System.out.println(alarmasActuales);
	
		
		
		
		
		
		
		
	}
}
