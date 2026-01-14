package ejercicio_03;

public class Furgonetas extends Vehiculos{

	private double impuesto_Adicional;
	private double transporte_Mercancias;
	
	public Furgonetas(char tipo, double impuesto_Fijo, double impuesto_Adicional, double transporte_Mercancias) {
		super(tipo, impuesto_Fijo);
		this.impuesto_Adicional = impuesto_Adicional;
		this.transporte_Mercancias = transporte_Mercancias;
	}

	public double getImpuesto_Adicional() {
		return impuesto_Adicional;
	}

	public void setImpuesto_Adicional(double impuesto_Adicional) {
		this.impuesto_Adicional = impuesto_Adicional;
	}

	public double getTransporte_Mercancias() {
		return transporte_Mercancias;
	}

	public void setTransporte_Mercancias(double transporte_Mercancias) {
		this.transporte_Mercancias = transporte_Mercancias;
	}
	
	
	
	
}
