import domain.entities.bases.BaseAdministrativa;
import domain.entities.bases.BaseSimple;
import domain.entities.vehiculo.Ambulancia;
import org.junit.Assert;
import org.junit.Test;

public class TestBaseAdministrativa {
    @Test
    public void ElPromedioDeTiempoEsElPromedioDeLasBases(){
        Ambulancia ambulancia1 = new Ambulancia();
        ambulancia1.realizarAsistencia(10.0);
        ambulancia1.realizarAsistencia(10.0);

        Ambulancia ambulancia2 = new Ambulancia();
        ambulancia2.realizarAsistencia(20.0);
        ambulancia2.realizarAsistencia(20.0);

        BaseSimple baseSimple1 = new BaseSimple();
        baseSimple1.agregarAmbulancia(ambulancia1);
        baseSimple1.agregarAmbulancia(ambulancia2);

        Ambulancia ambulancia3 = new Ambulancia();
        ambulancia1.realizarAsistencia(10.0);
        ambulancia1.realizarAsistencia(10.0);

        Ambulancia ambulancia4 = new Ambulancia();
        ambulancia2.realizarAsistencia(20.0);
        ambulancia2.realizarAsistencia(20.0);

        BaseSimple baseSimple2 = new BaseSimple();
        baseSimple2.agregarAmbulancia(ambulancia1);
        baseSimple2.agregarAmbulancia(ambulancia2);

        BaseAdministrativa baseAdministrativa = new BaseAdministrativa();
        baseAdministrativa.agregarBase(baseSimple1);
        baseAdministrativa.agregarBase(baseSimple2);

        Double tiempo = 15.0;

        Assert.assertEquals(tiempo, baseAdministrativa.calcularTiempoMedio());
    }
}
