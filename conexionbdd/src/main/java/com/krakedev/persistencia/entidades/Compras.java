package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Compras {
			
	private int id_compra;
	private Clientes clientes;
	private Date fechaCompra;
	private double monto;
	
	public Compras() {
		
	}
	
	
	public Compras(int id_compra, Clientes cliente, Date fechaCompra, double monto) {
		super();
		this.id_compra = id_compra;
		this.clientes = cliente;
		this.fechaCompra = fechaCompra;
		this.monto = monto;
	}
	public int getId_compra() {
		return id_compra;
	}
	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}
	public Clientes getClientes() {
		return clientes;
	}
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Compras [id_compra=" + id_compra + ", clientes=" + clientes + ", fechaCompra=" + fechaCompra
				+ ", monto=" + monto + "]";
	}
	
	
	
	
}
