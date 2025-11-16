package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.maquinaDulces;

public class TestBuscarProductoNull {

	public static void main(String[] args) {

		maquinaDulces maquina = new maquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Producto prod = maquina.buscarProductoEnCelda("A1");
		/*De aqui para abajo comienza el error :
		 *porque aqui estamos guardando producto en B1 entonces:
		 *al momento de asignar prod estes A1 esta vacio*/
		System.out.println("Producto encontrado:" + prod.getNombre());
		                                           //Por lo cual aqui esta el patron 
												 // prod esta en null y se intenta llamar al metodo get por lo tanto nos da el error
		
		/*Solucion primero asignar un producto a A1 Y luego buscarlo y luego imprimirlo para evitar el error*/
		

	}

}
