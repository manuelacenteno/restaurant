package criterio;

import comida.Comida;

public class CriterioNot extends Criterio {

    Criterio condicion;

    public CriterioNot(Criterio condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean aceptarComida(Comida comida) {
        return !condicion.aceptarComida(comida);
    }
}
