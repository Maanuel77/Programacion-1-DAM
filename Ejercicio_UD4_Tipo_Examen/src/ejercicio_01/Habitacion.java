package ejercicio_01;

public class Habitacion {

	    private double precioBase;
	    private boolean ocupada;
	    private String nombreCliente;
	    private int diasOcupacion;
	    private int numeroOcupantes;

	    // Constructor
	    public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numeroOcupantes) {
	        this.precioBase = precioBase;
	        this.ocupada = ocupada;
	        this.nombreCliente = nombreCliente;
	        this.diasOcupacion = diasOcupacion;
	        this.numeroOcupantes = numeroOcupantes;
	    }
	    
	    public double getPrecioBase() {
			return precioBase;
		}

		public void setPrecioBase(double precioBase) {
			this.precioBase = precioBase;
		}

		public int getDiasOcupacion() {
			return diasOcupacion;
		}

		public void setDiasOcupacion(int diasOcupacion) {
			this.diasOcupacion = diasOcupacion;
		}

		public int getNumeroOcupantes() {
			return numeroOcupantes;
		}

		public void setNumeroOcupantes(int numeroOcupantes) {
			this.numeroOcupantes = numeroOcupantes;
		}

		public void setOcupada(boolean ocupada) {
			this.ocupada = ocupada;
		}

		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}

		

	    public boolean isOcupada() {
	        return ocupada;
	    }
	    
	    public String getNombreCliente() {
	        return nombreCliente;
	    }
	    public double calcularPrecio(double porcentajeDescuento) {
	        return precioBase * diasOcupacion;
	    }
		@Override
		public String toString() {
			return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
					+ ", diasOcupacion=" + diasOcupacion + ", numeroOcupantes=" + numeroOcupantes + "]";
		}


	}
