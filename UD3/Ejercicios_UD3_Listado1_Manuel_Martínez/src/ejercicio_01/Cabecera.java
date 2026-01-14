package ejercicio_01;

public class Cabecera {
	
	private String nombre_Asig;
	private String aula; 
	private String fecha;
	
	//Vamos a crear varios constructores
	//Con todos los parámetros
	public Cabecera(String nombre_Asig, String aula, String fecha) {
		
		this.nombre_Asig = nombre_Asig;
		this.aula = aula;
		this.fecha = fecha;
		
	}
	//Vacío
	public Cabecera () {
	}
	
	//Con dos parámetros
	public Cabecera (String nombre_Asig, String aula) {
		
		this.nombre_Asig = nombre_Asig;
		this.aula = aula;
		
	}
	public String get_Nombre_Asig () {
		
		return nombre_Asig;
	}
	public void set_Nombre_Asig (String nombre_Asig) {
		
		this.nombre_Asig = nombre_Asig;
		
	}
	
	public String get_Aula () {
		
		return aula;
	}
	
	public void set_Aula (String aula) {
		
		this.aula = aula;
		
	}
	
	public String get_Fecha () {
		
		return fecha;
	}
	
	public void set_Fecha (String fecha) {
		
		this.fecha = fecha;
		
	}
	
	
	public void imprimir () {
		
		System.out.println("------------------SALESIANOS TRIANA---------------------");
		System.out.printf("%s\t\t%s\t\t\t%s", nombre_Asig, aula, fecha);
		System.out.println("\n--------------------------------------------------------");
		
	}
	public void imprimirV2(String nombre_Profe) {
	
		System.out.println("------------------SALESIANOS TRIANA---------------------");
		System.out.println("Nombre profesor: "+ nombre_Profe);
		System.out.printf("%s\t\t%s\t\t\t%s", nombre_Asig, aula, fecha);
		System.out.println("\n--------------------------------------------------------");
		
	}
	@Override
	public String toString() {
		return "Cabecera [nombre_Asig=" + nombre_Asig + ", aula=" + aula + ", fecha=" + fecha + "]";
	}
	
}