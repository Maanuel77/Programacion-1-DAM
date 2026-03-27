package todo_Implementado;

import java.util.Comparator;

public class OrdenadorEventos implements Comparator<Evento> {

    @Override
    public int compare(Evento e1, Evento e2) {
        // Al poner e2.compareTo(e1) en lugar de e1.compareTo(e2), 
        // conseguimos el orden alfabético descendente (de la Z a la A)
        return e2.getNombre().compareToIgnoreCase(e1.getNombre());
    }
}
