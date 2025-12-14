package com.krakedev.estaticos;

public class Calculos {

	
	//final hace que el valor no se pueda cambiar, es decir covierte la variable en constante
	private final double iva = 12;
	
	public double calcularIva(double monto) {
		
		
		return monto*iva/100;
		
	}
	
	
}
