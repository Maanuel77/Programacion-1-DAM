package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, opcion;
		double result;

		do {

			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Dividir");
			System.out.println("4. Multiplicar");
			System.out.println("5. Raiz Cuadrada");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			
		switch (opcion) {
			case 1:

				try {
					System.out.println("Diga un número");
					num1 = Leer.datoInt();
					System.out.println("Diga otro número");
					num2 = Leer.datoInt();

					result = num1 + num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no válido");
				}
				break;

			case 2:
				try {
					System.out.println("Diga un número");
					num1 = Leer.datoInt();
					System.out.println("Diga otro número");
					num2 = Leer.datoInt();

					result = num1 - num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no válido");
				}
				break;

			case 3:
				try {
					System.out.println("Diga un número");
					num1 = Leer.datoInt();
					System.out.println("Diga otro número");
					num2 = Leer.datoInt();

					result = num1 / num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no válido");
				} catch (ArithmeticException ae) {

					System.out.println("No es posible dividir por cero");

				}
				break;

			case 4:
				try {
					System.out.println("Diga un número");
					num1 = Leer.datoInt();
					System.out.println("Diga otro número");
					num2 = Leer.datoInt();

					result = num1 * num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no válido");
				}
				break;

			case 5:
				try {
					System.out.println("Diga un número");
					num1 = Leer.datoInt();

					result = Math.sqrt(num1);
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no válido");
				} catch (ArithmeticException ae) {

					System.out.println("No es posible dividir por cero");

				}
				break;

			case 0:

				System.out.println("Gracias por usar el programa");
				break;

			default:

				System.out.println("Opcion no válida");

			}

		} while (opcion != 0);

	}

}
