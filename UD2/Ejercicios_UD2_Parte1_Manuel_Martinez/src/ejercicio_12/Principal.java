package ejercicio_12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pulsar, idioma;
		double peso_T, peso_F, mercurio = 0.38, venus = 0.91, tierra = 1, marte = 0.38, jupiter = 2.53, saturno = 1.06,
				neptuno = 0.92, urano = 1.2;
		String planeta1 = "Mercurio", planeta2 = "Venus", planeta3 = "la Tierra", planeta4 = "Martes",
				planeta5 = "Júpiter", planeta6 = "Saturno", planeta7 = "Urano", planeta8 = "Neptuno";

		System.out.println(
				"Buenas, está ante un programa que calcula tu peso en los distintos planetas del sistema solar.");
		System.out.println("Antes de empezar la conversión introduzca su peso: ");
		peso_T = Leer.datoDouble();

		System.out.println("Pulse 1 para " + planeta1);
		System.out.println("Pulse 2 para " + planeta2);
		System.out.println("Pulse 3 para " + planeta3);
		System.out.println("Pulse 4 para " + planeta4);
		System.out.println("Pulse 5 para " + planeta5);
		System.out.println("Pulse 6 para " + planeta6);
		System.out.println("Pulse 7 para " + planeta7);
		System.out.println("Pulse 8 para " + planeta8);
		pulsar = Leer.datoInt();

		switch (pulsar) {

		case 1:
			peso_F = peso_T * mercurio;

			System.out.println("Pulse 1 para el resultado en español:\nPulse 2 para el resultado en inglés: ");
			idioma = Leer.datoInt();

			switch (idioma) {

			case 1:

				System.out.printf("Su peso en %s es de: %.2f kg", planeta1, peso_F);
				break;
			case 2:

				System.out.printf("Your weigth in Mercury is: %.2f", peso_F);
				break;
			}

			break;

		case 2:
			peso_F = peso_T * venus;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta2, peso_F);
			break;

		case 3:
			peso_F = peso_T * tierra;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta3, peso_F);
			break;

		case 4:
			peso_F = peso_T * marte;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta4, peso_F);
			break;

		case 5:
			peso_F = peso_T * jupiter;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta5, peso_F);
			break;

		case 6:
			peso_F = peso_T * saturno;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta6, peso_F);
			break;

		case 7:
			peso_F = peso_T * neptuno;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta7, peso_F);
			break;

		case 8:
			peso_F = peso_T * urano;
			System.out.printf("Su peso en %s es de: %.2f kg", planeta8, peso_F);
			break;

		default:
			System.out.println("Opción incorrecta, introduzca un número válido:");

		}

		System.out.println("\n\nGracias por usar el programa :)");

	}

}
