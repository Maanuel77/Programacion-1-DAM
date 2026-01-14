package ejemplo_static;

public class Producto {

	private String nombre;
	private double precio_Base;
	private static int contador;
	
	public Producto(String nombre, double precio_Base) {
		super();
		this.nombre = nombre;
		this.precio_Base = precio_Base;
	}
	
	public double calcular_Precio (double ganancia) {
		
		return precio_Base + precio_Base * ganancia / 100;
		
		
	}
	
	
}
