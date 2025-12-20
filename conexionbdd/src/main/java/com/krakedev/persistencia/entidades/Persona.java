package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private double estatura;
	private Date fechaNacimiento;
	private Date horaNacimiento;
	private BigDecimal cantidadAhorada;
	private int numeroHijos;
	private EstadoCivil estadoCivil;
	
	public Persona() {
		
		
	}
	
	
	
	public Persona(String cedula, String nombre, String apellido, double estatura, Date fechaNacimiento,
			Date horaNacimiento, BigDecimal cantidadAhorada, int numeroHijos, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
		this.cantidadAhorada = cantidadAhorada;
		this.numeroHijos = numeroHijos;
		this.estadoCivil = estadoCivil;
	}



	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getHoraNacimiento() {
		return horaNacimiento;
	}

	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}

	public BigDecimal getCantidadAhorada() {
		return cantidadAhorada;
	}

	public void setCantidadAhorada(BigDecimal cantidadAhorada) {
		this.cantidadAhorada = cantidadAhorada;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura
				+ ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento + ", cantidadAhorada="
				+ cantidadAhorada + ", numeroHijos=" + numeroHijos + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
