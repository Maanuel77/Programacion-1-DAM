package ejercicio_16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tope = 11;
		double numero, suma = 0, producto = 1;
		
		for (int i = 0; i < tope; i++) {
			
			System.out.println("Diga el número "+ (i));
			numero = Leer.datoDouble();
			suma += numero;
			producto*=numero;
			
		}
		
		System.out.printf("El resultado de la suma de los 10 números es de: %.2f", suma);
		System.out.printf("\nEl resultado del producto de los 10 números es de: %.2f", producto);
		
	}

}
