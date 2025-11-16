package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		
		//Aqui ocurre el NullPointerException
		System.out.println(celda.getProducto().getNombre());
							// Aqui esta el patron, tratamos de llamar al metodo getNombre cuando producto esta null
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("Código Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}

}
