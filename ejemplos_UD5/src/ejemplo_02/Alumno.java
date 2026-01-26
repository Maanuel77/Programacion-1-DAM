package ejemplo_02;

public class Alumno {

	private String nombre;
	private String DNI;
	private double nota_Media;
	
	
	public Alumno(String nombre, String dNI, double nota_Media) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.nota_Media = nota_Media;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public double getNota_Media() {
		return nota_Media;
	}
	public void setNota_Media(double nota_Media) {
		this.nota_Media = nota_Media;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", DNI=" + DNI + ", nota_Media=" + nota_Media + "]";
	}
	
	
	
}
