package criterio;

import comida.Comida;

public class CriterioOr extends Criterio {

    Criterio condicion1;
    Criterio condicion2;

    public CriterioOr(Criterio condicion1, Criterio condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean aceptarComida(Comida comida) {
        return condicion1.aceptarComida(comida)||condicion2.aceptarComida(comida);
    }
}
