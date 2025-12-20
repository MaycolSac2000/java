package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicios.AdminCompras;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarCompra {

	public static void main(String[] args) {

		Clientes cli = new Clientes("1109765498");
		try {
			Date fechaCompra = Convertidor.convertirFecha("2000/01/01");
			Compras c = new Compras();
			c.setClientes(cli);
			c.setFechaCompra(fechaCompra);
			c.setMonto(78);

			AdminCompras.actualizar(c);

		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
