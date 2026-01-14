package ejemplo_do_while;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		do {
			
			
			
		}while(condición booleana);
*/
		
		String chiste = "Van dos y se cae el del medio", refrán = "Al pan pan y al vino vino y a tu culo me tiro";
		int num;
		do {
			System.out.println("\nPulsa 1 para un refrán. ");
			System.out.println("Pulsa 2 para un chiste. ");
			System.out.println("Pulsa 0 para terminar el programa.");
			num = Leer.datoInt();
			
			switch (num) {
			
			case 0:
				
				System.out.println("Gracias por usar el programa :)");
				break;
				
			case 1: 
				
				System.out.println(refrán);
				break;
			case 2:
				
				System.out.println(chiste);
				break;
			default:
				System.out.println("Introduzca un número válido");
			}
			
		} while (num != 0);
	}

}
