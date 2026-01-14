package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int día, mes, año;
		double prec_Gasolina;
		String nombre;
		char inicial;
		
		System.out.println("Diga la inicial de su nombre: ");
		inicial = Leer.datoChar();
		System.out.printf("Hola %c, está ante un programa que pide y muestra el precio de la gasolina hoy demostrando varias variables de distinto tipo.", inicial);
		System.out.println("\nDiga su nombre y apellidos: ");
		nombre = Leer.dato();
		System.out.println("Diga el precio de la gasolina: ");
		prec_Gasolina = Leer.datoDouble();
		System.out.println("Diga el día de hoy: ");
		día = Leer.datoInt();
		System.out.println("Diga en que mes estamos: ");
		mes = Leer.datoInt();
		System.out.println("Diga en que año estamos: ");
		año = Leer.datoInt();
		
		System.out.printf("Su nombre es %s", nombre );
		System.out.printf("\nEl precio de la gasolina hoy, a %d/%d/%d + es de %.4f €/L", día, mes, año, prec_Gasolina);

	}

}
