package sesion_04;

/**
 * Clase de utilidad para validar rangos numéricos.
 *
 * @author Manuel y Germán
 * @version 1.0
 * @see IllegalArgumentException
 */
public class RangeValidator {

    /**
     * Comprueba si un valor numérico se encuentra dentro de un rango específico (ambos inclusive).
     *
     * @param valor  El número entero que se desea comprobar.
     * @param minimo El límite inferior del rango permitido.
     * @param maximo El límite superior del rango permitido.
     * @return true si el valor está entre el mínimo y el máximo (incluidos); false en caso contrario.
     * @throws IllegalArgumentException Si el valor de 'minimo' es estrictamente mayor que el de 'maximo'.
     */
    public boolean estaEnRango(int valor, int minimo, int maximo) {
        if (minimo > maximo) {
            throw new IllegalArgumentException("El mínimo no puede ser mayor que el máximo");
        }

        return valor >= minimo && valor <= maximo;
    }
}
