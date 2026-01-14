package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prec_1, prec_2, prec_3, prec_Total, dinero, devolución, prec1_Subt, prec2_Subt, prec3_Subt;
		int cant_1, cant_2, cant_3;
		String empleado, obj_1, obj_2, obj_3, fecha;

		System.out.println("Hola, este programa imprime un ticket del McDonal's: ");

		System.out.println("\nIntroduzca el nombre del empleado que le atendió: ");
		empleado = Leer.dato();
		System.out.println("Introduzca la fecha de hoy: ");
		fecha = Leer.dato();

		System.out.println("Introduzca el nombre del primer objeto: ");
		obj_1 = Leer.dato();
		System.out.println("Introduzca la cantidad de " + obj_1 + ":");
		cant_1 = Leer.datoInt();
		System.out.println("Introduzca el precio de " + obj_1 + ":");
		prec_1 = Leer.datoDouble();

		System.out.println("Introduzca el nombre del segundo objeto: ");
		obj_2 = Leer.dato();
		System.out.println("Introduzca la cantidad de " + obj_2 + ":");
		cant_2 = Leer.datoInt();
		System.out.println("Introduzca el precio de " + obj_2 + ":");
		prec_2 = Leer.datoDouble();

		System.out.println("Introduzca el nombre del tercer objeto: ");
		obj_3 = Leer.dato();
		System.out.println("Introduzca la cantidad de " + obj_3 + ":");
		cant_3 = Leer.datoInt();
		System.out.println("Introduzca el precio de " + obj_3 + ":");
		prec_3 = Leer.datoDouble();
		
		prec_Total = (prec_1 * cant_1) + (prec_2 + cant_2) + (prec_3 + cant_3);
		System.out.printf("El precio total es de: %.2f €", prec_Total);
		System.out.println("\nCon cuanto dinero va a pagar? ");
		dinero = Leer.datoDouble();

		prec1_Subt = prec_1 * cant_1;
		prec2_Subt = prec_2 * cant_2;
		prec3_Subt = prec_3 * cant_3;
		devolución = dinero - prec_Total;

		System.out.printf("\nTICKET DE COMPRA: \n\nLe atendió %s\n%s\n", empleado, fecha);
		System.out.println(
				"Nombre         Unidades         P/u         Subtotal\n*******************************************************************");
		System.out.printf(
				"%s         %d            %.2f €        %.2f €\n\n%s                %d            %.2f €        %.2f €\n\n%s            %d            %.2f €       %.2f €\n",
				obj_1, cant_1, prec_1, prec1_Subt, obj_2, cant_2, prec_2, prec2_Subt, obj_3, cant_3, prec_3,
				prec3_Subt);
		System.out.println("-------------------------------------------------------------------");
		System.out.printf(
				"                                           | Total = %.2f €\n                                           | Entregado = %.2f €\n                                           | ----------------\n                                           | Devolución = %.2f €",
				prec_Total, dinero, devolución);

	}

}
