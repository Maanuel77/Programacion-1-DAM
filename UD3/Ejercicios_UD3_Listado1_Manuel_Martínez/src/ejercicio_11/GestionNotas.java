package ejercicio_11;

public class GestionNotas {

	Alumno a;
	
	public GestionNotas(Alumno a) {
		super();
		this.a = a;
	}

	public Alumno getA() {
		return a;
	}

	public void setA(Alumno a) {
		this.a = a;
	}

	public void introducir_Notas (double [] notass) {
		
		a.setNotas(notass);
		
	}
	public void imprimir_Todo () {
		
		System.out.println("=========================================");
        System.out.println("          INFORME DE NOTAS         ");
        System.out.println("=========================================");

        System.out.println("Nombre del Alumno: " + a.getNombre() + "");
        System.out.println("Curso del Alumno: " + a.getCurso() + "");
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Notas Registradas: ");
        for (int i = 0; i < a.getNotas().length; i++) {
            System.out.print(a.getNotas()[i]);
                System.out.print(" | ");
        }       
        System.out.println("\n-----------------------------------------");
        System.out.println("Número de Suspensos: " + a.calcular_Num_Suspensos() + "");
        System.out.printf("Nota Media Total:    %.2f\n",a.calcular_Nota_Media());
        
        System.out.println("=========================================");
    }	
	
}
