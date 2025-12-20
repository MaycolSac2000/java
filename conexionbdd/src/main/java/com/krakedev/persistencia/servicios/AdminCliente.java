package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCliente {

private static final Logger LOGGER = LogManager.getLogger(AdminPersona.class);
	
	public static void insertar(Clientes cliente) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cliente a insertar>>> "+cliente);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement("insert into clientes (cedula,nombre,apellido,edad)"
					+ "values(?,?,?,?)");
			ps.setString(1,cliente.getCedula());
			ps.setString(2,cliente.getNombre());
			ps.setString(3,cliente.getApellido());
			ps.setInt(4,cliente.getEdad());
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
	
	public static void actualizar(Clientes cliente) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cliente a actualizar>>> "+cliente);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement( 
					"update clientes set nombre=?,apellido=?,edad=? where cedula=?");
			
			
			ps.setString(1,cliente.getNombre());
			ps.setString(2,cliente.getApellido());
			ps.setInt(3,cliente.getEdad());
			ps.setString(4,cliente.getCedula());
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
	
	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cliente a eliminar persona con cedula:>>> "+cedula);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Delete from clientes where cedula =?");
			
		
			ps.setString(1, cedula);
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
