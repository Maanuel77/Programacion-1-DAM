package ejercicio_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Representa una nota de texto simple con título, contenido y fecha de creación.
 */
public class Nota implements Comparable<Nota>{

    private String titulo;
    private String texto;
    private String fechaCreacion;

    public Nota(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.fechaCreacion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return "Nota [titulo=" + titulo + ", fecha=" + fechaCreacion + ", texto=" + texto + "]";
    }

	@Override
	public int compareTo(Nota o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
