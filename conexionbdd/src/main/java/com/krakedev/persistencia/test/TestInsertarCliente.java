package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminCliente;

public class TestInsertarCliente {

	public static void main(String[] args) {

		

		Clientes c = new Clientes("1712135443", "Julio", "Jaramillo", 44);

		try {
			AdminCliente.insertar(c);
		} catch (Exception e) {
			
			System.out.println("Error en el sistema "+e);
		}
	

	}

}
