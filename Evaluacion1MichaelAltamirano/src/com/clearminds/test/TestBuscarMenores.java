package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		
	
		MaquinaDulces maquina = new MaquinaDulces();
		
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("A3"));
		
		maquina.agregarCelda(new Celda("A4"));
		maquina.agregarCelda(new Celda("A5"));
		maquina.agregarCelda(new Celda("A6"));
		
		
		
		
		maquina.cargarProducto(new Producto("PAP12","Papitas",0.85),"A1", 10);
		maquina.cargarProducto(new Producto("DOR1","Doritos",0.5),"A2", 10);
		maquina.cargarProducto(new Producto("JET001","Jet",0.25),"A3", 10);
		maquina.cargarProducto(new Producto("DETO001","DeTodito",0.6),"A4", 10);
		maquina.cargarProducto(new Producto("COCA001","Coca Cola",3),"A5", 10);
		maquina.cargarProducto(new Producto("CHUP001","Chupetes", 2.2),"A6", 10);
		
		
		ArrayList<Producto> prod = maquina.buscarMenores(1);
		
		System.out.println("Productos Menores: "+prod.size());
		
		Producto producto;
		for(int i = 0 ;i<prod.size();i++) {
			producto = prod.get(i); 
			System.out.println("Nombre: "+producto.getNombre()+"\nPrecio: "+producto.getPrecio());
		}
		
		
	}

}
