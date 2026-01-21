package ejercicio;

public class Trabajador implements IDesglosable {
    private int id;
    private String nombre;
    private double sueldo_Base;
    private int anios_Trabajados;

    public Trabajador(int id, String nombre, double sueldo_Base, int anios_Trabajados) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo_Base = sueldo_Base;
        this.sueldo_Base = anios_Trabajados;
    }
    
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSueldo_Base() {
		return sueldo_Base;
	}



	public void setSueldo_Base(double sueldo_Base) {
		this.sueldo_Base = sueldo_Base;
	}



	public int getAnios_Trabajados() {
		return anios_Trabajados;
	}



	public void setAnios_Trabajados(int anios_Trabajados) {
		this.anios_Trabajados = anios_Trabajados;
	}



	public double calcular_Sueldo_Bruto(double plus_Antiguedad, double incentivo_Variable) {
        return sueldo_Base + (sueldo_Base * plus_Antiguedad);
    }

 
    public double calcular_Sueldo_Neto(double sueldo_Bruto, double porcentaje_Impuesto) {
        double cantidad_Impuesto = sueldo_Bruto * (porcentaje_Impuesto / 100);
        return sueldo_Bruto - cantidad_Impuesto;
    }

    public String get_Nombre() {
    	
    	return nombre; 
    	
    }

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", sueldo_Base=" + sueldo_Base + ", anios_Trabajados="
				+ anios_Trabajados + "]";
	}

    
}
