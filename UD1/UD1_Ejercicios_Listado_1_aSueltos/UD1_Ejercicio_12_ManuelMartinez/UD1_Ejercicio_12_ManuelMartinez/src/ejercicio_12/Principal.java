package ejercicio_12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double prec_1, prec_2, prec_3, prec_total, dinero, devolución, cant_1, cant_2, cant_3;
		String empleado = "John Snow", obj_1, obj_2, obj_3;
		
		System.out.println("Hola, este programa imprime un ticket de compra: ");
		System.out.println("Introduzca el nombre del primer objeto: ");
		obj_1 = Leer.dato();
		System.out.println("Introduzca la cantidad de " + obj_1 + ":");
		cant_1 = Leer.datoDouble();
		System.out.println("Introduzca el precio de " + obj_1 + ":");
		prec_1 = Leer.datoDouble();
		
		System.out.println("Introduzca el nombre del segundo objeto: ");
		obj_2 = Leer.dato();
		System.out.println("Introduzca la cantidad de " + obj_2 + ":");
		cant_2 = Leer.datoDouble();
		System.out.println("Introduzca el precio de " + obj_2 + ":");
		prec_2 = Leer.datoDouble();
		
		System.out.println("Introduzca el nombre del tercer objeto: ");
		obj_3 = Leer.dato();
		System.out.println("Introduzca la cantidad de " + obj_3 + ":");
		cant_3 = Leer.datoDouble();
		System.out.println("Introduzca el precio de " + obj_3 + ":");
		prec_3 = Leer.datoDouble();
		
		System.out.println("Con cuanto dinero va a pagar? ");
		dinero = Leer.datoDouble();
		
		prec_1 = prec_1 * cant_1;
		prec_2 = prec_2 * cant_2;
		prec_3 = prec_3 * cant_3;
		prec_total = (prec_1 * cant_1) + (prec_2 + cant_2) + (prec_3 + cant_3);
		devolución = dinero - prec_total;
		
		System.out.println ("\nTICKET DE COMPRA: \n\nLe atendió "+ empleado + "\n\n" + obj_1 + " ------> " + prec_1 +" €\n\n" + obj_2 + " ------> " + prec_2 + " €\n\n" + obj_3 +" ------> " + prec_3 + " €\n\n--------------------------------------");
		System.out.printf("\n El cliente ha pagado: %.2f € ---------------- El precio total es de: %.2f €----------------DEVOLUCIÓN: %.2f €", dinero , prec_total , devolución);
		
	}

}
