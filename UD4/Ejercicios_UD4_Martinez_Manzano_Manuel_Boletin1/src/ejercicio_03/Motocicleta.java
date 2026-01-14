package ejercicio_03;

public class Motocicleta extends Vehiculos{

	private double impuesto_Adicional;
	private double cilindrada;
	
	public Motocicleta(int tipo, double impuesto_Fijo, double impuesto_Adicional, double cilindrada) {
		super(tipo, impuesto_Fijo);
		this.impuesto_Adicional = impuesto_Adicional;
		this.cilindrada = cilindrada;
	}
	
	public double getImpuesto_Adicional() {
		return impuesto_Adicional;
	}
	
	public void setImpuesto_Adicional(double impuesto_Adicional) {
		this.impuesto_Adicional = impuesto_Adicional;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	
	
	
}
