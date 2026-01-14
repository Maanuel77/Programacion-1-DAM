package ejercicio_03;

public class Vehiculos {

	private int tipo;
	private double impuesto_Fijo;
	
	public Vehiculos(int tipo, double impuesto_Fijo) {
		super();
		this.tipo = tipo;
		this.impuesto_Fijo = impuesto_Fijo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getEmisiones() {
		return impuesto_Fijo;
	}

	public void setEmisiones(double impuesto_Fijo) {
		this.impuesto_Fijo = impuesto_Fijo;
	}

	@Override
	public String toString() {
		return "Vehiculos [tipo=" + tipo + ", emisiones=" + impuesto_Fijo + "]";
	}
	
	//SERIA MEJOR PASAR LAS CANTIDADES COMO PARÁMETROS PARA QUE EN CASO DE EDITAR ESA CANTIDAD SE HAGA SOLO.
	public double calcularImpuesto (double porc) {
		double cero = 10, eco = 15, b = 20, c = 25;
		
		switch (tipo) {
		
			case 1:
				return impuesto_Fijo * cero;
			case 2:
				return impuesto_Fijo * eco;
			case 3:
				return impuesto_Fijo * b;
			case 4:
				return impuesto_Fijo * c;
			default:
				
				return -1;
 		
		}
		
	}
	
}
