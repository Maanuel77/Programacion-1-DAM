package ejercicio_01;

public class Suite extends Habitacion {
    private double metrosCuadrados;
    private double consumoServicioHabitaciones;

    public Suite(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numeroOcupantes, 
                 double metrosCuadrados, double consumoServicioHabitaciones) {
        super(precioBase, ocupada, nombreCliente, diasOcupacion, numeroOcupantes);
        this.metrosCuadrados = metrosCuadrados;
        this.consumoServicioHabitaciones = consumoServicioHabitaciones;
    }

    @Override
    public double calcularPrecio(double porcentaje_Descuento) {
        double costo_Estancia = super.getPrecioBase() * super.getDiasOcupacion();
        
        double descuento = costo_Estancia * (porcentaje_Descuento / 100);
        
        return (costo_Estancia - descuento) + consumoServicioHabitaciones;
    }

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", consumoServicioHabitaciones="
				+ consumoServicioHabitaciones + "]";
	}

    
    
}
