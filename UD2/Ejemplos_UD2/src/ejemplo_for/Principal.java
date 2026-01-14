package ejemplo_for;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cant;
		
		System.out.println("Introduzca una cantidad de veces que le quieras llamar tonto a gonzalo:");
		cant = Leer.datoInt();
		
		for (int i = 0; i < cant; i ++) {
			
			System.out.println((i + 1)+" Gonzalo tonto");
			
		}
		
		
	}

}
