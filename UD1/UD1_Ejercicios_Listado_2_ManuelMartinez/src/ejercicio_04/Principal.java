package ejercicio_04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, edad_días, año = 365;
		
		System.out.println("Hola, está ante una calculadora que calcula su edad en días. ");
		System.out.println("Introduzca cuantos años tiene: ");
		edad = Leer.datoInt();
		edad_días = edad * año;
		System.out.println("\nLos "+ edad +" años que tiene se convertirán en "+ edad_días +" días.");
		
	}

}
