package ejercicio_02;

public class Habitacion {

	private int num_Habitacion;
	private String tipo_Habitacion;
	private double precio_Base;
	private String cliente;
	private boolean limpieza;
	private boolean ocupada;
	private double precio_Extras;
	
	
	public Habitacion() {
		
		
	}
	public Habitacion(int num_Habitacion, String tipo_Habitacion, double precio_Base, String cliente, boolean limpieza,
			boolean ocupada, double precio_Extras) {
		super();
		this.num_Habitacion = num_Habitacion;
		this.tipo_Habitacion = tipo_Habitacion;
		this.precio_Base = precio_Base;
		this.cliente = cliente;
		this.limpieza = limpieza;
		this.ocupada = ocupada;
		this.precio_Extras = precio_Extras;
	}
	
	public int getNum_Habitacion() {
		return num_Habitacion;
	}
	public void setNum_Habitacion(int num_Habitacion) {
		this.num_Habitacion = num_Habitacion;
	}
	public String getTipo_Habitacion() {
		return tipo_Habitacion;
	}
	public void setTipo_Habitacion(String tipo_Habitacion) {
		this.tipo_Habitacion = tipo_Habitacion;
	}
	public double getPrecio_Base() {
		return precio_Base;
	}
	public void setPrecio_Base(double precio_Base) {
		this.precio_Base = precio_Base;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public boolean isLimpieza() {
		return limpieza;
	}
	public void setLimpieza(boolean limpieza) {
		this.limpieza = limpieza;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public double getPrecio_Extras() {
		return precio_Extras;
	}
	public void setPrecio_Extras(double precio_Extras) {
		this.precio_Extras = precio_Extras;
	}
	@Override
	public String toString() {
		return "Habitacion [num_Habitacion=" + num_Habitacion + ", tipo_Habitacion=" + tipo_Habitacion
				+ ", precio_Base=" + precio_Base + ", cliente=" + cliente + ", limpieza=" + limpieza + ", ocupada="
				+ ocupada + "]";
	}
	public String check_Tipo_Habitacion (int tipo_Habitacion) {
		
		String tipo1 = "Sencilla";
		String tipo2 = "Doble";
		String tipo3 = "Triple";
		String error = "Error";
		if (tipo_Habitacion == 1) {
			
			return tipo1;
		}else if (tipo_Habitacion == 2) {
			
			return tipo2;
			
		}else if (tipo_Habitacion == 3){
			
			return tipo3;
			
		}else {
			
			return error;
			
		}
		
	}
	public boolean check_Limpieza (int limpieza) {
		
		if (limpieza == 1) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	public boolean check_Ocupacion (int ocupacion) {
		
		if (ocupacion == 1) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}