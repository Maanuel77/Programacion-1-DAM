package ejercicio_03;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		try {
			System.out.print("Introduce a: ");
			double a = Leer.datoDouble();
			System.out.print("Introduce b: ");
			double b = Leer.datoDouble();
			System.out.print("Introduce c: ");
			double c = Leer.datoDouble();

			CEcuacion2Grado ecuacion = new CEcuacion2Grado(a, b, c);
			ecuacion.resolver();
		} catch (NumberFormatException e) {
			System.out.println("Formato no valido");
		} catch (EcuacionDegeneradaException | RaicesComplejasException e) {
			System.out.println(e.getMessage());
		}
	}
}


