package adicionales;

import comida.Comida;
import criterio.Criterio;

public class CalcularAdicionalPorcentaje extends CalcularAdicional{

    private float porcentaje;

    public CalcularAdicionalPorcentaje( float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public float calcularAdicional(Comida comida) {
        return comida.getPrecio()*porcentaje;
    }
}
