package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicios.AdminCompras;
import com.krakedev.persistencia.utils.Convertidor;

public class TestCompraInsertar {

	public static void main(String[] args) {

		Clientes cli = new Clientes("1109765498");

		

		try {
			Date fechaCompra = Convertidor.convertirFecha("2025/01/01");
			Compras c = new Compras(12,cli,fechaCompra,65.9);
			
			AdminCompras.insertar(c);

		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
