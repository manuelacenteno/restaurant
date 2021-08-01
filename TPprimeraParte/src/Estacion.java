import comida.Comida;
import criterio.Criterio;

import java.util.ArrayList;
import java.util.List;

public class Estacion {

    private Criterio criterioAceptacion;
    private List<Comida> comidas;

    public Estacion(Criterio criterioAceptacion) {
        this.criterioAceptacion = criterioAceptacion;
        comidas=new ArrayList<>();
    }

    public void setCriterioAceptacion(Criterio criterioAceptacion) {
        this.criterioAceptacion = criterioAceptacion;
    }

    public boolean aceptarComida(Comida comida){
        if(criterioAceptacion.aceptarComida(comida)){
            comidas.add(comida);
            return true;
        }else{
            return false;
        }

    }
}
