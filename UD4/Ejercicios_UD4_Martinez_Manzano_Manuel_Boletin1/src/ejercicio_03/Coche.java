package ejercicio_03;

public class Coche extends Vehiculos{

	private double impuesto_Adicional;
	private double potencia;
	
	public Coche(int tipo, double impuesto_Fijo, double impuesto_Adicional, double potencia) {
		super(tipo, impuesto_Fijo);
		this.impuesto_Adicional = impuesto_Adicional;
		this.potencia = potencia;
	}
	public double getImpuesto_Adicional() {
		return impuesto_Adicional;
	}
	public void setImpuesto_Adicional(double impuesto_Adicional) {
		this.impuesto_Adicional = impuesto_Adicional;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public double calcular_Impuestos (double porc) {
		return super.calcularImpuesto(porc) + potencia*(porc/100);		
	}
	
	
}
