package ejercicio_01;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cabecera c4;
		String nombre_Asig;
		String aula;
		String fecha;
		
		//Creamos los objetos usando distintos constructores
		
		//1. A cascaporra
		//Con todos los parámetros (de todo lo que hemos usado en la cabecera usamos todo)
		
		Cabecera c1 = new Cabecera ("Programación","1ºDAM","6/11/2025");
		
		//Solamente con dos parámetros
		
		Cabecera c2 = new Cabecera ("Base de Datos", "1ºDAM");
		
		//Sin parámetros
		
		Cabecera c3 = new Cabecera ();
		
		//Uso del get
		c1.get_Nombre_Asig();
		System.out.println("Nombre asignatura: " + c1.get_Nombre_Asig());
		
		//Uso del set 
		c1.set_Nombre_Asig("Lenguaje de marcas");
		System.out.println("Nombre de la asignatura: "+ c1.get_Nombre_Asig());
		
		//2. Leyendo los datos por teclado
		//OJOOOOOOOOOO: Se declaran arriba al principio y se instancian después de leer los datos
		
		//Leemos los datos
		
		System.out.println("Diga el nombre de la asignatura: ");
		nombre_Asig = Leer.dato();
		System.out.println("Diga el nombre del aula: ");
		aula = Leer.dato();
		System.out.println("Diga la fecha de hoy: ");
		fecha = Leer.dato();
		
		c4 = new Cabecera (nombre_Asig, aula, fecha);
		
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		c4.imprimir();
		c1.imprimirV2("Ángel Naranjo");
		
	}

}
