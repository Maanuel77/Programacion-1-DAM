package conjetura_de_collatz;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num, rest, cant = 0;
		
		System.out.println("Está ente un programa que comprueba la conjetura de collatz: ");
		
		System.out.println("Introduzca el número que desea comprobar, que sea entero: ");
		num = Leer.datoLong();

		while (num != 1) {
			
			rest = num % 2;
			
			if (rest == 0) {
				
				num = num/2;
				System.out.printf("\n%d", num);
				cant = cant + 1;
				
			} else {
				
				num = num * 3 + 1;
				System.out.printf("\n%d", num);
				cant = cant + 1;
			}
			
			
		}
		
		System.out.println("\n\nHa tomado "+ cant + " pasos");
		
		
	}
	

	
}
