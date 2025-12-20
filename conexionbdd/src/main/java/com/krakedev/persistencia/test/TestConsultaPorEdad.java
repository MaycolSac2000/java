package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminCliente;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestConsultaPorEdad {

	public static void main(String[] args) {


			
		try {
			ArrayList<Clientes> clientes =  AdminCliente.buscarPorEdad(40);
			System.out.println(clientes);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: "+e.getMessage());
		}


	}

}
