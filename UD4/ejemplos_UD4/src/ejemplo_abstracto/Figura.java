package ejemplo_abstracto;

public abstract class Figura {

	private double x;
	private double y;
	
	public abstract double calcularArea ();//NO SE LE PONEN LLAVES A LOS MÉTODOS ABSTRACTOS

	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	
}
