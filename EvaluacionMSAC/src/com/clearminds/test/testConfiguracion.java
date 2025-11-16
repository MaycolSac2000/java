package com.clearminds.test;

import com.clearminds.maquina.maquinaDulces;

public class testConfiguracion {

	public static void main(String[] args) {
		maquinaDulces maquina=new maquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		maquina.mostrarConfiguracion();

	}

}
