package com.cmc.evaluacion;

public class Cuota {
	
	private int numero;
	private double cuota;
	private double capitalInicio;

	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		
		this.numero = numero;
		
		
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota=cuota;
	}
	
	public double getCapitalInicio() {
		return capitalInicio;
	}
	public void setCapitalInicio(double capital) {
		this.capitalInicio = capital;
	}

	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mostrarPrestamo() {
		
		Utilitario util = new Utilitario();;
		System.out.println(util.redondear(numero)+"|"+util.redondear(cuota)+"|"+util.redondear(capitalInicio)+"|"+util.redondear(interes)+"|"+util.redondear(abonoCapital)+"|"+util.redondear(saldo) );
	}
	
	
}
