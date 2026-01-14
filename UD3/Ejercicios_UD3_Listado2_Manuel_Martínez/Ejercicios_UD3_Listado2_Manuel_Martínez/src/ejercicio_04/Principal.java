package ejercicio_04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int op, op_Baja, id, n_Cliente=0;
		
		String dni, nombre, apellidos;
		int edad;
		double peso, altura;
		
		
		Cliente lista_Cli [] = new Cliente [100];
		Gimnasio gym = new Gimnasio(lista_Cli);
		
		System.out.println("Bienvenido al sistema gestor del gimnasio.");
		
		do {
		
		System.out.println("\nIndique una opción:");
		System.out.println("1. Agregar cliente.");
		System.out.println("2. Mostrar clientes no activos.");
		System.out.println("3. Calcular IMC al cliente elegido.");
		System.out.println("4. Mostrar media de IMC de los clientes activos.");
		System.out.println("5. Dar de baja.");
		System.out.println("0. Cerrar programa");
		op=Leer.datoInt();
		System.out.println();
		
		switch (op) {
			
			case 0:
			break;
		
			case 1:
				
				System.out.println("¿Cómo se llama el cliente?");
				nombre = Leer.dato();
				
				System.out.println("¿Cúales son sus apellidos?");
				apellidos=Leer.dato();
				
				System.out.println("Indique el DNI del cliente:");
				dni = Leer.dato();
				
				System.out.println("¿Cúal es la edad del cliente?");
				edad = Leer.datoInt();
				
				System.out.println("¿Y su peso en KG?");
				peso = Leer.datoDouble();
				
				System.out.println("¿Y su altura en metros?");
				altura = Leer.datoDouble();
				
				lista_Cli[n_Cliente] = new Cliente(dni, nombre, apellidos, true, edad, peso, altura);
				
				System.out.println("\nCliente agregado con éxito.");
				
			break;
			
			case 2:
				
				if (lista_Cli[0] == null) {
					
					System.err.println("ERROR - No se han añadido clientes.");
					
				} else {
					
					gym.mostrarNoActivo();
					System.out.println();
				}
				
			break;
				
			case 3:
				
				System.out.println("Indica el cliente al que calcular el IMC:");
				id = Leer.datoInt();
				
				if (lista_Cli[id-1] == null) {
					
					System.err.println("\nERROR - No hay datos de ese cliente.");
					
				} else {
					
					System.out.printf("\nEl IMC de este cliente es de %.2f.\n", lista_Cli[id-1].calcularIMC(lista_Cli[id-1].getPeso(), lista_Cli[id-1].getAltura()));
				}
				
			break;
			
			case 4:
				
				if (lista_Cli[0] == null) {
					
					System.err.println("ERROR - No se han añadido clientes.");
					
				} else if (gym.calcularMediaIMC() == 0){
					
					System.err.println("ERROR - No existen clientes activos.");
				
				} else {
					
					System.out.printf("La media del IMC de los clientes activos es de %.2f.\n", gym.calcularMediaIMC());
					
				}
				
			break;
			
			case 5:
				
				do {
				
					System.out.println("Indique cómo buscar al cliente para dar de baja:");
					System.out.println("Pulse 1 - ID");
					System.out.println("Pulse 2 - Nombre");
					System.out.println("Pulse 3 - Apellidos");
					System.out.println("Pulse 4 - DNI");
					System.out.println("Pulse 0 - Cancelar");
					op_Baja = Leer.datoInt();
					System.out.println();
					
					switch (op_Baja) {
					
						case 0:
						break;
							
						case 1:
							
							System.out.println("Introduzca el ID del cliente:");
							id = Leer.datoInt();
							
							gym.findByID(id-1);
							
						break;
							
						case 2:
							
							System.out.println("Introduzca el nombre del cliente:");
							nombre = Leer.dato();
							
							gym.findByNombre(nombre);
							
						break;
						
						case 3:
							
							System.out.println("Introduzca los apellidos del cliente:");
							apellidos = Leer.dato();
							
							gym.findByApellido(apellidos);
							
						break;
						
						case 4:
							
							System.out.println("Introduzca el DNI del cliente:");
							dni = Leer.dato();
							
							gym.findByDNI(dni);
							
						break;
					}
					
					
					System.out.println("\n\nIndique el ID del cliente a dar de baja o pulse 0 para cancelar:");
					id = Leer.datoInt();
					
					if (id != 0 && lista_Cli[id-1] != null) {
						
						gym.darDeBaja(id-1);
						System.out.println("\nEl cliente está dado de baja.");
						
					} else if (id == 0){
						
					} else {
						
						System.err.println("\nERROR - Ha seleccionado un ID inexistente.");
						
					}
					
					System.out.println("\nPulse 0 para dejar de dar de baja y otro número para continuar:");
					op_Baja = Leer.datoInt();
							
				} while (op_Baja != 0);
				
			break;
		}
		
		
		} while (op != 0);
		
	}

}