package ejemplo_polimorfismo;

public class Cuadrado extends Figura {
	

	private double lado;

	public Cuadrado() {
	}

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
	this.lado = lado;
	}
	
	public double calcular_Area () {
		
		return lado * lado;
		
	}
	
	public double calcular_Perimetro () {
		
		return lado * 4;
		
	}
	
	public void mostrar_Lados ( ) {
		
		
		
	}

	public String toString() {
		return "Cuadrado [lado=" + lado + ", toString()=" + super.toString() + "]";
	}

	
	
	
}