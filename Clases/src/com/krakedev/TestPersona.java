package com.krakedev;

/*
 * Se crea comentario
 * */
public class TestPersona {

	public static void main(String[] args) {

		Persona p; // 1. Declaro una variable llamada p de tipo Persona
		p = new Persona(); // 2. Instancio un Objeto Persona

		// 3. Acedo a los atributos de la clase persona

		System.out.println("nombre: " + p.nombre);

		System.out.println("Edad: " + p.edad);

		System.out.println("Estatura: " + p.estatura);

		// 4. Modificar los atributos
		p.nombre = "Mario";
		p.edad = 15;
		p.estatura = 1.78;
		
		System.out.println("*****************************");
		System.out.println("nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		
		Persona p2 = new Persona(); // Otra forma de instanciar
		
		p2.nombre = "Manuel";
		p2.edad = 11;
		p2.estatura = 1.56;
		
		System.out.println("*****************************");
		System.out.println("nombre: " + p2.nombre);
		System.out.println("Edad: " + p2.edad);
		System.out.println("Estatura: " + p2.estatura);
		
		
				
	}

}
