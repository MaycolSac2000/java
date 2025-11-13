package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {

		Calculadora calcu = new Calculadora();

		int resultadoSuma = calcu.sumar(5, 8);
		int resultadoResta = calcu.restar(5, 2);
		double resultadoMulti = calcu.multiplicar(10, 5);
		double resultadoDivision = calcu.dividir(10, 2);
		double resultadoPromedio = calcu.promediar(10,8 ,9 );
		
		System.out.println("Resultado Suma: " + resultadoSuma);
		System.out.println("Resultado Resta: " + resultadoResta);
		System.out.println("Resultado Multiplicacion: " + resultadoMulti);
		System.out.println("Resultado Division: " + resultadoDivision);
		System.out.println("Resultado Promedio: " +resultadoPromedio );
		calcu.mostrarResultado();
		
	}

}
