package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminCliente;

public class TestActualizarCliente {

	public static void main(String[] args) {
		
		Clientes c = new Clientes("1712135443", "jj", "f", 10);

		try {
			AdminCliente.actualizar(c);
		} catch (Exception e) {
			
			System.out.println("Error en el sistema "+e);
		}
	

	}

}
