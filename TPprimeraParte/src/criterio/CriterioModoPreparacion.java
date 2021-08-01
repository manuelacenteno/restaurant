package criterio;

import comida.Comida;

public class CriterioModoPreparacion extends Criterio {
    private String modoPreparacionAdmitido;

    public CriterioModoPreparacion(String MODOPREPARACIONADMITIDO) {
        this.modoPreparacionAdmitido = MODOPREPARACIONADMITIDO;
    }

    @Override
    public boolean aceptarComida(Comida comida) {
        if(comida.getModoPreparacion().equals(this.modoPreparacionAdmitido)){
            return true;
        }
        return false;

    }


}
