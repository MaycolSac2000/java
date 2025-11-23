package com.cmc.servicios;


import java.util.ArrayList;

import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.Prestamo;


public class Banco {

	private ArrayList<Prestamo> prestamos;
	
	private ArrayList<Cliente> clientes;
	
	public Banco(){
		clientes = new ArrayList<Cliente>();
		prestamos = new ArrayList<Prestamo>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	public Cliente buscarCliente(String cedula){
		
		Cliente elementoCliente = null;
		Cliente clienteEncontrado = null;
		
		for(int i=0 ; i<clientes.size();i++) {
			
			elementoCliente = clientes.get(i);
			if(elementoCliente.getCedula().equals(cedula)) {
				
				clienteEncontrado=elementoCliente;
			}
			
		}
		
		return clienteEncontrado;
		
	}
	
	            
	public void registrarCliente(Cliente cliente) {
	
		Cliente elementoCliente =buscarCliente(cliente.getCedula());
		
			if(elementoCliente==null) {
				
				this.clientes.add(cliente);
				
			}else {
			System.out.println("El cliente " +cliente.getCedula() +" ya existe");
			}

	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo){
		
		Cliente elementoCliente=null;
		
		
		for(int i=0; i<clientes.size();i++) {
				
			
			elementoCliente = clientes.get(i);
			if(elementoCliente.getCedula().equals(cedula)) {
				this.prestamos.add(prestamo);
			   elementoCliente.setPrestamo(prestamos);
			}
		}
		
	
		
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente){
		
		Cliente elementoCliente=null;
		
	
		
		for(int i =0 ; i<clientes.size();i++) {
			elementoCliente = clientes.get(i);
			if(elementoCliente.getCedula().equals(cedulaCliente)) {
				return elementoCliente.getPrestamo();
			}else {
				return elementoCliente.getPrestamo();
			}
		}
		return null;

		
	}
	
}
