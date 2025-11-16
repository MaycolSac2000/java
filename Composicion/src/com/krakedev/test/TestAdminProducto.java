package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		
		Producto mc;
		Producto p1 = new Producto("Cola",0.60); 
		Producto p2 = new Producto("Papa",0.60);
		
		AdminProducto admin = new AdminProducto();
		mc = admin.productoMasCaro(p1, p2);
		
		if(mc != null) {
			System.out.println("El mas caro es: "+mc.getNombre());
		}else {
			System.out.println("Los productos son igualess");
		}
		
		
		
		
		
	}

}
