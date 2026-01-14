package ejemplo_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, mayoria = 18;
		
		System.out.println("Hola, bienvenido a la discoteca.");
		System.out.println("Diga su edad: ");
		edad = Leer.datoInt();
		
		if (edad >= mayoria) {
			
			System.out.println("Puede entrar a la discoteca");
		} else {
			System.out.println("No puede entrar a la discoteca");
		}
		
		System.out.println("\nGracias por usar el programa :)");
	}

}
