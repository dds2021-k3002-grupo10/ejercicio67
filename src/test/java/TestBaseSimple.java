import domain.entities.bases.BaseSimple;
import domain.entities.vehiculo.Ambulancia;
import org.junit.Assert;
import org.junit.Test;

public class TestBaseSimple {
    @Test
    public void PromedioDeUnaBaseSimpleEsPromedioDeTiemposDeAmbulancias(){
        Ambulancia ambulancia1 = new Ambulancia();
        ambulancia1.realizarAsistencia(10.0);
        ambulancia1.realizarAsistencia(10.0);

        Ambulancia ambulancia2 = new Ambulancia();
        ambulancia2.realizarAsistencia(20.0);
        ambulancia2.realizarAsistencia(20.0);

        BaseSimple baseSimple = new BaseSimple();
        baseSimple.agregarAmbulancia(ambulancia1);
        baseSimple.agregarAmbulancia(ambulancia2);

        Double tiempo = 15.0;

        Assert.assertEquals(tiempo, baseSimple.calcularTiempoMedio());
    }

    @Test
    public void AmbulanciasMeDaLaCantidadDeAmbulanciasEnUnaBase(){
        Ambulancia ambulancia1 = new Ambulancia();
        Ambulancia ambulancia2 = new Ambulancia();
        Ambulancia ambulancia3 = new Ambulancia();
        Ambulancia ambulancia4 = new Ambulancia();

        BaseSimple baseSimple = new BaseSimple();
        baseSimple.agregarAmbulancia(ambulancia1);
        baseSimple.agregarAmbulancia(ambulancia2);
        baseSimple.agregarAmbulancia(ambulancia3);
        baseSimple.agregarAmbulancia(ambulancia4);

        Integer ambulancias = 4;
        Assert.assertEquals(ambulancias, baseSimple.ambulancias());
    }
}
