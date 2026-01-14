package ejercicio_04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double radio, volumen, cuatro = 4, tres=3;
		
		
		System.out.println ("Hola, está ante un programa que calcula el volumen de una esfera: ");
		System.out.println ("Introduzca el radio de la esfera: ");
		radio = Leer.datoDouble();
		
		volumen = cuatro/tres*Math.PI*Math.pow(radio, 3); 
		
		System.out.printf("El volumen de esa esfera es de: %.2f m\u00B3", volumen);
		
		
	}

}
