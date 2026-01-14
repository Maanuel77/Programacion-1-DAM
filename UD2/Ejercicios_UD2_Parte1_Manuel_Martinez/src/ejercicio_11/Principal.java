package ejercicio_11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, cant, prec_VIP = 15, prec_Normal = 7, prec_3D = 10, prec_Niños = 4, prec_Total;
		
		System.out.println("Hola, está ante un programa que te calcula la compra de una sala de cines.");
		System.out.println("Decidad a que sala desea asistir"
				+ "\nPulsa 1 para la sala VIP"
				+ "\nPulsa 2 para la sala 3D"
				+ "\nPulsa 3 para la sala normal"
				+ "\nPulsa 4 para la sala para niños");
		num = Leer.datoInt();
		
		switch (num) {
		
		case 1:
			
			System.out.println("Introduzca el número de entradas en la sala VIP");
			cant = Leer.datoInt();
			prec_Total = cant * prec_VIP;
			System.out.println("El precio total de sus entradas es de " + prec_Total +"€");
			break;
			
		case 2:
			System.out.println("Introduzca el número de entradas en la sala 3D");
			cant = Leer.datoInt();
			prec_Total = cant * prec_3D;
			System.out.println("El precio total de sus entradas es de " + prec_Total +"€");
			break;
			
		case 3:
			System.out.println("Introduzca el número de entradas en la sala normal");
			cant = Leer.datoInt();
			prec_Total = cant * prec_Normal;
			System.out.println("El precio total de sus entradas es de " + prec_Total +"€");
			break;
			
		case 4:
			System.out.println("Introduzca el número de entradas en la sala para niños");
			cant = Leer.datoInt();
			prec_Total = cant * prec_Niños;
			System.out.println("El precio total de sus entradas es de " + prec_Total +"€");
			break;
			
		default:
			
			System.out.println("Número de sala incorrecto, vuelva a introducirlo.");
		
		}
		
		System.out.println("\nGracias por usar el programa :)");
		
	}

}
