package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres;
		int tam;
		
		System.out.println("Indica cómo de largo quieres que sea el array: ");
		tam = Leer.datoInt();
		nombres = new String [tam];
		for (int i = 0; i < nombres.length ; i++) {
			
			System.out.println("Diga el nombre "+ (i +1)+ ": ");
			nombres [i] = Leer.dato();
		}
		System.out.println("Nombres: ");
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println((i + 1)+". "+ nombres[i]);
			
		}
		
	}

}
