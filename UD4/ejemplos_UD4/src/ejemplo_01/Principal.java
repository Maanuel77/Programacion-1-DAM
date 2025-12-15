package ejemplo_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cant;
		
		Persona p1 = new Persona("Manuel","Martínez Manzano", "26505243E", 23, 18);
		
		System.out.println("Datos. "+ p1);
		
		Alumno a1 = new Alumno ("Manuel", "Martinez Manzano", "26505123E", 22, 32, "1ºDAM", 9.8, "Programación");
		
		System.out.println("Datos: "+ a1);
		
		Profesor pf1 = new Profesor ("Angel coding god", "Naranjo","1387643E", 22, 21, "Programacion", 2887.23, 'h');
		
		System.out.println("Datos: "+ pf1);
		
		System.out.println("Diga años a sumar: ");
		cant = Leer.datoInt();
		System.out.println("Ahora tienes " + p1.sumar_Edad(cant)+ " años");
		
		System.out.println("Diga años a sumar: ");
		cant = Leer.datoInt();
		System.out.println("Ahora tienes " + a1.sumar_Edad(cant)+ " años");
	}

}

//Al reescribir un método en una clase hija se copia el método exactamente igual y se cambia solamente lo de dentro de las llaves {} 
