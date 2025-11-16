package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		Direccion dir = new Direccion();
		p1.setNombre("Brandon");
		p1.setApellido("Moise");
		
		//Asignamos vvaloores a Direccion
		dir.setCallePrincipal("Av occidental");
		dir.setCalleSecundaria("el parque");
		dir.setNumero("Oe 16-1");
		//Los valores de direccion asignamos a Persona con la variable creada
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		
		//creamos la variable de tipo Direccion y seteamos los valores de direccion Persona con p1 
		Direccion d1 = p1.getDireccion();
		
		;
		
		System.out.println("Nombre: "+nombre);
		// d1 esta null, y trato de invocar a un metodo con esa variable 
		System.out.println("Direccion: "+d1.getCallePrincipal());
			                           //null.algunMetodo(); 
		
		p1.imprimir();
		
		p2.setNombre("Santi");
		p2.setApellido("Morales");
		Direccion d2 = new Direccion("Carolina","Naciones unidas", "S/n");
		
		
		p2.setDireccion(d2);
		
		
		p2.imprimir();
		
		Persona p3 = new Persona();
		
		p3.setDireccion(new Direccion("Pin","Pon","S21"));
		p3.imprimir();
		
		
		

	}

}
