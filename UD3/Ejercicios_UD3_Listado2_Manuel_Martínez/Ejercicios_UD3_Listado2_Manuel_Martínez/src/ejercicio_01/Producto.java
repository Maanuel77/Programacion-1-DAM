package ejercicio_01;

public class Producto {

	private String nombre;
	private double precio_Fabrica;
	private boolean fragil;
	private double precio_Coste;
	private int id;
	
	public Producto(String nombre, double precio_Fabrica, boolean fragil, double precio_Coste, double coste_Transporte
) {
		super();
		this.nombre = nombre;
		this.precio_Fabrica = precio_Fabrica;
		this.fragil = fragil;
		this.precio_Coste = precio_Coste;
	}
	public Producto () {
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio_Fabrica() {
		return precio_Fabrica;
	}

	public void setPrecio_Fabrica(double precio_Fabrica) {
		this.precio_Fabrica = precio_Fabrica;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public double getPrecio_Coste() {
		return precio_Coste;
	}

	public void setPrecio_Coste(double precio_Coste) {
		this.precio_Coste = precio_Coste;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio_Fabrica=" + precio_Fabrica + ", fragil=" + fragil
				+ ", precio_Coste=" + precio_Coste +"]";
	}

	public int generar_ID () {
		
		id ++;
		
		return id;
	}
	public boolean comprobar_Fragil_Boleano (int fragil) {
		
		if (fragil == 1) {
			
			return true;
		
		}else {
			
			return false;
			
		}
		
	}
	
}
	
	