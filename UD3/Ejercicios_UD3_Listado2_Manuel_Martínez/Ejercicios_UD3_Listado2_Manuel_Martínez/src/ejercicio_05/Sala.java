package ejercicio_05;

import java.util.Arrays;

public class Sala {

	private Ticket [] lista_Ticket;
	private int num_Sala;
	private int total_Asientos;
	private Ticket t;
	private double gananciasTotales = 0.0;
	
	public Sala(Ticket[] lista_Ticket, int num_Sala, int total_Asientos, Ticket t) {
		super();
		this.lista_Ticket = lista_Ticket;
		this.num_Sala = num_Sala;
		this.total_Asientos = total_Asientos;
		this.t = t;
	}
	public Sala() {
		super();
	}

	public Ticket[] getLista_Ticket() {
		return lista_Ticket;
	}

	public void setLista_Ticket(Ticket[] lista_Ticket) {
		this.lista_Ticket = lista_Ticket;
	}

	public int getNum_Sala() {
		return num_Sala;
	}

	public void setNum_Sala(int num_Sala) {
		this.num_Sala = num_Sala;
	}

	public int getTotal_Asientos() {
		return total_Asientos;
	}

	public void setTotal_Asientos(int total_Asientos) {
		this.total_Asientos = total_Asientos;
	}

	public Ticket getT() {
		return t;
	}

	public void setT(Ticket t) {
		this.t = t;
	}
	
	public double getGananciasTotales() {
		return gananciasTotales;
	}
	
	@Override
	public String toString() {
		return "Sala [lista_Ticket=" + Arrays.toString(lista_Ticket) + ", num_Sala=" + num_Sala + ", total_Asientos="
				+ total_Asientos + ", t=" + t + "]";
	}
	
	public boolean comprobar_Ocupacion_Sala (Ticket [] lista_Ticket) {
		
		Ticket t = lista_Ticket [0];
		if (t == null) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}
	
	public boolean comprobar_Asiento_Sala (int cant, int ID_Entrada_Usuario) {
		
		for (int i = 0; i < cant; i++) {
			
			Ticket t = lista_Ticket[i];
			
			if (t.getNum_Identificativo() == ID_Entrada_Usuario) {
				
				return t.isOcupacion();
			}
		}
		
		return false;
	}
	
	public double calcularGanancias() {
		return gananciasTotales;
	}
	
	public void sumarGanancia(double cantidad) {
		this.gananciasTotales += cantidad;
	}
	
	public double comprarVariasEntradas(int numEntradas) {
		double precioUnitario = t.getPrecio();
		double total = numEntradas * precioUnitario;
		
		if (numEntradas > 5) {
			total *= 0.90; // Aplicamos un 10% de descuento
		}
		
		return total;
	}
	
	public void modificarPrecioEntradas(double nuevoPrecio) {
		t.setPrecio(nuevoPrecio);
	}
	
}