package com.cmc.evaluacion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {

	public double redondear(double numeroARedondear) {
		
		BigDecimal numeroDecimal = new BigDecimal(numeroARedondear);
		numeroDecimal = numeroDecimal.setScale(2,RoundingMode.HALF_UP); 
		double numeroConvertido = numeroDecimal.doubleValue();
		
		
		return numeroConvertido;
	}
}
