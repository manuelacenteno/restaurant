package adicionales;

import comida.Comida;

import java.util.ArrayList;
import java.util.List;

public class CalcularAdicionalComplejo  extends CalcularAdicional{

    List<CalcularAdicional> criterios;

    public CalcularAdicionalComplejo() {
        criterios= new ArrayList<>();
    }

    @Override
    public float calcularAdicional(Comida comida) {
        float adicional=0;
        for(CalcularAdicional c:criterios){
            adicional+=c.calcularAdicional(comida);
        }
        return adicional;
    }
}
