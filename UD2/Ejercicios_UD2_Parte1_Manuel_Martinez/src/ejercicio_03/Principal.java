package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, par = 2, resto;
		
		System.out.println("El siguiente programa te dice si el número introducido es o no es par.");
		
		System.out.println("Introduzca un número:");
		num1 = Leer.datoDouble();
		resto = num1 % par;
		
		if ( resto == 0) {
			
			System.out.println("El número introducido es par.");
			
		}else {
			
			System.out.println("El número introducido es impar.");
		}
		System.out.println("\nGracias por usar el programa.");
		
	}

}
