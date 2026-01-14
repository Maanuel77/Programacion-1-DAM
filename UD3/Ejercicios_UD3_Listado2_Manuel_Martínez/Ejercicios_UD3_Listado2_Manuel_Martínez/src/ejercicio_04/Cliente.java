package ejercicio_04;

public class Cliente {

	String dni, nombre, apellidos;
	boolean activo;
	int edad;
	double peso, altura;
	
	
	public Cliente(String dni, String nombre, String apellidos, boolean activo, int edad, double peso, double altura) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.activo = activo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC (double peso, double altura) {
		
		return peso / Math.pow(altura,2);
		
	}
	
	
	
	
}