package ejemplo_02;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <String> conjunto1 = new HashSet <String> ();
		
		conjunto1.add("Mimimimimimi");
		conjunto1.add("LuisMiguel");
		System.out.println(conjunto1);
		conjunto1.add("luismiguel");
		conjunto1.add("Luis Miguel");
		System.out.println(conjunto1);
		
		Set <Alumno> alumno = new HashSet <Alumno> ();
		
		Alumno a1 = new Alumno ("Manuel", "29505296E", 9.75);
		alumno.add(a1);
		alumno.add(new Alumno ("Angel", "12345767R", 2.6));
		System.out.println(alumno);
		
	}

}
