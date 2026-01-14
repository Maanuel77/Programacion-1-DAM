package ejemplo_Parametro;

public class Linea_Venta2 {

	private int cantidad;
	private double subTotal;
	
	public Linea_Venta2(int cantidad, double subTotal) {
		super();
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}
	
	public Linea_Venta2(int cantidad) {
		super();
		this.cantidad = cantidad;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double subtotal (double por) {
		
		double resultado = 0.0; 
		subTotal = resultado;
		return resultado;
	}
	
}
