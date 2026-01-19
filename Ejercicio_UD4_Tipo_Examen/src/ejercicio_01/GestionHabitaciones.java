package ejercicio_01;

public class GestionHabitaciones {
    private Habitacion[] habitaciones;

    public GestionHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Habitacion[] getListaHabitaciones() {
        return habitaciones;
    }

    public Habitacion getHabitacion(int indice) {
        if (indice >= 0 && indice < habitaciones.length) {
            return habitaciones[indice];
        }
        return null; 
    }

    public double calcularPrecioConcreto(int indice, double descuento) {
        if (indice >= 0 && indice < habitaciones.length) {
            if (habitaciones[indice].isOcupada()) {
                return habitaciones[indice].calcularPrecio(descuento);
            }
        }
        return -1;
    }

    public double calcularRecaudacionTotal(double descuento) {
        double acumulado = 0;
        for (Habitacion h : habitaciones) {
            if (h.isOcupada()) {
                acumulado += h.calcularPrecio(descuento);
            }
        }
        return acumulado;
    }
}