package ejemplo_01;

public class Persona {

	//Se hereda todo menos los constructores 
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int id;
	private int edad;
	
	public Persona(String nombre, String apellidos, String dni, int id, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.id = id;
		this.edad = edad;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", id=" + id + ", edad="
				+ edad + "]";
	}
	
	public int sumar_Edad (int cant) {
		int result = 0;
		
		result = edad + cant;
		
		return result;
	}
	
	
}
