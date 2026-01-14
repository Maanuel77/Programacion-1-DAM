package ejercicio_04;

public class Alimentacion extends Producto{

	private double descuento;

	public Alimentacion(double precio, String nombre, String id, double descuento) {
		super(precio, nombre, id);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + "]";
	}
	
	
	public boolean comprobarCaducidad(int caduca) {
		double dos=2;
		if(caduca<dos) {
			return true;
		}
		return false;
	}
}