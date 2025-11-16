package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("movi","0953675421",10);
		Contacto c = new Contacto("Michael","Altamirano",telef,110);
		Telefono telef1 = new Telefono("movi","097564321786",11);
		Contacto c2 = new Contacto("Brayan","Sanson",telef1,111);
		
		AdminContactos admincon = new AdminContactos();
		
		System.out.println("Nombre: "+c2.getNombre()+" Apellido: "+c2.getApellido()+" Telefono: "+c2.getTelefono().getOperadora()+" Numero: "+c2.getTelefono().getNumero());
		System.out.println("Nombre: "+c.getNombre()+" Apellido: "+c.getApellido()+" Telefono: "+c.getTelefono().getOperadora()+" Numero: "+c.getTelefono().getNumero());
		
		Contacto pesado = admincon.buscarMasPesado(c, c2);
		
		if(pesado==null) {
			System.out.println("Mas pesado");
			System.out.println("Son de igual peso");
			
		}else {
			System.out.println("Mas pesado");
			System.out.println("Nombre: "+pesado.getNombre()+" Apellido: "+pesado.getApellido()+" Telefono: "+pesado.getTelefono().getOperadora()+" Numero: "+pesado.getTelefono().getNumero()+"Peso: "+pesado.getPeso());
		}
		
		boolean operadorasIguales =admincon.compararOperadora(c, c2);
		
		if(operadorasIguales) {
			
			System.out.println("Son igual operadores");
		}else {
			System.out.println("Son de diferente operadora");
		}
		

	}

}
