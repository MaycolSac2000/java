package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
		    

	        // Crear una instancia de Contacto
	        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");

	        // Settear la dirección
	        Direccion Direccion = new Direccion("Av. siempre Viva", "Calle 4");
	        contacto.setDireccion(Direccion);

	        // Mostrar información 
	        System.out.println("\nInformación del Contacto:");
	        contacto.imprimir();
	        System.out.println("");
	        System.out.println("Informacion del Contacto (actualizada)");
	        contacto.setCedula("9876543210");
	        contacto.setNombre("Ana");
	        contacto.setApellido("Gomez");
	        contacto.setDireccion(new Direccion("Cdl del ejercito", "Pasaje 2B"));
	        
	        contacto.imprimir();
	}

}
