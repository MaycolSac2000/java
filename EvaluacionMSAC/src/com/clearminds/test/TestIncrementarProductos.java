package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.maquinaDulces;

public class TestIncrementarProductos {

	public static void main(String[] args) {
		maquinaDulces maquina=new maquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		maquina.mostrarProductos();
		
		maquina.incrementarProductos("KE34", 8);
		
		System.out.println("------------LUEGO DEL INCREMENTO-------------");
		
		maquina.mostrarProductos();
	}

}
