package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
	
		Validacion val = new Validacion();
		
		val.validarMonto(10);
		val.validarMonto(-1);
		
		
		
	}

}
