package ejercicio_11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nombre;
	String curso;
	double [] notas;
	int tam, opcion;
	
	GestionNotas gn;
	Alumno a;
	
	System.out.println("Diga el nombre del alumno");
	nombre = Leer.dato();
	System.out.println("Diga el curso del alumno:");
	curso = Leer.dato();
	System.out.println("Diga cuantas notas va a querer introducir: ");
	tam = Leer.datoInt();
	
	notas = new double [tam];
	for (int i = 0; i < notas.length; i++) {
		
		System.out.println("Nota "+(i + 1)+":");
		notas [i] = Leer.datoDouble();
	}
	do {
	System.out.println("\n\nDiga que quiere calcular: ");
	System.out.println("1. Nota media");
	System.out.println("2. Número de suspensos");
	System.out.println("3. Informe entero de notas");
	System.out.println("4. Salir");
	opcion = Leer.datoInt();
	
	a = new Alumno (nombre,curso,notas,0,0);
	gn = new GestionNotas (a);
	
	switch (opcion) {
	
	case 1:
		System.out.printf("La nota media es: %.2f",a.calcular_Nota_Media());
		break;
	case 2:
		System.out.println("El número de suspensos es: "+a.calcular_Num_Suspensos());
		break;
	case 3:
		gn.imprimir_Todo();
		break;
	case 4:
		System.out.println("Adios.");
		break;
	default:
	
	}
	
	
	}while (opcion != 4);
	}

}
