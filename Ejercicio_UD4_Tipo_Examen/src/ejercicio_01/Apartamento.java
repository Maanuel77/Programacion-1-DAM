package ejercicio_01;

public class Apartamento extends Habitacion {
    private boolean servicioLimpieza;
    private double PRECIO_LIMPIEZA = 50.0;

    public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numeroOcupantes, 
                       boolean servicioLimpieza) {
        super(precioBase, ocupada, nombreCliente, diasOcupacion, numeroOcupantes);
        this.servicioLimpieza = servicioLimpieza;
    }

    @Override
    public double calcularPrecio(double porcentajeDescuento) {
        double total = super.getPrecioBase() * super.getDiasOcupacion();
        if (servicioLimpieza) {
            total += PRECIO_LIMPIEZA;
        }
        return total;
    }

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + ", PRECIO_LIMPIEZA=" + PRECIO_LIMPIEZA + "]";
	}

}
