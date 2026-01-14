package ejemplo_lectura_teclado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad;
		
		System.out.println ("Introduzca su nombre: ");
		nombre = Leer.dato();	
		System.out.println ("Introduzca su edad: ");
		edad = Leer.datoInt();
		System.out.println ("Su nombre es "+ nombre + " y tiene " + edad + " años");
		
		
		
		
		
		
	}

}
