package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
	Auto auto1 = new Auto("DongFeng", 2022,12000.10);
	Auto auto2 = new Auto("Chevrolet",2022,16000.00);
		
	/*auto1.setMarca("Dong Feng");
	auto1.setAnio(2022);
	auto1.setPrecio(12000);
	
	auto2.setMarca("Chevrolet");
	auto2.setAnio(2024);
	auto2.setPrecio(16000);*/
	

	System.out.println("Marca auto 1: "+auto1.getMarca());
	System.out.println("Anio auto 1: "+auto1.getAnio());
	System.out.println("Precio auto 1: "+auto1.getPrecio());
	
	System.out.println("(*****************************************");
	System.out.println("Marca auto 2: "+auto2.getMarca());
	System.out.println("Anio auto 2: "+auto2.getAnio());
	System.out.println("Precio auto 2: "+auto2.getPrecio());
	
	
	}

}
