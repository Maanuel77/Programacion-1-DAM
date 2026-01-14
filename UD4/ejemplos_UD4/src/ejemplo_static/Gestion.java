package ejemplo_static;

public class Gestion {

	private static double caja;
	
	public Gestion() {
		super();
	}

	public double calcular_Linea_Venta (double ganancia, int cantidad, Producto p) {
		double total = 0.0;
		total = p.calcular_Precio(ganancia) + cantidad;
		caja+=total;
		return total;
	}
	
	
}
