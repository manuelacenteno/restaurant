package adicionales;

import comida.Comida;
import criterio.Criterio;

public class CalcularAdicionalCriterio extends CalcularAdicional {

    private Criterio criterio;
    private float adicionalSi;
    private float adicionalNo;

    public CalcularAdicionalCriterio(Criterio criterio, float adicionalSi, float adicionalNo) {
        this.criterio = criterio;
        this.adicionalSi = adicionalSi;
        this.adicionalNo = adicionalNo;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public float getAdicionalSi() {
        return adicionalSi;
    }

    public void setAdicionalSi(float adicionalSi) {
        this.adicionalSi = adicionalSi;
    }

    public float getAdicionalNo() {
        return adicionalNo;
    }

    public void setAdicionalNo(float adicionalNo) {
        this.adicionalNo = adicionalNo;
    }

    @Override
    public float calcularAdicional(Comida comida) {
        if(criterio.aceptarComida(comida)){
            return adicionalSi;
        }
        return adicionalNo;
    }
}
