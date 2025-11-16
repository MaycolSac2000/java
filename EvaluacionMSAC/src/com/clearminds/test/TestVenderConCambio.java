package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.maquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		
		maquinaDulces maquina=new maquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		maquina.vender("B1");
		double cambio=maquina.venderConCambio("B1",1);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);

	}

}
