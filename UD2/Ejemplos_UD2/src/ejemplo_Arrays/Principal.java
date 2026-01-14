package ejemplo_Arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		//En el principio declaramos las variables, mientras que después cuando pidas el tamaño lo instanciamos.
		int [] edades;
		double [] precios;

		System.out.println("Cuántas edades va a guardar");
		tam = Leer.datoInt();
		//Instanciamos el array
		edades = new int [tam];
		
		for (int i = 0; i < edades.length; i ++) {
			
			edades[i] = i++;
			
		}
		
		for (int i = 0; i < edades.length; i ++) {
			
			System.out.println("Edades"+edades[i]);
			
		}
	}

}
