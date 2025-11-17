package com.krakedev.coleccones;

import java.util.ArrayList;

public class TestAdminPersona {

	public static void main(String[] args) {

		AdminPersona admin = new AdminPersona();
		//Se puede agregar asii
		Persona persona = new Persona("Michael","Morales",23);
		admin.agregar(persona);
		//o Asi las dos funcionan pero esta es mas optimizada
		admin.agregar(new Persona("Nnia","Ola",34));
		admin.agregar(new Persona("Julia","Manzano",9));
		
		admin.imprimir();
		
		Persona p1 = admin.buscarPorNombre("n");
		
		if(p1!=null) {
			System.out.println("Persona Encontrada: "+p1.getApellido()+p1.getEdad());
		}else {
			System.out.println("Persona no encontrada");
		}
		
		ArrayList<Persona> mayores = admin.buscarMayores(30);
		
		System.out.println("Personas Mayores: "+mayores.size());
		
		
	}

}
