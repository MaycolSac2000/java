package com.krakedev.coleccones;

import java.util.ArrayList;

public class Eercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> cadenas; //Creamos un array con el nombre cadenas
		String valorRecuperado;
		
		cadenas = new ArrayList<String>(); //Insatanciamos a cadenas
		
		System.out.println(cadenas.size()); // con este metodo vemos el tama;o del array
		
		cadenas.add("uno");
		cadenas.add("dos");
		
		System.out.println(cadenas.size());
		
		valorRecuperado = cadenas.get(1);
		System.out.println(valorRecuperado);
		
		String cadena;
		
		for(int i=0;i<cadenas.size();i++) {
			cadena = cadenas.get(i);
			System.out.println("Cadena: "+cadena);
		}
		
		
		

		
	}

}
