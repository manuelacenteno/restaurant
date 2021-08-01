package criterio;


import comida.Comida;

public class CriterioSaleFritas extends Criterio {

    @Override
    public boolean aceptarComida(Comida comida) {
        return true;
    }
}
