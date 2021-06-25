package main;

import dmitrowicz.framework.Pantalla;

public class Main {

	public static void main(String[] args) {

		// Ingresar el path del archivo config.properties por constructor de Pantalla

		Pantalla miPantalla = new Pantalla("/utilizacion/config.properties");
		miPantalla.mostrarMenu();

	}

}
