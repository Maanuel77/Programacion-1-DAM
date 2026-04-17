package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int num1;
		int num2;
		int opcion;
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
					System.out.println("Diga un n?omero");
					num1 = Leer.datoInt();
					System.out.println("Diga otro n?omero");
					num2 = Leer.datoInt();

					result = num1 + num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no v??lido");
				}
				break;

			case 2:
				try {
					System.out.println("Diga un n?omero");
					num1 = Leer.datoInt();
					System.out.println("Diga otro n?omero");
					num2 = Leer.datoInt();

					result = num1 - num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no v??lido");
				}
				break;

			case 3:
				try {
					System.out.println("Diga un n?omero");
					num1 = Leer.datoInt();
					System.out.println("Diga otro n?omero");
					num2 = Leer.datoInt();

					result = num1 / num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no v??lido");
				} catch (ArithmeticException ae) {

					System.out.println("No es posible dividir por cero");

				}
				break;

			case 4:
				try {
					System.out.println("Diga un n?omero");
					num1 = Leer.datoInt();
					System.out.println("Diga otro n?omero");
					num2 = Leer.datoInt();

					result = num1 * num2;
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no v??lido");
				}
				break;

			case 5:
				try {
					System.out.println("Diga un n?omero");
					num1 = Leer.datoInt();
					if (num1 < 0) {
						throw new ArithmeticException();
					}

					result = Math.sqrt(num1);
					System.out.println("El resultado es: "+ result);
				} catch (NumberFormatException nf) {

					System.out.println("Formato no v??lido");
				} catch (ArithmeticException ae) {

					System.out.println("No se puede hacer la ra??z cuadrada de un n?omero negativo");

				}
				break;

			case 0:

				System.out.println("Gracias por usar el programa");
				break;

			default:

				System.out.println("Opcion no v??lida");

			}

		} while (opcion != 0);

	}

}


