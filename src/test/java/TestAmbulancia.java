import domain.entities.vehiculo.Ambulancia;
import org.junit.Assert;
import org.junit.Test;

public class TestAmbulancia {
    @Test
    public void elTiempoMedioDeUnaAmbulanciaEsElPromedioDeSusTiempos(){
        Ambulancia ambulancia1 = new Ambulancia();
        ambulancia1.realizarAsistencia(10.0);
        ambulancia1.realizarAsistencia(10.0);
        Double tiempo = 10.0;
        Assert.assertEquals(tiempo, ambulancia1.tiempoMedio());
    }
}
