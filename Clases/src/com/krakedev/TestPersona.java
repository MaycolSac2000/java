package com.krakedev;

/*
 * Se crea comentario
 * */
public class TestPersona {

	public static void main(String[] args) {

		Persona p; // 1. Declaro una variable llamada p de tipo Persona
		p = new Persona(); // 2. Instancio un Objeto Persona

		// 3. Acedo a los atributos de la clase persona

		System.out.println("nombre: " + p.getNombre());

		System.out.println("Edad: " + p.getEdad());

		System.out.println("Estatura: " + p.getEstatura());

		// 4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(15);
		p.setEstatura(1.78);
		
		System.out.println("*****************************");
		System.out.println("nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		
		Persona p2 = new Persona(); // Otra forma de instanciar
		
		p2.setNombre("Manuel");
		p2.setEdad(11);
		p2.setEstatura(1.56);
		
		
		
		System.out.println("*****************************");
		System.out.println("nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());
		
		
				
	}

}
