package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		
		Telefono tel1 = new  Telefono("claro","0957465321",8);
		Telefono tel2 = new  Telefono("claro","0994356723",6);
		Telefono tel3 = new  Telefono("movi","0956745214",7);
		
		AdminTelefono alt = new AdminTelefono();
		
		int movi = alt.contarMovi(tel1, tel2, tel3);
		
		System.out.println("Telefonos Movi totales:"+ movi);
		
		

	}

}
