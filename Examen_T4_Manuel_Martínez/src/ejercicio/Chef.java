package ejercicio;

public class Chef extends Trabajador {
    private String especialidad;
    private int platos_Cocinados;
    
    public Chef(int id, String nombre, double sueldo_Base, int anios_Trabajados, String especialidad,
			int platos_Cocinados) {
		super(id, nombre, sueldo_Base, anios_Trabajados);
		this.especialidad = especialidad;
		this.platos_Cocinados = platos_Cocinados;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	public int getPlatosCocinados() {
		return platos_Cocinados;
	}



	public void setPlatosCocinados(int platosCocinados) {
		this.platos_Cocinados = platosCocinados;
	}



	public double calcular_Sueldo_Bruto(double plus_Antiguedad, double precio_Por_Plato) {
        double sueldoPadre = super.calcular_Sueldo_Bruto(plus_Antiguedad, precio_Por_Plato);
        return sueldoPadre + (platos_Cocinados * precio_Por_Plato);
    }

	@Override
	public String toString() {
		return "Chef [especialidad=" + especialidad + ", platos_Cocinados=" + platos_Cocinados + ", getId()=" + getId()
				+ ", getNombre()=" + getNombre() + ", getSueldo_Base()=" + getSueldo_Base() + ", getAnios_Trabajados()="
				+ getAnios_Trabajados() + ", get_Nombre()=" + get_Nombre() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
    
}