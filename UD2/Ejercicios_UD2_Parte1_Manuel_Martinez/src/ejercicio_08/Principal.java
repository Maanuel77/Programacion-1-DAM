package ejercicio_08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String usuario = "usuario", usuario_Leer;
		int contraseña = 1234, contraseña_Leer;
		
		
		System.out.println("Hola, está ante un programa que dice si el incio de sesión es correcto.");
		System.out.println("Introduzca el usuario: ");
		usuario_Leer = Leer.dato();
		System.out.println("Introduzca la contraseña: ");
		contraseña_Leer = Leer.datoInt();
		
		if (usuario.equals(usuario) == usuario_Leer.equals(usuario_Leer) && contraseña == contraseña_Leer) {
			
			System.out.printf("\n¡Bienvenido %s!",usuario );
			
		}else {
			
			System.out.println("Incorrecto, introduzcalo de nuevo.");
			
		}
		
		System.out.println("\nGracias por usar el programa :)");
		
	}

}
