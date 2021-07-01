package domain.entities.vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Ambulancia {
    private List<Double> tiempos = new ArrayList<>();

    public List<Double> getTiempos() {return this.tiempos; }

    public Double tiempoMedio(){
        return tiempos.stream().mapToDouble(a -> a).sum() / this.tiempos.size();
    }

    public void realizarAsistencia(Double tiempoDeAsistencia) { tiempos.add(tiempoDeAsistencia); }
}
