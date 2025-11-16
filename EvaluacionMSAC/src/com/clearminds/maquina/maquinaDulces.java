package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class maquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {

		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);

	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {

		if (codigo == celda1.getCodigo()) {
			return celda1;
		} else if (codigo == celda2.getCodigo()) {
			return celda2;
		} else if (codigo == celda3.getCodigo()) {
			return celda3;
		} else if (codigo == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigocelda, int stock) {
		Celda celdaRecuperada = buscarCelda(codigocelda);

		celdaRecuperada.ingresarProducto(producto, stock);

	}

	public void mostrarProductos() {

		if (celda1.getProducto() == null) {
			System.out.println("********CELDA A1");
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene producto!!");
		} else {
			System.out.println("********CELDA A1");
			System.out.println("Stock:" + celda1.getStock() + "\nNombre Producto: " + celda1.getProducto().getNombre()
					+ "\nPrecio Producto: " + celda1.getProducto().getPrecio() + "\nCodigo Producto:"
					+ celda1.getProducto().getCodigo());
		}

		if (celda2.getProducto() == null) {
			System.out.println("********CELDA A2");
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene producto!!");
		} else {
			System.out.println("********CELDA A2");
			System.out.println("Stock:" + celda2.getStock() + "\nNombre Producto: " + celda2.getProducto().getNombre()
					+ "\nPrecio Producto: " + celda2.getProducto().getPrecio() + "\nCodigo Producto:"
					+ celda2.getProducto().getCodigo());
		}
		if (celda3.getProducto() == null) {
			System.out.println("********CELDA B1");
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene producto!!");
		} else {
			System.out.println("********CELDA B1");
			System.out.println("Stock:" + celda3.getStock() + "\nNombre Producto: " + celda3.getProducto().getNombre()
					+ "\nPrecio Producto: " + celda3.getProducto().getPrecio() + "\nCodigo Producto:"
					+ celda3.getProducto().getCodigo());
		}
		if (celda4.getProducto() == null) {
			System.out.println("********CELDA B2");
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene producto!!");
		} else {
			System.out.println("********CELDA B2");
			System.out.println("Stock:" + celda4.getStock() + "\nNombre Producto: " + celda4.getProducto().getNombre()
					+ "\nPrecio Producto: " + celda4.getProducto().getPrecio() + "\nCodigo Producto:"
					+ celda4.getProducto().getCodigo());
		}

	}

	public Producto buscarProductoEnCelda(String codigo) {

		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigo == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigo == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigo == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}

	}

	public double consultarPrecio(String codigo) {

		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigo == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigo == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigo == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {

		 if(celda1.getProducto()==null) {
		
			 if(celda2.getProducto()==null) {
				 
				 if(celda3.getProducto() == null) {
					 if(celda4.getProducto() == null) {
						 return null;
						 
					 }else if(celda4.getProducto().getCodigo()== codigo) {
						 return celda4;
					 }else {
						 return null;
					 }
					 
					 
				 }else if(celda3.getProducto().getCodigo()== codigo){
					 return celda3;
				 }else {
					 return null;
				 }
				 
			 }else if(celda1.getProducto().getCodigo()== codigo) {
				 
				 return celda2;
			 }else {
				 return null;
			 }

		 }else if(celda1.getProducto().getCodigo()== codigo) {
			 
			 return celda1;
		 }else {
			 return null;
		 }
		
		
	}

	public void incrementarProductos(String codigoProducto, int cantidadIncremento) {

		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidadIncremento);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int valor = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(valor);
		double precioProducto = celdaEncontrada.getProducto().getPrecio();
		this.saldo = saldo + precioProducto;

		mostrarProductos();
		System.out.println("Saldo: "+getSaldo());

	}

	public double venderConCambio(String codigo, double valorIngresado) {

		Celda celdaEncontrada = buscarCelda(codigo);
		int valor = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(valor);
		double cambio = valorIngresado - celdaEncontrada.getProducto().getPrecio();
		this.saldo = saldo - cambio;
		return cambio;

	}
}
