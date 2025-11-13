package com.krakedev;

public class Persona {
	
	private String nombre;
	private int edad;
	private double estatura;

	// un metodo puede tener el mismo nombre pero no puede tener los mismo parametros
	//Aqui hay 3 ejemplos de como se puede utilizar el constructor para setear los atributos
	//Mismo nombre diferente parametro
	public Persona() {
		
		System.out.println("Se ingresa al constructor");
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
			
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	

	
}
