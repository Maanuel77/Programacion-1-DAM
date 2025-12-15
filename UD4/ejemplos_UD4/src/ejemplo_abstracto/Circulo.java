package ejemplo_abstracto;

public class Circulo extends Figura{

	private double radio;

	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}



	@Override
	public double calcularArea() {

		return 0;
	}



	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
}
