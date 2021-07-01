package domain.entities.bases;

import java.util.ArrayList;
import java.util.List;

public class BaseAdministrativa implements Base{
    private List<Base> basesDisponibles = new ArrayList<>();

    @Override
    public Integer ambulancias(){
        List<Integer> ambulancias = new ArrayList<>();
        basesDisponibles.forEach(base -> ambulancias.add(base.ambulancias()));

        return ambulancias.stream().mapToInt(a->a).sum();
    }
    @Override
    public Double calcularTiempoMedio(){
        List<Double> tiempos = new ArrayList<>();
        basesDisponibles.forEach(base -> tiempos.add(base.calcularTiempoMedio()));

        return tiempos.stream().mapToDouble(a -> a).sum() / this.basesDisponibles.size();
    }

    public void agregarBase(Base base){ basesDisponibles.add(base); }
}
