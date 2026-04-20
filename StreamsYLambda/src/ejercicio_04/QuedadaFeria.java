package ejercicio_04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class QuedadaFeria {
	private int id;
    private String plan;           
    private String puntoEncuentro;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean transportePublico;
    private double cantidadIndividual;
    private double presupuestoTope;
    private List<String> amigos;
    
	public QuedadaFeria(int id, String plan, String puntoEncuentro, LocalDate fecha, LocalTime hora, boolean transportePublico,
			double cantidadIndividual, double presupuestoTope) {
		super();
		this.id = id;
		this.plan = plan;
		this.puntoEncuentro = puntoEncuentro;
		this.fecha = fecha;
		this.hora = hora;
		this.transportePublico = transportePublico;
		this.cantidadIndividual = cantidadIndividual;
		this.presupuestoTope = presupuestoTope;
	}
	
	public List<String> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<String> amigos) {
		this.amigos = amigos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}
	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public boolean isTransportePublico() {
		return transportePublico;
	}
	public void setTransportePublico(boolean transportePublico) {
		this.transportePublico = transportePublico;
	}
	public double getCantidadIndividual() {
		return cantidadIndividual;
	}
	public void setCantidadIndividual(double cantidadIndividual) {
		this.cantidadIndividual = cantidadIndividual;
	}
	public double getPresupuestoTope() {
		return presupuestoTope;
	}
	public void setPresupuestoTope(double presupuestoTope) {
		this.presupuestoTope = presupuestoTope;
	}
	
	@Override
	public String toString() {
		return "QuedadaFeria [plan=" + plan + ", puntoEncuentro=" + puntoEncuentro + ", fecha=" + fecha + ", hora="
				+ hora + ", transportePublico=" + transportePublico + ", cantidadIndividual=" + cantidadIndividual
				+ ", presupuestoTope=" + presupuestoTope + "]";
	}
    
	
    
    
}