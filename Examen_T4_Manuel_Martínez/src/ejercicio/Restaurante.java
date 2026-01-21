package ejercicio;

import java.util.Arrays;

public class Restaurante {
    private String nombre_Restaurante;
    private Trabajador[] trabajadores;

    public Restaurante(String nombre_Restaurante, Trabajador[] trabajadores) {
        this.nombre_Restaurante = nombre_Restaurante;
        this.trabajadores = trabajadores;
    }

    public double get_Sueldo_Trabajador(int indice, double plus_Antiguedad, double incentivo) {
        if(indice >= 0 && indice < trabajadores.length) {
            return trabajadores[indice].calcular_Sueldo_Bruto(plus_Antiguedad, incentivo);
        }
        return 0.0;
    }

    public Trabajador get_Trabajador(int indice) {
        if(indice >= 0 && indice < trabajadores.length) {
            return trabajadores[indice];
        }
        return null;
    }

    public double calcular_Total_Solo_Ayudantes(double plus_Antiguedad, double precio_Hora) {
        double total = 0;
        for (Trabajador t : trabajadores) {
            if (t instanceof Ayudante) {
                total += t.calcular_Sueldo_Bruto(plus_Antiguedad, precio_Hora);
            }
        }
        return total;
    }


    public double calcular_Nomina_Total(double plus_Antiguedad, double incentivo_General) {
        double total = 0;
        for (Trabajador t : trabajadores) {
            total += t.calcular_Sueldo_Bruto(plus_Antiguedad, incentivo_General);
        }
        return total;
    }
    
    public Trabajador[] get_Lista_Trabajadores() {
        return trabajadores;
    }

	@Override
	public String toString() {
		return "Restaurante [nombre_Restaurante=" + nombre_Restaurante + ", trabajadores="
				+ Arrays.toString(trabajadores) + "]";
	}
    
}
