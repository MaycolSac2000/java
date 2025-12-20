package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersona {

	
	private static final Logger LOGGER = LogManager.getLogger(AdminPersona.class);
	
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>> "+persona);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas (cedula,nombre,apellido,estado_civil_codigo,estatura,cantidad_ahorrada,numero_hijos,fecha_nacimiento,hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorada());
			ps.setInt(7, persona.getNumeroHijos());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

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
	
	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a actualizar>>> "+persona);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update personas set nombre=?,apellido=?,estado_civil_codigo=?,estatura=?,cantidad_ahorrada=?,numero_hijos=?,fecha_nacimiento=?,hora_nacimiento=? where cedula=?");
			
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setDouble(4, persona.getEstatura());
			ps.setBigDecimal(5, persona.getCantidadAhorada());
			ps.setInt(6, persona.getNumeroHijos());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());
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
		LOGGER.trace("Persona a eliminar persona con cedula:>>> "+cedula);
		try {
			// abrir conexion

			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Delete from personas where cedula =?");
			
		
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
