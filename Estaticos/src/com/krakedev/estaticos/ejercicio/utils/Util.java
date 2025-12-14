package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int hora) {
		String texto;

		if (hora >= 0 && hora < 10) {
			texto = "0" + Integer.toString(hora);
		} else {
			texto = Integer.toString(hora);
		}

		return texto;
	}

	public static String formatearDia(int dia) {

		String diaTexto;
		switch (dia) {
		case 0: {

			return diaTexto = "Lunes";
		}
		case 1: {

			return diaTexto = "Martes";
		}
		case 2: {

			return diaTexto = "Miercoles";
		}
		case 3: {

			return diaTexto = "Jueves";
		}
		case 4: {

			return diaTexto = "Viernes";
		}
		case 5: {

			return diaTexto = "Sabado";
		}
		case 6: {

			return diaTexto = "Domingo";
		}

		default:
			return "No se encontro dia";
		}
	}

}
