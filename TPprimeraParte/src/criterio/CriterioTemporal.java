package criterio;


import comida.Comida;

public class CriterioTemporal extends Criterio {

    private float tiempoMaxPreparacion;

    @Override
    public boolean aceptarComida(Comida comida) {

        if(comida.getTiempoPreparacion()> this.tiempoMaxPreparacion){
            return true;
        }
        else {
            return false;
        }
    }
}
