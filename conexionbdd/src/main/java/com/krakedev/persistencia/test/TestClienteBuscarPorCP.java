package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminCliente;

public class TestClienteBuscarPorCP {

	public static void main(String[] args) {
		
		
		try {
			Clientes cli = AdminCliente.buscarPorClavePrimaria("178394309");
			
			System.out.println(cli);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: "+e.getMessage());
		}

	}

}
