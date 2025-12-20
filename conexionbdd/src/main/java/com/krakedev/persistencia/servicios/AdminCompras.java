package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCompras {
	
	
private static final Logger LOGGER = LogManager.getLogger(AdminPersona.class);
	
	public static void insertar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Compra a insertar>>> "+compra);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement("insert into compras (id_compra,cedula,fecha_compra,monto)"
					+ "values(?,?,?,?)");
			ps.setInt(1,compra.getId_compra());
			ps.setString(2,compra.getClientes().getCedula());
			ps.setDate(3, new java.sql.Date(compra.getFechaCompra().getTime()));
			ps.setDouble(4,compra.getMonto());
			ps.executeUpdate();

		} catch (Exception e) {

			// Logear el error con log4j
			LOGGER.error("Error al insertar",e);
			// Mostrar el error al usuario
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base d edatos");

				// System.out.println("Error de infraestructura");

			}

		}

	}
	
	public static void actualizar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Compra a actualizar>>> "+compra);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement( 
					"update compras set fecha_compra=?,monto=? where cedula=?");
			
			
			ps.setDate(1,new java.sql.Date(compra.getFechaCompra().getTime()));
			ps.setDouble(2,compra.getMonto());
			ps.setString(3, compra.getClientes().getCedula());
			ps.executeUpdate();

		} catch (Exception e) {

			// Logear el error con log4j
			LOGGER.error("Error al actualizar",e);
			// Mostrar el error al usuario
			throw new Exception("Error al actualizar");
		} finally {
			// cerrar la conexion

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");

				// System.out.println("Error de infraestructura");

			}

		}

	}
	
	public static void eliminar(int id) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cliente a eliminar persona con cedula:>>> "+id);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Delete from compras where id_compra =?");
			
		
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {

			// Logear el error con log4j
			LOGGER.error("Error al eliminar",e);
			// Mostrar el error al usuario
			throw new Exception("Error al eliminar");
		} finally {
			// cerrar la conexion

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");

				// System.out.println("Error de infraestructura");

			}

		}

	}

}
