package ejemplo_01;

public class Alumno extends Persona{

	private String curso;
	private double nota_Media;
	private String asignatura;
	
	public Alumno(String nombre, String apellidos, String dni, int id, int edad, String curso, double nota_Media,
			String asignatura) {
		super(nombre, apellidos, dni, id, edad);
		this.curso = curso;
		this.nota_Media = nota_Media;
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", nota_Media=" + nota_Media + ", asignatura=" + asignatura + ", toString()="
				+ super.toString() + "]";
	}

	public int sumar_Edad (int cant) {
		
		return super.sumar_Edad(cant) - 2;
		
	}
	
	
	
}
