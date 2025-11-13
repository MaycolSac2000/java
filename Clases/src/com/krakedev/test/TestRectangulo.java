package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int area1;
		double perimetro1;
		
		
		int area2;
		double perimetro2;
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8); 
		r2.setAltura(3);
		
		area1 = r1.calcularArea();
		perimetro1 = r1.calcularPerimetro(); 
		
		area2 = r2.calcularArea();
		perimetro2 = r2.calcularPerimetro();
		 
		System.out.println("Area de r1: "+area1);
		System.out.println("Perimetro de r1: "+perimetro1);
		
		System.out.println("Area de r2: "+area2);
		System.out.println("Perimetro de r2: "+perimetro2);
		
		

	}

}
