package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Pastillas de varios usos";
		productoA.precio= 1.00 ;
		productoA.stockActual = 10;
		
		productoB.nombre = "Tempra";
		productoB.descripcion = "Medicamento para la temperatura";
		productoB.precio= 3.10 ;
		productoB.stockActual = 12;
		
		productoC.nombre = "Curitas";
		productoC.descripcion = "Stickers para una herida";
		productoC.precio= 0.10 ;
		productoC.stockActual = 20;
		
		System.out.println("Nombre producto 1: "+productoA.nombre);
		System.out.println("Descripcion producto 1: "+productoA.descripcion);
		System.out.println("Precio producto 1: "+productoA.precio);
		System.out.println("Stock actual producto 1: "+productoA.stockActual);
		
		System.out.println("Nombre producto 2: "+productoB.nombre);
		System.out.println("Descripcion producto 2: "+productoB.descripcion);
		System.out.println("Precio producto 2: "+productoB.precio);
		System.out.println("Stock actual producto 2: "+productoB.stockActual);

		System.out.println("Nombre producto 3: "+productoC.nombre);
		System.out.println("Descripcion producto 3: "+productoC.descripcion);
		System.out.println("Precio producto 3: "+productoC.precio);
		System.out.println("Stock actual producto 3: "+productoC.stockActual);
		
	}

}
