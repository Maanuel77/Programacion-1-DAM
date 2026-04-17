package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double celsius;
		double fahrenheit;
		boolean temperaturaValida = false;

		do {
			try {
				System.out.print("Introduce temperatura en Celsius: ");
				celsius = Leer.datoDouble();

				if (celsius < -273) {
					throw new IllegalArgumentException("No puede haber temperaturas menores a -273 oC");
				}

				fahrenheit = (celsius * 9 / 5) + 32;
				System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
				temperaturaValida = true;
			} catch (NumberFormatException e) {
				System.out.println("Formato no valido. Introduce un numero.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (!temperaturaValida);
	}
}


