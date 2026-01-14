package ejercicio_07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lanzar c1 = new Lanzar();
		int opcion, tam = 100, cant = 0;
		String[] registro_Tiradas;
		registro_Tiradas = new String[tam];

		do { // INICIO del bucle do

			c1.menu();
			opcion = Leer.datoInt();
			
			switch (opcion) { // INICIO del switch

				case 1:
					
					c1.cara_Cruz();
					c1.imprimir();
					
					
					if (cant < tam) { 
					    registro_Tiradas[cant] = c1.guardar();
					    cant = cant + 1;
					} else {
					    System.out.println("El registro de tiradas está lleno.");
					}
					break;
	
				case 2:
					
					System.out.println("\n--- REGISTRO DE TIRADAS ---");
					for (int i = 0; i < cant; i++) { 
						System.out.println((i + 1) + ". " + registro_Tiradas[i]);
					}
					break;
	
				case 3:
					
					System.out.println("Gracias por usar nuestro programa.");
					break;
				
				default:
					System.out.println("Opción no válida. Por favor, intente de nuevo.");
					break;
			}

		} while (opcion != 3);
	}
}