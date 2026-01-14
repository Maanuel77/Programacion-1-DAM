package ejercicio_06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] meses = {"Enero", "Febrero", "Marzo", "Abril" , "Mayo", "Junio" , "Julio", "Agosto", "Sept", "Octubre", "Nov", "Dic", "Pag_ext", "Total", "Media"};
		double [] precios;
		double total = 0, media;
		int tam = 13;
		precios = new double [tam];
		
		for (int i = 0; i < precios.length - 2;i++) {
		
		System.out.println("Diga cuánto ganó en "+ meses [i]);
		precios[i] = Leer.datoDouble();
		
		}
		
		System.out.println("---Desglose pagos---");
		for (int i = 0; i < precios.length; i++) {
			
			total = total + precios [i];
			
		}
		media = total / precios.length;
		
		for (int i = 0; i < meses.length; i++) {
			
			System.out.printf("%s\t\t", meses[i]);
			
			
		}
		System.out.println("");
		for (int i = 0; i < precios.length; i++) {
			
			System.out.printf("%.2f\t\t", precios[i]);
			
			
		}
		
		System.out.printf("%.2f\t\t%.2f", media, total);
		
		
		
	}

}
