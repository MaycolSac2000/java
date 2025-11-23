package com.cmc.entidades;

import java.util.ArrayList;

import com.cmc.evaluacion.Prestamo;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Prestamo> prestamo;
	
	
	
	public Cliente(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}



	
	public ArrayList<Prestamo> getPrestamo() {
		return prestamo;
	}




	public void setPrestamo(ArrayList<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}




	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	public void mostrarCliente() {
		
		System.out.println("Cedula: "+cedula+"Nombre: "+nombre +" Apellido: "+apellido);
	}
	
	

}
