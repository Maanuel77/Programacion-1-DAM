package ejercicio_02;

public class Socio {

	private String nombre;
	private String id;
	private String DNI;
	private boolean activo;
	private boolean vip;
	private double cuota_Base;
	private int antiguedad;
	
	public Socio(String nombre, String id, String dNI, boolean activo, boolean vip, double cuota_Base, int antiguedad) {
		super();
		this.nombre = nombre;
		this.id = id;
		DNI = dNI;
		this.activo = activo;
		this.vip = vip;
		this.cuota_Base = cuota_Base;
		this.antiguedad = antiguedad;
	}

	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public boolean isActivo() {
		return activo;
	}



	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	public boolean isVip() {
		return vip;
	}



	public void setVip(boolean vip) {
		this.vip = vip;
	}



	public double getCuota_Base() {
		return cuota_Base;
	}



	public void setCuota_Base(double cuota_Base) {
		this.cuota_Base = cuota_Base;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", id=" + id + ", DNI=" + DNI + ", activo=" + activo + ", vip=" + vip
				+ ", cuota_Base=" + cuota_Base + ", antiguedad=" + antiguedad + "]";
	}


	public double cuota_Final () {
		int reduccion_Antiguedad = 9;
		
		return cuota_Base - (antiguedad * reduccion_Antiguedad);
	}
}
