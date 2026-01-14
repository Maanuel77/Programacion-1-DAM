package ejercicio;

public class Profesor {

	private String nombre;
	private int id;
	private int anios_Antiguedad;
	private int horas_Trabajadas;
	private double cant_Sueldo = 14.3; 
	private double porc = 20;
	private double sueldo;
	
	public Profesor(String nombre, int id, int anios_Antiguedad, int horas_Trabajadas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.anios_Antiguedad = anios_Antiguedad;
		this.horas_Trabajadas = horas_Trabajadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnios_Antiguedad() {
		return anios_Antiguedad;
	}
	public void setAnios_Antiguedad(int anios_Antiguedad) {
		this.anios_Antiguedad = anios_Antiguedad;
	}
	public int getHoras_Trabajadas() {
		return horas_Trabajadas;
	}
	public void setHoras_Trabajadas(int horas_Trabajadas) {
		this.horas_Trabajadas = horas_Trabajadas;
	}
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", id=" + id + ", anios_Antiguedad=" + anios_Antiguedad
				+ ", horas_Trabajadas=" + horas_Trabajadas + "]";
	}
	
	public double calcular_Sueldo () {
		int cien = 100;
		
		
		sueldo = (horas_Trabajadas * cant_Sueldo);
		sueldo = sueldo - (sueldo * porc/cien);
		
		return sueldo;
	}
	
}
