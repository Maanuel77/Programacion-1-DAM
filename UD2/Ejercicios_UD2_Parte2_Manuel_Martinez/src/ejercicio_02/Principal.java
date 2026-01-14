package ejercicio_02;

import java.util.Random;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros, aleat;
		int tam=10, dato=2, desde=1, hasta=10;
		Random r1 = new Random (System.nanoTime());		

		System.out.println("Bienvenido al programa que rellena un Array con 10 números\n");
		
		numeros=new int [tam];
		aleat=new int [tam];
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.println("Introduce un número: ");
			numeros[i]=Leer.datoInt();
		}
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.printf("\nValor %d: %d",i+1,numeros[i]*dato);
		}
		
		for(int i=0;i<aleat.length;i++) {
			
			aleat[i] = r1.nextInt(hasta-desde+1)+desde;
		}
		
		System.out.println("\n\nAhora vamos a multiplicar los números introducidos por un número aleatorio entre 1 y 10");
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.printf("\nValor por aleatorio %d: %d",aleat[i],numeros[i]*aleat[i]);
		}
		System.out.println("\n\nGracias por usar el programa");
	}

}
