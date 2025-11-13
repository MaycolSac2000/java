package com.krakedev.test;

import com.krakedev.Cuadrado;

public class testCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(6);
		Cuadrado c3 = new Cuadrado(45);
		
		double areaCuadrado1;
		double areaCuadrado2;
		double areaCuadrado3;
		double perimetroCuadrado1;
		double perimetroCuadrado2;
		double perimetroCuadrado3;
		
		
		/*
		c1.setLado(4);
		c2.setLado(6);
		c3.setLado(45);*/
		
		areaCuadrado1 = c1.calcularArea();
		areaCuadrado2 = c2.calcularArea();
		areaCuadrado3 = c3.calcularArea();
		
		perimetroCuadrado1 = c1.calcularPerimetro();
		perimetroCuadrado2 = c2.calcularPerimetro();
		perimetroCuadrado3 = c3.calcularPerimetro();
		
		System.out.println("Area Cuadrado 1: "+areaCuadrado1);
		System.out.println("Area Cuadrado 2: "+areaCuadrado2);
		System.out.println("Area Cuadrado 3: "+areaCuadrado3);

		System.out.println("Perimetro Cuadrado 1: "+perimetroCuadrado1);
		System.out.println("Perimetro Cuadrado 2: "+perimetroCuadrado2);
		System.out.println("Perimetro Cuadrado 3: "+perimetroCuadrado3);
		
		
		
	}

}
