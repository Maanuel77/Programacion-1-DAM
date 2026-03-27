package todo_Implementado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    
    // Colección tipo List instanciada como ArrayList (como pide el PDF)
    private List<Evento> listaEventos;

    public Agenda() {
        this.listaEventos = new ArrayList<>();
    }

    // Devolver el Iterator para imprimir en el main
    public Iterator<Evento> obtenerIterator() {
        return listaEventos.iterator();
    }

    // Añadir comprobando que no se repitan nombres (como pide el PDF)
    public boolean añadirEvento(Evento nuevo) {
        if (buscarPorNombre(nuevo.getNombre()) != null) {
            return false; // Ya existe un evento con ese nombre
        }
        return listaEventos.add(nuevo);
    }

    // Buscar por nombre devolviendo el objeto o null (como pide el PDF)
    public Evento buscarPorNombre(String nombre) {
        for (Evento e : listaEventos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    // Ordenar usando la clase propia creada anteriormente
    public void ordenarDescendente() {
        Collections.sort(listaEventos, new OrdenadorEventos());
    }

    // Borrar una palabra/evento (ustedes decidís la forma, elegimos por nombre)
    public boolean borrarEvento(String nombre) {
        Evento e = buscarPorNombre(nombre);
        if (e != null) {
            return listaEventos.remove(e);
        }
        return false;
    }
}