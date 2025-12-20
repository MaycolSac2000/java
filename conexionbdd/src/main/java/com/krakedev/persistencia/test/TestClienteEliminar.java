package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminCliente;

public class TestClienteEliminar {

	public static void main(String[] args) {

		try {
			AdminCliente.eliminar("1712135443");
		} catch (Exception e) {

			System.out.println("Error en el sistema " + e);
		}

	}

}
