package ejercicio_04;

public class Producto {

	private double precio;
	private String nombre;
	private String id;
	
	
	//Constructor
	public Producto(double precio, String nombre, String id) {
		this.precio = precio;
		this.nombre = nombre;
		this.id = id;
	}
	
	
	//Getters and setters
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", nombre=" + nombre + ", id=" + id + "]";
	}

	
	
}
