package ejercicio_10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Billete b1 = new Billete();
		Maquina m1 = new Maquina();
		Maquina m2;
		Billete b2;
		int opciones, opciones_Operario = 4, num_Billetes, num_Saltos;
		String contraseña_Usuario;
		double cambio;
		do {
		b1.menu_Billete();
		opciones = Leer.datoInt();
		
			switch (opciones) {

			// Comprar 1 o varios billetes
			case 1:
				System.out.printf("Un billete cuesta %.2f€\n", b1.getPrecio());
				System.out.printf("Además se le suma %.2f€ por cada salto.\n", b1.getSalto());
				System.out.println("Diga cuántos billetes quiere: ");
				num_Billetes = Leer.datoInt();
				System.out.println("Diga cuántos saltos va a dar: ");
				num_Saltos = Leer.datoInt();
				System.out.printf("Coste del / de los billetes: %.2f€\n", b1.generar_Billete(num_Saltos, num_Billetes));
				System.out.println("El número asociado a su billete es: "+ m1.generar_Aleatorio_Billete());
				System.out.println("Diga con cuanto dinero va a pagar: ");
				cambio = Leer.datoDouble();
				System.out.println("El cambio es de: ");
				break;
				// Imprimir por pantalla
			case 2:
				break;
				// Entrada a menu operario
			case 3:
				System.out.println("Para acceder al menu de operario introduzca la contraseña (Acceso)");
				contraseña_Usuario = Leer.dato();
				m1 = new Maquina();
				if (m1.contraseña_Check(contraseña_Usuario)) {
					do {
						b1.menu_Operario();
						opciones_Operario = Leer.datoInt();
						switch (opciones_Operario) {
						case 1:
							System.out.println("Cambiar precio del billete:");
						case 2:
							System.out.println("Se han reseteado con éxito las ganancias.");
						case 3:
							System.out.println("La recaudación de hoy es: "+m1.recaudacion());
						case 4:

							System.out.println("Saliendo del menu de operario");
							break;
						}
					} while (opciones_Operario != 4);
				}else {
					
					System.out.println("Contraseña incorrecta.");
				}
				break;
				// Salir del programa
			case 4:
				System.out.println("Gracias por usar el programa");
				break;
			default:

				System.out.println("Número introducido no válido, introduzca otro distinto.");
			}

		} while (opciones != 4);

	}

}
