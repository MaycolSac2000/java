package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	public Juego() {

	}

	public Juego(ArrayList<String> ids) {

		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		;

		for (int i = 0; i < ids.size(); i++) {
			ArrayList<Carta> cartasJugador = new ArrayList<Carta>();
			cartasJugadores.add(cartasJugador);
		}
		naipe = new Naipe();

		this.naipeBarajado = naipe.barajar();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {

		int cartaAEntregar = 0;
		Carta cartaSeleccionada;

		ArrayList<Carta> jugadorCartas = new ArrayList<Carta>();
		for (int i = 0; i <= cartasPorJugador; i++) {
			for (int j = 0; j < cartasJugadores.size(); j++) {
				jugadorCartas = cartasJugadores.get(j);
				cartaSeleccionada = naipeBarajado.get(cartaAEntregar);
				jugadorCartas.add(cartaSeleccionada);

				cartaAEntregar = cartaAEntregar + 1;

			}

		}
	}

	public int devolverTotal(int idJugador) {

		ArrayList<Carta> elementoCartasJugador = new ArrayList<Carta>();

		Carta cartasObtenidas = null;

		int sumaTotal = 0;

		elementoCartasJugador = cartasJugadores.get(idJugador);

		for (int i = 0; i < elementoCartasJugador.size(); i++) {
			cartasObtenidas = elementoCartasJugador.get(i);
			sumaTotal = sumaTotal + cartasObtenidas.getNumero().getValor();
		}
		return sumaTotal;

	}

	public String determinarGanador() {
		int idGanador = 0;
		int sumaGanador = devolverTotal(0);
		int idComparado;
		int sumaGanadorComparado;
		for (int i = 1; i < cartasJugadores.size(); i++) {
			idComparado = i;
			sumaGanadorComparado = devolverTotal(i);
			if (sumaGanadorComparado > sumaGanador) {
				sumaGanador = sumaGanadorComparado;
				idGanador = idComparado;
			}

		}
		idGanador+=1;
		return Integer.toString(idGanador);

	}

}
