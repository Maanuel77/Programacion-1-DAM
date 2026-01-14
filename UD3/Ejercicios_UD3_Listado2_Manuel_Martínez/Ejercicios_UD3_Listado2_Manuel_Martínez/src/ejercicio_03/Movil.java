package ejercicio_03;

public class Movil {

	String marca;
	String modelo;
	double precio_Unitario;
	boolean vendido;
	boolean nuevo;
	
	public Movil (String marca, String modelo, double precio_Unitario, boolean vendido, boolean nuevo) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio_Unitario = precio_Unitario;
		this.vendido = vendido;
		this.nuevo = nuevo;
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioUnitario() {
		return precio_Unitario;
	}

	public void setPrecioUnitario(double precio_Unitario) {
		this.precio_Unitario = precio_Unitario;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", precio_Unitario=" + precio_Unitario + ", vendido="
				+ vendido + ", nuevo=" + nuevo + "]";
	}
	
}