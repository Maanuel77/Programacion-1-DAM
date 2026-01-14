package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int entero, doble, triple;
		double mitad;
	
		System.out.println("Hola, está ante un programa que a partir de un número entero calcula su mitad, su doble y su triple: "); 
		System.out.println("Introduce el número entero: ");
		entero = Leer.datoInt();
		doble = entero * 2;
		triple = entero * 3;
		mitad = (double)entero/2;
		
		System.out.printf("  -  El doble del número que has introducido es: %d \n  -  El triple del número que has introducido es: %d\n  -  La mitad del número que has introducido es: %.2f", doble, triple, mitad);
		
	}
}
