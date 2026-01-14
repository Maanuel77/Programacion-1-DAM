package ejercicio_05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, exponente, resultado;
		
		System.out.println("Hola, bienvenido a un programa que calcula la potencia de un número.");
		System.out.println("Para comenzar introduzca la base:");
		num1 = Leer.datoDouble();
		System.out.println("Ahora introduzca el exponente:");
		exponente = Leer.datoDouble();
		
		if (exponente == 0) {
			
			System.out.println("El resultado de la potencia es 1");
			
		} else {
			
			if (exponente > 0) {
				
				resultado = Math.pow(num1, exponente);
				System.out.printf("El resultado de la potencia es: %.2f", resultado);
				
			} else {
				
				resultado = 1/Math.pow(num1, -1 * exponente);
				System.out.printf("El resultado de la potencia es: %.2f", resultado);
			}
			
		}
		
		System.out.println("\n\nGracias por usar el programa.");
	}

}
