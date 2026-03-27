package todo_Implementado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Evento {
	private int id;
	private String nombre;

	// Aquí metemos todo lo aprendido el trabajo
	private LocalDate fecha;
	private LocalTime hora;
	private LocalDateTime fechaHoraLocal;
	private ZonedDateTime fechaHoraGlobal;

	public Evento(int id, String nombre, int anio, int mes, int dia, int h, int m, String zonaId) {
		this.id = id;
		this.nombre = nombre;

		// Construimos las fechas paso a paso
		this.fecha = LocalDate.of(anio, mes, dia);
		this.hora = LocalTime.of(h, m);
		this.fechaHoraLocal = LocalDateTime.of(this.fecha, this.hora);
		this.fechaHoraGlobal = ZonedDateTime.of(this.fechaHoraLocal, ZoneId.of(zonaId));
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

	public LocalDateTime getFechaHoraLocal() {
		return fechaHoraLocal;
	}

	public void setFechaHoraLocal(LocalDateTime fechaHoraLocal) {
		this.fechaHoraLocal = fechaHoraLocal;
	}

	public ZonedDateTime getFechaHoraGlobal() {
		return fechaHoraGlobal;
	}

	public void setFechaHoraGlobal(ZonedDateTime fechaHoraGlobal) {
		this.fechaHoraGlobal = fechaHoraGlobal;
	}

	@Override
	public String toString() {
		return "ID: " + id + " | Evento: " + nombre + " | Momento Global: " + fechaHoraGlobal;
	}
}
