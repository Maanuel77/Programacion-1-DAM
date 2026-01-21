package ejercicio;

public class Ayudante extends Trabajador {
	
    private int horas_Extra;

    
    public Ayudante(int id, String nombre, double sueldo_Base, int anios_Trabajados, int horas_Extra) {
		super(id, nombre, sueldo_Base, anios_Trabajados);
		this.horas_Extra = horas_Extra;
    }

	public int getHoras_Extra() {
		return horas_Extra;
	}



	public void setHoras_Extra(int horasExtra) {
		this.horas_Extra = horasExtra;
	}


	public boolean comprobar_Horas_Extra(int max_Horas_Permitidas) {
        if (this.horas_Extra > max_Horas_Permitidas) {
            return true;
        }
        return false; 
    }

    public double calcular_Sueldo_Bruto(double plus_Antiguedad, double precio_Hora_Extra) {
     
        double sueldoPadre = super.calcular_Sueldo_Bruto(plus_Antiguedad, plus_Antiguedad);
        return sueldoPadre + (horas_Extra * plus_Antiguedad);
    }

	@Override
	public String toString() {
		return "Ayudante [horas_Extra=" + horas_Extra + ", get_Nombre()=" + get_Nombre() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

   
}