package ejercicio_04;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorios [];
		int desde = 1, hasta = 99;
		int tam = 10;
		int suma = 0, cont = 0;
		double media;
		aleatorios = new int [tam];
		Random r = new Random(System.nanoTime());
		
		
		for (int i = 0; i < aleatorios.length; i++) {

			aleatorios[i] = r.nextInt(hasta - desde + 1) + desde;
		}
		for (int i = 0; i < aleatorios.length; i++) {
			
			System.out.println((i + 1)+ ". es igual: "+ aleatorios[i]);
		}
		for (int i = 0; i < aleatorios.length; i++) {
		
			suma = suma + aleatorios[i];
			
		}
		System.out.println("\nLa suma de todos los aleatorios es: "+ suma);
		media = suma / aleatorios.length;
		System.out.printf("\nLa media de todos los números aleatorios es: %.2f", media);
		for (int i = 0; i < aleatorios.length; i++) {
			
			if (aleatorios[i] == 10) {
				
				cont++;
			}			
			
		}
		
		if (cont == 0) {
			
			System.out.println("\n\nNo se ha encontrado el 10 en la cadena.");
			
		}else {
			
			System.out.println("\n\nEl 10 se ha generado " + cont);
			
		}
		
	}

}
