package ejercicio;

public class Hijo {

	//No se les da valores a los atributos aqui, al declararlos
	//Para eso ya tenemos al constructor
    private String nombre;
    private int id;
    private int edad;
    private int horas_Estudiadas;
    
	public Hijo(String nombre, int id, int edad, int horas_Estudiadas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.horas_Estudiadas = horas_Estudiadas;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getHoras_estudiadas() {
		return horas_Estudiadas;
	}
	public void setHoras_estudiadas(int horas_estudiadas) {
		this.horas_Estudiadas = horas_estudiadas;
	}
	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", horas_estudiadas=" + horas_Estudiadas
				+ "]";
	}
	
	//Forma más rápida de calcular la paga (recomendada)
    public double calcular_Paga (double cant, double porc) {
    	
    	return (horas_Estudiadas * cant) - (horas_Estudiadas * cant * porc/100);
    	
    }
    
    //Guardando horas * cant en una variable para facilitar los cálculos
    public double calcular_Paga_V2 (double cant, double porc) {
    	
    	double result;
    	result = horas_Estudiadas *cant;
    	return result - (result * porc/100);
    	
    }
	
}
