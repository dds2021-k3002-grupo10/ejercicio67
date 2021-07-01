package domain.entities.bases;

import domain.entities.vehiculo.Ambulancia;

import java.util.ArrayList;
import java.util.List;

public class BaseSimple extends Base{
    private List<Ambulancia> ambulanciasDisponibles = new ArrayList<>();

    @Override
    public Integer ambulancias() {
        return ambulanciasDisponibles.size();
    }

    @Override
    public Double calcularTiempoMedio() {
        List<Double> tiempos = this.tiemposDeAmbulancias();

        return tiempos.stream().mapToDouble(a -> a).sum() / this.ambulanciasDisponibles.size();
    }

    public void agregarAmbulancia(Ambulancia ambulancia) { ambulanciasDisponibles.add(ambulancia); }

    private List<Double> tiemposDeAmbulancias(){
        List<Double> tiemposDeAmbulancias = new ArrayList<>();
        ambulanciasDisponibles.forEach(ambulancia -> tiemposDeAmbulancias.add(ambulancia.tiempoMedio()));
        return tiemposDeAmbulancias;
    }
}
