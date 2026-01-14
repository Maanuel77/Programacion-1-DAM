package ejercicio_07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double consumido_km = 0.075, km_recorr, result_litr, result_prec, prec_l = 1.452;
		
		System.out.println("Hola buenas, está ante un programa que calcula la cantidad de dinero que gasta en combustible su coche en un viaje: ");
		System.out.println("Para saber cuál es la cantidad de dinero imtroduzca los km que ha hecho: ");
		km_recorr = Leer.datoDouble();
		result_litr = consumido_km * km_recorr;
		result_prec = result_litr * prec_l;
		System.out.printf ("\nTeniendo en cuenta que su coche ha gastado %.2f L en el viaje y que el precio de la gasolina está en %.3f €/L" ,result_litr, prec_l);
		System.out.printf ("\nSu coche ha gastado un total de : %.2f € en el viaje", result_prec );
		
	}

}

