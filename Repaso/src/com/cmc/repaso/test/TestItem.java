package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
	
		Item item = new Item();
		Item item2 = new Item();
		
		item.setNombre("Papas");
		item.setProductosActuales(20);
		item2.setNombre("Colas");
		item2.setProductosActuales(23);
		
		item.imprimir();
		System.out.println("-------------------------------------");
		item.vender(5);
		item.imprimir();
		System.out.println("-------------------------------------");

		item.vender(5);
		item.imprimir();
		System.out.println("-------------------------------------");
		
		item.devolver(10);
		item.imprimir();
		System.out.println("-------------------------------------");
		System.out.println("---------Producto2");
		item.imprimir();
		System.out.println("-------------------------------------");
		item2.vender(23);
		item2.imprimir();
		System.out.println("-------------------------------------");
		item2.devolver(20);
		item2.imprimir();
		System.out.println("-------------------------------------");
		
		
	}

}
