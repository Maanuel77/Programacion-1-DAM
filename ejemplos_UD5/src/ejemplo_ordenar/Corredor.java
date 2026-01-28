package ejemplo_ordenar;

public class Corredor implements Comparable <Corredor>{

	private int dorsal;
	private String tiempo;
	private String nombre;
	
	public Corredor(int dorsal, String tiempo, String nombre) {
		super();
		this.dorsal = dorsal;
		this.tiempo = tiempo;
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Corredor [dorsal=" + dorsal + ", tiempo=" + tiempo + ", nombre=" + nombre + "]";
	}
	@Override
	public int compareTo(Corredor o) {
			
			if (this.dorsal > o.dorsal) {
			return 1;
			}else if (this.dorsal < o.dorsal) {
			return -1;
			}else {
			return 0;
			}
			
	}
	
}
