package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Pastillas de varios usos");
		productoA.setPrecio(1.00) ;
		productoA.setStockActual(10);
		
		productoB.setNombre("Tempra");
		productoB.setDescripcion("Medicamento para la temperatura");
		productoB.setPrecio(3.10);
		productoB.setStockActual(20);
		
		productoC.setNombre("Curitas");
		productoC.setDescripcion("Stickers para una herida");
		productoC.setPrecio(0.10);
		productoC.setStockActual(20);
		
		System.out.println("Nombre producto 1: "+productoA.getNombre());
		System.out.println("Descripcion producto 1: "+productoA.getDescripcion());
		System.out.println("Precio producto 1: "+productoA.getPrecio());
		System.out.println("Stock actual producto 1: "+productoA.getStockActual());
		
		System.out.println("Nombre producto 2: "+productoB.getNombre());
		System.out.println("Descripcion producto 2: "+productoB.getDescripcion());
		System.out.println("Precio producto 2: "+productoB.getPrecio());
		System.out.println("Stock actual producto 2: "+productoB.getStockActual());

		System.out.println("Nombre producto 3: "+productoC.getNombre());
		System.out.println("Descripcion producto 3: "+productoC.getDescripcion());
		System.out.println("Precio producto 3: "+productoC.getPrecio());
		System.out.println("Stock actual producto 3: "+productoC.getStockActual());
		
	}

}
