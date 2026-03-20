package ejemplo_ordenar;

import java.util.Comparator;

/**
 * Comparator que ordena Corredor por su tiempo (marca).
 *
 * Soporta formatos de tiempo sencillos: "ss", "mm:ss" y "h:mm:ss".
 * Es null-safe: un corredor o tiempo nulo se considera mayor (aparece al final).
 * Si el parsing falla, realiza una comparación de cadenas independiente de mayúsculas/minúsculas.
 */
public class CompararPorMarca implements Comparator<Corredor> {

    @Override
    public int compare(Corredor c1, Corredor c2) {
        // referencia rápida: mismo objeto -> iguales
        if (c1 == c2) return 0;
        // nulls: colocamos los nulls al final
        if (c1 == null) return 1;
        if (c2 == null) return -1;

        String t1 = safeTrim(c1.getTiempo());
        String t2 = safeTrim(c2.getTiempo());

        if (t1 == null && t2 == null) return 0;
        if (t1 == null) return 1;
        if (t2 == null) return -1;

        Integer s1 = parseTimeToSeconds(t1);
        Integer s2 = parseTimeToSeconds(t2);

        if (s1 != null && s2 != null) {
            return s1.compareTo(s2);
        } else if (s1 != null) {
            // un valor parseado se considera "menor" (más rápido) que uno no parseado
            return -1;
        } else if (s2 != null) {
            return 1;
        } else {
            // fallback: comparación de cadenas case-insensitive
            return t1.toLowerCase().compareTo(t2.toLowerCase());
        }
    }

    // Trim que devuelve null si la cadena está vacía después del trim
    private static String safeTrim(String s) {
        if (s == null) return null;
        s = s.trim();
        return s.isEmpty() ? null : s;
    }

    /**
     * Intenta convertir una cadena de tiempo en segundos.
     * Formatos soportados:
     *  - "ss"       -> segundos
     *  - "mm:ss"    -> minutos y segundos
     *  - "h:mm:ss"  -> horas, minutos y segundos
     *
     * Devuelve null si el formato no puede parsearse.
     */
    private static Integer parseTimeToSeconds(String time) {
        try {
            String[] parts = time.split(":");
            if (parts.length == 1) {
                return Integer.parseInt(parts[0]);
            } else if (parts.length == 2) {
                int minutes = Integer.parseInt(parts[0]);
                int seconds = Integer.parseInt(parts[1]);
                return minutes * 60 + seconds;
            } else if (parts.length == 3) {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                int seconds = Integer.parseInt(parts[2]);
                return hours * 3600 + minutes * 60 + seconds;
            } else {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }

}