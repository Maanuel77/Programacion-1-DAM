package ejemplo_Parametro;

public class Producto {

	private String nombre;
	private boolean refrigerado;
	private double precio_Base;
	
	
	public Producto(String nombre, boolean refrigerado, double precio_Base) {
		super();
		this.nombre = nombre;
		this.refrigerado = refrigerado;
		this.precio_Base = precio_Base;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isRefrigerado() {
		return refrigerado;
	}


	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}


	public double getPrecio_Base() {
		return precio_Base;
	}


	public void setPrecio_Base(double precio_Base) {
		this.precio_Base = precio_Base;
	}
	//Suma al precio base un porcentaje si es refrigerado 
	public double calcularPVP (double por) {
		double total = 0;
		double den = 100;
		if (refrigerado) {	
			total =precio_Base + (precio_Base * por/den);	
		}else {	
			total = precio_Base;	
		}
		return total;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", refrigerado=" + refrigerado + ", precio_Base=" + precio_Base + "]";
	}
	
	
}
