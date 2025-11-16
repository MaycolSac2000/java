package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono tel = new Telefono("movi","0976543876",90);
		Contacto c = new Contacto("Manuel", "Iza",tel,110);
		System.out.println("Nombre: "+c.getNombre()+" Apellido: "+c.getApellido()+" Telefono: "+c.getTelefono().getOperadora()+" Numero: "+c.getTelefono().getNumero()+"Tiene Whatsapp: "+c.getTelefono().getTieneWhatsapp());
		System.out.println("Activar usuario");
		AdminContactos admincon = new AdminContactos();
		admincon.activarUsuario(c);
		
		System.out.println("Nombre: "+c.getNombre()+" Apellido: "+c.getApellido()+" Telefono: "+c.getTelefono().getOperadora()+" Numero: "+c.getTelefono().getNumero()+"Tiene Whatsapp: "+c.getTelefono().getTieneWhatsapp()+" Usuario Activo: "+c.getActivo());
		
		AdminTelefono admintel = new AdminTelefono();
		
		System.out.println("Activar usuario");
		admintel.activarMensajeria(c.getTelefono());
		admincon.activarUsuario(c);
		
		System.out.println("Nombre: "+c.getNombre()+" Apellido: "+c.getApellido()+" Telefono: "+c.getTelefono().getOperadora()+" Numero: "+c.getTelefono().getNumero()+"Tiene Whatsapp: "+c.getTelefono().getTieneWhatsapp()+" Usuario Activo: "+c.getActivo());
		
		
		
	}

}
