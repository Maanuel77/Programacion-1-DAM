package ejercicio_04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GestionQuedadas {
    private List<QuedadaFeria> listaQuedadas;

    public GestionQuedadas() {
        this.listaQuedadas = new ArrayList<>();
    }

    public void agregar(QuedadaFeria q) {
        listaQuedadas.add(q);
    }


    public Optional<QuedadaFeria> filtrarPorId(int id) {
        return listaQuedadas.stream()
                .filter(q -> q.getId() == id)
                .findFirst();
    }

    public boolean borrar(int id) {
        return listaQuedadas.removeIf(q -> q.getId() == id);
    }

    public boolean modificar(int id, QuedadaFeria nuevaData) {
        return filtrarPorId(id).map(original -> {
            original.setPlan(nuevaData.getPlan());
            original.setPuntoEncuentro(nuevaData.getPuntoEncuentro());
            original.setFecha(nuevaData.getFecha());
            original.setHora(nuevaData.getHora());
            original.setTransportePublico(nuevaData.isTransportePublico());
            original.setCantidadIndividual(nuevaData.getCantidadIndividual());
            original.setPresupuestoTope(nuevaData.getPresupuestoTope());
            original.setAmigos(nuevaData.getAmigos());
            return true;
        }).orElse(false);
    } 
    
    public List<QuedadaFeria> buscarQuedadasPorDia (LocalDate dia) {
    	return listaQuedadas.stream()
    			.filter(q -> q.getFecha().equals(dia))
    			.collect(Collectors.toList());
    }
    
    public List<QuedadaFeria> buscarQuedadasNocturnas(LocalTime horaFiltro) {
        return listaQuedadas.stream()
                .filter(q -> q.getHora().isAfter(horaFiltro))
                .collect(Collectors.toList());
    }

    public List<String> obtenerListaInvitadosUnica() {
        return listaQuedadas.stream()
                .flatMap(q -> q.getAmigos().stream())
                .distinct()                          
                .sorted()                            
                .collect(Collectors.toList());
    }

    public List<QuedadaFeria> filtrarPlanesEconomicos() {
        return listaQuedadas.stream()
                .filter(q -> (q.getCantidadIndividual() * q.getAmigos().size()) <= q.getPresupuestoTope())
                .collect(Collectors.toList());
    }

    public double calcularGastoTotalPrevisto() {
        return listaQuedadas.stream()
                .mapToDouble(q -> q.getCantidadIndividual() * q.getAmigos().size())
                .sum();
    }

    public void mostrarTodas() {
        listaQuedadas.forEach(System.out::println);
    }
}