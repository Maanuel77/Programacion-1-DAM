package ejercicio;

public class Hijo {

    private String nombre;
    private int id;
    private int edad;
    private int horas_estudiadas;
    private double pagaSemanal;

    public Hijo(String nombre, int id, int edad, int horas_estudiadas) {
        super();
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.horas_estudiadas = horas_estudiadas;
        this.pagaSemanal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHoras_estudiadas() {
        return horas_estudiadas;
    }

    public void setHoras_estudiadas(int horas_estudiadas) {
        this.horas_estudiadas = horas_estudiadas;
    }

    public double getPagaSemanal() {
        return pagaSemanal;
    }

    public void setPagaSemanal(double pagaSemanal) {
        this.pagaSemanal = pagaSemanal;
    }

    public double calcularPaga(double cantidadPorHora, double porcentajeBote) {
        double pagaBruta = this.horas_estudiadas * cantidadPorHora;
        double descuentoBote = pagaBruta * (porcentajeBote / 100);
        this.pagaSemanal = pagaBruta - descuentoBote;
        return this.pagaSemanal;
    }

    @Override
    public String toString() {
        return "Hijo [Nombre=" + nombre + ", ID=" + id + ", Edad=" + edad + 
               ", Horas Estudiadas=" + horas_estudiadas + 
               ", Paga=" + String.format("%.2f", pagaSemanal) + "€]";
    }
}