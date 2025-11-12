package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
	Auto auto1 = new Auto();
	Auto auto2 = new Auto();
		
	auto1.marca = "Dong Feng";
	auto1.anio = 2022;
	auto1.precio = 12000;
	
	auto2.marca = "Chevrolet";
	auto2.anio = 2024;
	auto2.precio = 16000;

	System.out.println("Marca auto 1: "+auto1.marca);
	System.out.println("Anio auto 1: "+auto1.anio);
	System.out.println("Precio auto 1: "+auto1.precio);
	
	System.out.println("(*****************************************");
	System.out.println("Marca auto 2: "+auto2.marca);
	System.out.println("Anio auto 2: "+auto2.anio);
	System.out.println("Precio auto 2: "+auto2.precio);
	
	
	}

}
