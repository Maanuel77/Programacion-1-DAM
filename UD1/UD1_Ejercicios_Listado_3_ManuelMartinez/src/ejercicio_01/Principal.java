package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio_Coche, ganancia, impuesto, coste_Fabricación;
		int porc_Impuestos, porc_Ganancias, porcentaje = 100;
		
		System.out.println("Hola buenas, está ante un programa que te ayuda a calcular el precio final de su coche.");
		System.out.println("Introduzca el porcentaje de ganancia del vendedor: ");
		porc_Ganancias = Leer.datoInt();
		System.out.println("Introduzca el porcentaje de impuestos estatales en su país");
		porc_Impuestos = Leer.datoInt();
		System.out.println ("Por último introduzca el coste de fabricación del coche: ");
		coste_Fabricación = Leer.datoDouble(); 
		
		ganancia = coste_Fabricación * ((double)porc_Ganancias/porcentaje);
		impuesto = coste_Fabricación * ((double)porc_Impuestos/porcentaje);
		precio_Coche = ganancia + impuesto + coste_Fabricación;
		
		System.out.printf("El precio final del coche es de: %.2f €", precio_Coche);
		System.out.printf("\n---------------------------------------------");
		System.out.printf("\nDe los cuales: ");
		System.out.printf("\nGanancia del vendedor: ---------> %.2f €", ganancia);
		System.out.printf("\nImpuestos del estado:  ---------> %.2f €", impuesto);
		System.out.printf("\nPrecio de fabricación: ---------> %.2f €", coste_Fabricación);
	}

}
