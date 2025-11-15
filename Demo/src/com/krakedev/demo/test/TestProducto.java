package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pro1 = new Producto(1,"Arroz");
		pro1.setDescripcion("Carbohidrato");
		pro1.setPeso(1.7);
		
		System.out.println("Codigo: "+pro1.getCodigo());
		System.out.println("Nombre: "+pro1.getNombre());
		System.out.println("Descripcion: "+pro1.getDescripcion());
		System.out.println("Peso: "+pro1.getPeso());

	}

}
