package ejemplo_01;

public class Profesor extends Persona{

	private String asignatura;
	private double sueldo;
	private char sexo;
	
	public Profesor(String nombre, String apellidos, String dni, int id, int edad, String asignatura, double sueldo,
			char sexo) {
		super(nombre, apellidos, dni, id, edad);
		this.asignatura = asignatura;
		this.sueldo = sueldo;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return super.toString()+"Profesor [asignatura=" + asignatura + ", sueldo=" + sueldo + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
}
