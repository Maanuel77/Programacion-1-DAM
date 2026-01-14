package ejemplo_polimorfismo;

public abstract class Figura {

	private String nombre, color;

	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public Figura() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	public abstract double calcular_Area ();
	public abstract double calcular_Perimetro ();
	
	public void metodo_Solo_De_Figura () {}
	
}
