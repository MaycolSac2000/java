package com.krakedev.coleccones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList <Persona> personas;
		personas = new ArrayList<Persona>();
		
		//podemos agregar de dos formas
		Persona p1 = new Persona("Michael","Altamirano");
		personas.add(p1);
		
		//o mandamos directo
		personas.add(new Persona("Leo","Messi"));
		personas.add(new Persona("Cristiano","Ronaldo"));
		
		
		Persona elementoPersona;
		for(int i=0; i<personas.size();i++) {
			
			elementoPersona = personas.get(i);
			System.out.println("Persona: "+elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
		
		
		

	}

}
