package ejercicio_15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		
		System.out.println("Hola, está ante un programa que te dice la tabla de multiplicar de un número.");
		
		do {
			
			System.out.println("\nIntroduzca un número del 1-9 del que desea saber la tabla de multiplicar e introduzca 0 para terminar el programa.");
			num = Leer.datoInt();
			switch (num) {
			
			case 0:
				
				System.out.println("Gracias por usar el programa :)");
				
				break;
			case 1:
				
				System.out.println("1 x 1 = 1\r\n"
						+ "1 x 2 = 2\r\n"
						+ "1 x 3 = 3\r\n"
						+ "1 x 4 = 4\r\n"
						+ "1 x 5 = 5\r\n"
						+ "1 x 6 = 6\r\n"
						+ "1 x 7 = 7\r\n"
						+ "1 x 8 = 8\r\n"
						+ "1 x 9 = 9\r\n"
						+ "1 x 10 = 10");
				break;
			case 2: 
				
				System.out.println("2 x 1 = 2\r\n"
						+ "2 x 2 = 4\r\n"
						+ "2 x 3 = 6\r\n"
						+ "2 x 4 = 8\r\n"
						+ "2 x 5 = 10\r\n"
						+ "2 x 6 = 12\r\n"
						+ "2 x 7 = 14\r\n"
						+ "2 x 8 = 16\r\n"
						+ "2 x 9 = 18\r\n"
						+ "2 x 10 = 20");
				break;
			case 3:
				
				System.out.println("3 x 1 = 3\r\n"
						+ "3 x 2 = 6\r\n"
						+ "3 x 3 = 9\r\n"
						+ "3 x 4 = 12\r\n"
						+ "3 x 5 = 15\r\n"
						+ "3 x 6 = 18\r\n"
						+ "3 x 7 = 21\r\n"
						+ "3 x 8 = 24\r\n"
						+ "3 x 9 = 27\r\n"
						+ "3 x 10 = 30");
				break;
				
			case 4:
				
				System.out.println("4 x 1 = 4\r\n"
						+ "4 x 2 = 8\r\n"
						+ "4 x 3 = 12\r\n"
						+ "4 x 4 = 16\r\n"
						+ "4 x 5 = 20\r\n"
						+ "4 x 6 = 24\r\n"
						+ "4 x 7 = 28\r\n"
						+ "4 x 8 = 32\r\n"
						+ "4 x 9 = 36\r\n"
						+ "4 x 10 = 40");
				break;
				
			case 5:
				
				System.out.println("5 x 1 = 5\r\n"
						+ "5 x 2 = 10\r\n"
						+ "5 x 3 = 15\r\n"
						+ "5 x 4 = 20\r\n"
						+ "5 x 5 = 25\r\n"
						+ "5 x 6 = 30\r\n"
						+ "5 x 7 = 35\r\n"
						+ "5 x 8 = 40\r\n"
						+ "5 x 9 = 45\r\n"
						+ "5 x 10 = 50");
				break;
				
			case 6:
				
				System.out.println("6 x 1 = 6\r\n"
						+ "6 x 2 = 12\r\n"
						+ "6 x 3 = 18\r\n"
						+ "6 x 4 = 24\r\n"
						+ "6 x 5 = 30\r\n"
						+ "6 x 6 = 36\r\n"
						+ "6 x 7 = 42\r\n"
						+ "6 x 8 = 48\r\n"
						+ "6 x 9 = 54\r\n"
						+ "6 x 10 = 60");
				break;
				
			case 7:
				
				System.out.println("7 x 1 = 7\r\n"
						+ "7 x 2 = 14\r\n"
						+ "7 x 3 = 21\r\n"
						+ "7 x 4 = 28\r\n"
						+ "7 x 5 = 35\r\n"
						+ "7 x 6 = 42\r\n"
						+ "7 x 7 = 49\r\n"
						+ "7 x 8 = 56\r\n"
						+ "7 x 9 = 63\r\n"
						+ "7 x 10 = 70");
				break;
			case 8: 
				
				System.out.println("8 x 1 = 8\r\n"
						+ "8 x 2 = 16\r\n"
						+ "8 x 3 = 24\r\n"
						+ "8 x 4 = 32\r\n"
						+ "8 x 5 = 40\r\n"
						+ "8 x 6 = 48\r\n"
						+ "8 x 7 = 56\r\n"
						+ "8 x 8 = 64\r\n"
						+ "8 x 9 = 72\r\n"
						+ "8 x 10 = 80");
				break;
				
			case 9:
				
				System.out.println("9 x 1 = 9\r\n"
						+ "9 x 2 = 18\r\n"
						+ "9 x 3 = 27\r\n"
						+ "9 x 4 = 36\r\n"
						+ "9 x 5 = 45\r\n"
						+ "9 x 6 = 54\r\n"
						+ "9 x 7 = 63\r\n"
						+ "9 x 8 = 72\r\n"
						+ "9 x 9 = 81\r\n"
						+ "9 x 10 = 90");
				
				break;
				
			default:
				
				System.out.println("Número incorrecto, introduzca uno válido.");
			}
			
		} while (num != 0);
		
	}

}
