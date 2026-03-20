package ejemplo_02;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dni = null;
		Alumno a2 = new Alumno (dni);

		Set <String> conjunto1 = new HashSet <> ();
		
		conjunto1.add("Mimimimimimi");
		conjunto1.add("LuisMiguel");
		System.out.println(conjunto1);
		conjunto1.add("luismiguel");
		conjunto1.add("Luis Miguel");
		System.out.println(conjunto1);
		
		Set <Alumno> alumno = new HashSet <> ();
		
		Alumno a1 = new Alumno ("Manuel", "29505296E", 9.75);
		alumno.add(a1);
		alumno.add(new Alumno ("Angel", "12345767R", 2.6));
		System.out.println(alumno);
		
		//Añadir un apartado para comprobar si existe un alumno a través de su DNI
		
		System.out.println ("Introduce el DNI del alumno que quieres buscar: ");
		dni = Leer.dato();
		
		// Sale error porque el método findByDNI no se ha implementado en la clase AlumnoService, sino en la clase Alumno.
		// Para solucionarlo, se debe crear una instancia de AlumnoService y llamar al método 
		// findByDNI desde esa instancia, pasando el DNI como argumento. Además, el método findByDNI
		// debe ser modificado para buscar en el conjunto de alumnos en lugar de solo en un objeto Alumno.
		
		/**/

		System.out.println("El alumno con DNI " + dni + " es: " + a2.findByDNI(dni));
		
		
	}

}
