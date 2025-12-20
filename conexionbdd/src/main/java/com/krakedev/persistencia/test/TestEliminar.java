package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersona;

public class TestEliminar {

	public static void main(String[] args) {


		try {
			AdminPersona.eliminar("1712135443");
		} catch (Exception e) {
			
			System.out.println("Error en el sistema "+e);
		}
		

	}

}
