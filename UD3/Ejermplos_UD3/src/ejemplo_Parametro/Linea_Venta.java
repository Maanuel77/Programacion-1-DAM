package ejemplo_Parametro;

public class Linea_Venta {

	private Producto p1;
	private int cantidad;
	private double subTotal;
	
	public Linea_Venta(Producto p1, int cantidad) {
		super();
		this.p1 = p1;
		this.cantidad = cantidad;
	}
	
	public Linea_Venta(Producto p1, int cantidad, double subTotal) {
		super();
		this.p1 = p1;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	public Producto getP1() {
		return p1;
	}

	public void setP1(Producto p1) {
		this.p1 = p1;
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

	@Override
	public String toString() {
		return "Linea_Venta [p1=" + p1 + ", cantidad=" + cantidad + ", subTotal=" + subTotal + "]";
	}
	
	public double subtotal (double por) {
		
		double resultado = 0.0; 
		resultado = p1.calcularPVP(por) * cantidad;
		subTotal = resultado;
		return resultado;
	} 
	
}
