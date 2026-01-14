package ejercicio_04;

public class Electronica extends Producto{

	private double impuesto;

	public Electronica(double precio, String nombre, String id, double impuesto) {
		super(precio, nombre, id);
		this.impuesto = impuesto;
	}

	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + "]";
	}
	
	public double calcularPVP (double desc, int tope) {
		
		return 0.0;
		
	}
	
	
	
	
}
