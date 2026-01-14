package ejercicio_05;

public class Ticket {

	private int num_Identificativo;
	private double precio = 7.5;
	private boolean ocupacion;
	private int fila;
	private int num_Butaca;
	
	public Ticket(int num_Identificativo, boolean ocupacion, int fila, int num_Butaca) {
		super();
		this.num_Identificativo = num_Identificativo;
		this.ocupacion = ocupacion;
		this.fila = fila;
		this.num_Butaca = num_Butaca;
	}
	public Ticket () {
		
		
	}

	public int getNum_Identificativo() {
		return num_Identificativo;
	}

	public void setNum_Identificativo(int num_Identificativo) {
		this.num_Identificativo = num_Identificativo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getNum_Butaca() {
		return num_Butaca;
	}

	public void setNum_Butaca(int num_Butaca) {
		this.num_Butaca = num_Butaca;
	}

	@Override
	public String toString() {
		return "Ticket [num_Identificativo=" + num_Identificativo + ", precio=" + precio + ", ocupacion=" + ocupacion
				+ ", fila=" + fila + ", num_Butaca=" + num_Butaca + "]";
	}
	
	public boolean check_Ocupacion (int ocupacion) {
		
		if (ocupacion == 1) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	
}