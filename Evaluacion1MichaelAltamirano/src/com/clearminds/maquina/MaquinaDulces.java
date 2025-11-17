package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void agregarCelda(Celda celda) {
	
		celdas.add(new Celda(celda.getCodigo()));
		
	}
	
	public void mostrarConfiguracion() {
		
		Celda elementoCelda = null;
		for(int i=0 ;i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda "+ (i+1)+":"+elementoCelda.getCodigo());
			
		}
		
		
	}
	
	public Celda buscarCelda(String codigoCelda) {
		
		Celda celdaEncontrada = null;
		Celda elementoCelda= null;
		for(int i=0;i<celdas.size();i++) {
			
			elementoCelda = celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
			
		}
		
		return celdaEncontrada;
	}
	
	public void cargarProducto(Producto producto, String codigocelda, int items) {
		Celda celdaRecuperada = buscarCelda(codigocelda);

		celdaRecuperada.ingresarProducto(producto, items);

	}
	
	public void mostrarProductos() {
		
		
		Celda elementoCelda= null;
		for(int i=0; i<celdas.size();i++) {
			
			elementoCelda = celdas.get(i);
			if(elementoCelda.getProducto()== null) {
				System.out.println("********CELDA "+elementoCelda.getCodigo());
				System.out.println("Stock: " + elementoCelda.getStock());
				System.out.println("Sin producto asignado");
			}else {
				System.out.println("********CELDA "+elementoCelda.getCodigo());
				System.out.println("Stock:" + elementoCelda.getStock() + "\nProducto: " + elementoCelda.getProducto().getCodigo()
						+ "\nPrecio: " + elementoCelda.getProducto().getPrecio());
			}
		}
		
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Producto productoEncontrada = null;
		Celda elementoCelda= null;
		for(int i = 0 ;i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				productoEncontrada = elementoCelda.getProducto();
			}
		}
		
		return productoEncontrada;
	}
	
	public double consultarPrecio(String codigoCelda) {
		
		double precioProducto=0;
		Celda elementoCelda;
		for(int i=0 ; i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				precioProducto= elementoCelda.getProducto().getPrecio();
			}
		}
		
		return precioProducto;
		
	}
	public Celda buscarCeldaProducto(String codigoProducto) {

		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for(int i = 0 ;i<celdas.size();i ++) {
			elementoCelda = celdas.get(i);
			if(elementoCelda.getProducto()!= null) {
				if(codigoProducto.equals(elementoCelda.getProducto().getCodigo())) {
					celdaEncontrada = elementoCelda;
				}
			}
		}
		
		return celdaEncontrada;
		 
		
	}
	
	public void incrementarProductos(String codigoProducto, int cantidadIncremento) {

		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidadIncremento);
	}
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		int valor = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(valor);
		double precioProducto = celdaEncontrada.getProducto().getPrecio();
		this.saldo = saldo + precioProducto;

		mostrarProductos();
		System.out.println("Saldo: "+getSaldo());

	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {

		Celda celdaEncontrada = buscarCelda(codigoCelda);
		int valor = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(valor);
		double cambio = valorIngresado - celdaEncontrada.getProducto().getPrecio();
		this.saldo = valorIngresado - cambio;
		return cambio;

	}
	
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda elementoCelda = null;
		
		for(int i=0 ;i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			if(elementoCelda.getProducto().getPrecio()<=limite) {
				menores.add(elementoCelda.getProducto());
			}
			
		}
		return menores;
		
	}
	
}
