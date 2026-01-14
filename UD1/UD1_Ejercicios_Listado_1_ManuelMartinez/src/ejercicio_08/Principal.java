package ejercicio_08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r_long, longitud, r_area, area;
		
		System.out.println ("Hola buenas, este programa realiza los cálculos por tí, tanto de la longitud de un círculo como de su área: ");
		System.out.println ("\nComenzamos calculando la longitud del círculo, para ello introduce el radio de la misma, en caso de tener el diámetro simplemente divídalo por 2: ");
		r_long = Leer.datoDouble();
		longitud = 2 * Math.PI * r_long;
		System.out.printf ("La longitud de la circunferencia es de %.2f m", longitud);
		System.out.println("\n\nAhora pasamos a calcular el área de la circunferencia, introduzca el radio: ");
		r_area = Leer.datoDouble();
		area = Math.PI * Math.pow(r_area, 2);
		System.out.printf ("El área de la circunferencia es de %.2f m^2", area);
	}

}
