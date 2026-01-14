package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double espacio, espacio_Inicial, velocidad, tiempo;
		
		System.out.println("Hola, está ante un programa que calcula la distancia que recorre la chancla de tu madre cuando se enfada: ");
		System.out.println("Introduzca el espacio inicial recorrido por la zapatilla: ");
		espacio_Inicial = Leer.datoDouble();
		System.out.println("Indique la velocidad de la zapatilla: ");
		velocidad = Leer.datoDouble();
		System.out.println("Por último indique el tiempo que ha estado en el aire: ");
		tiempo = Leer.datoDouble();
		
		espacio = espacio_Inicial + velocidad*tiempo;
		
		System.out.printf("La chancla de tu madre recorrerá una increíble distancia de %.2f m!!!", espacio);
		System.out.println("\nGracias por usar el programa. ");
		
	}

}
