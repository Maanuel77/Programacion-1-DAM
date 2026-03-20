package ejercicio_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que gestiona la colección de notas y proporciona métodos sin IO.
 * Todos los métodos devuelven datos o valores, no realizan impresiones.
 */
public class GestorNotas {

    private final List<Nota> notas;

    public GestorNotas() {
        this.notas = new ArrayList<>();
    }

    public List<Nota> getNotas() {
        return Collections.unmodifiableList(notas);
    }

    public int contar() {
        return notas.size();
    }

    public void agregarNota(String titulo, String texto) {
        notas.add(new Nota(titulo, texto));
    }

    public String findbyTitulo ( String titulo) {
    	// Busca la primera nota que coincida con el título (ignorando mayúsculas) y devuelve su texto.
		for (Nota n : notas) {
			if (n.getTitulo().equalsIgnoreCase(titulo)) {
				return n.getTexto();
			}
		}
		return null;
    }
    
    public boolean borrarNota(int indice1Based) {
        int idx = indice1Based - 1;
        if (idx < 0 || idx >= notas.size()) return false;
        notas.remove(idx);
        return true;
    }

    public Nota obtenerNota(int indice1Based) {
        int idx = indice1Based - 1;
        if (idx < 0 || idx >= notas.size()) return null;
        return notas.get(idx);
    }

    public List<String> listarTitulosConFechas() {
        List<String> salida = new ArrayList<>();
        int i = 1;
        for (Nota n : notas) {
            salida.add(i++ + ". " + n.getTitulo() + " (" + n.getFechaCreacion() + ")");
        }
        return salida;
    }

}
