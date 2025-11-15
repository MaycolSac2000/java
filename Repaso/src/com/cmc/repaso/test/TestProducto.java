package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto pro1 = new Producto("Chupete",0.15);
		
		pro1.setPrecio(-0.25);
		
		double descuento = pro1.calcularPromo(100);
		
		System.out.println(pro1.getNombre()+" "+pro1.getPrecio()+" "+descuento);

	}

}
