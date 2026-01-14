package ejercicio_19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fijo = 1000, salario, ventas, porcentaje = 20, porciento = 100;
		
		System.out.println("Hola, está ante un programa que calcula cuánto ha ganado un vendedor.");
		System.out.println("Introduzca todo el dinero en ventas que ha ganado durante este mes:");
		ventas = Leer.datoDouble();
		salario = fijo + (ventas * (porcentaje/porciento));
		
		System.out.printf("\nEl vendedor ha ganado %.2f", salario);
	}

}
