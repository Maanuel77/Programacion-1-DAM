package ejercicio_01;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String nombreCurso;
    private double notaMedia;
    private int edad;

    public Alumno(String nombre, String apellidos, String nombreCurso, double notaMedia, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.notaMedia = notaMedia;
        this.edad = edad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getNombreCurso() { return nombreCurso; }
    public double getNotaMedia() { return notaMedia; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return String.format("Alumno[Nombre: %s %s, Curso: %s, Nota: %.2f, Edad: %d]", 
                nombre, apellidos, nombreCurso, notaMedia, edad);
    }
}