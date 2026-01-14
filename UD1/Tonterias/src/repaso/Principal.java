package repaso;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num;
		String [] usuarios;
		int tam, usu1, usu2;
		
		System.out.println("Diga el número de usuarios que desea introducir");
		tam = Leer.datoInt();
		usuarios = new String [tam];
		for (int i = 0; i < usuarios.length; i++) {
			
			System.out.println("Introduzca el primer usuario: ");
			usuarios [i] = Leer.dato();
		}
		for (int i = 0; i < usuarios.length; i++) {
			
			System.out.println((i + 1)+". "+ usuarios[i]);
			
		}
		
		System.out.println("Diga los dos usuarios que desea comparar: ");
		usu1 = Leer.datoInt() - 1;
		usu2 = Leer.datoInt() - 1;
		
		if (usuarios[usu1].equals(usuarios[usu1]) == usuarios[usu2].equals(usuarios[usu2])) {
			
			System.out.println("El nombre es igual");
			
		}
	}

}
