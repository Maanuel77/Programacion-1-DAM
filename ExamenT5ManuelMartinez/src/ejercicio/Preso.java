package ejercicio;

public class Preso implements Comparable<Preso> {

    private String nombre;
    private String dni;
    private boolean delitoSangre;
    private int diasCondena;

    public Preso(String nombre, String dni, boolean delitoSangre, int diasCondena) {
        this.nombre = nombre;
        this.dni = dni;
        this.delitoSangre = delitoSangre;
        this.diasCondena = diasCondena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isDelitoSangre() {
        return delitoSangre;
    }

    public void setDelitoSangre(boolean delitoSangre) {
        this.delitoSangre = delitoSangre;
    }

    public int getDiasCondena() {
        return diasCondena;
    }

    public void setDiasCondena(int diasCondena) {
        this.diasCondena = diasCondena;
    }

    public int calcularDiasFinales(int diasExtra) {
        if (delitoSangre) {
        	Preso.this.diasCondena = diasCondena + diasExtra;
            return diasCondena;
        } else {
            return diasCondena;
        }
    }

    @Override
    public String toString() {
        return "Preso [DNI=" + dni + ", Nombre=" + nombre + ", Delito de Sangre=" + delitoSangre
                + ", Días Condena=" + diasCondena + "]";
    }

    @Override
    public int compareTo(Preso p) {
        if (this.diasCondena < p.getDiasCondena()) {
            return 1;
        } else if (this.diasCondena > p.getDiasCondena()) {
            return -1;
        }
        return 0;
    }
}