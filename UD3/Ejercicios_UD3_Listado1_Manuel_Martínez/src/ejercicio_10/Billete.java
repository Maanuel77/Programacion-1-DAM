package ejercicio_10;

public class Billete {

	private double precio = 1.30;
	private double salto = 0.24;
	private double total = 0.0;
	private double recaudacion = 0.0;
	
	
	public Billete(double precio, double salto) {
		this.precio = precio;
		this.salto = salto;
	}
	public Billete () {
		
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getSalto() {
		return salto;
	}
	
	public void setSalto(double salto) {
		this.salto = salto;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	@Override
	public String toString() {
		return "Billete [precio=" + precio + ", salto=" + salto + "]";
	}
	public double generar_Billete (int num_Saltos, int num_Billetes) {
		
		total = precio + (salto * num_Saltos);
		total = total * num_Billetes;
		recaudacion = recaudacion + total;
		return total;
		
	}
	
	public void menu_Billete () {
		
		System.out.println("*****MENU BILLETE*****");
		System.out.println("1. Comprar 1 o varios billetes.");
		System.out.println("2. Imprimir por pantalla el billete.");
		System.out.println("3. Opciones de operario.");
		System.out.println("4. Salir de la máquina");
		
	}
	public void menu_Operario () {
		
		System.out.println("*****MENU OPERARIO*****");
		System.out.println("1. Recaudación de la máquina ese día");
		System.out.println("2. Poner a cero el contador de saldo total.");
		System.out.println("3. Cambiar el precio de los billetes");
		System.out.println("4. Volver a la máquina principal");
		
	}
	
	
}
