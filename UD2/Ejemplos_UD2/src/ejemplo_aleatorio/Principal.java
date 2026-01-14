package ejemplo_aleatorio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*double aleatorio;
		int veces = 0;
		do {
		aleatorio = (Math.random()*3) + 1;
		veces = veces + 1;
		System.out.printf("\n%d. El número es: %.9f",veces, aleatorio);
		
		}while (aleatorio != 2.000000000);*/
		
		int hasta=20, desde=3, aleatorio, repetir, num = 0;
		System.out.println("Introduzca el número desde: ");
		desde = Leer.datoInt();
		System.out.println("Introduzca hasta: ");
		hasta = Leer.datoInt();
		System.out.println("Repetir hasta que salga: ");
		repetir = Leer.datoInt();
		
		do {
		Random r = new Random (System.nanoTime());
		
		aleatorio = r.nextInt(hasta-desde+1)+desde;
		num = num +1;
		System.out.println(num +". El número es: "+ aleatorio);
		
		}while (aleatorio != repetir);
		
	}

}
