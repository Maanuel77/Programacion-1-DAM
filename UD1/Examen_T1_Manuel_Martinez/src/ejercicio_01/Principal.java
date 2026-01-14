package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fahrenheit, treintaydos = 32, cinco = 5, nueve = 9;
		double celsius;
		
		System.out.println("Hola, está ante un conversor de grados Fahrenheit a grados Celsius: ");
		System.out.println("Para comenzar con el programa introduzca los grados Fahrenheit: ");
		fahrenheit = Leer.datoInt();
		
		celsius = (fahrenheit - treintaydos) * cinco/nueve;
		
		System.out.printf("Grados Fahrenheit --> %d"
				+ "\nGrados celsius\t  --> %.2fº", fahrenheit, celsius);
		
		System.out.printf("\n\nEn estados unidos hace una temperatura de %.2fº celsius", celsius);
		System.out.println("\n\nGracias por usar el programa :)");
		
	}

}
