package criterio;


import comida.Comida;

public class CriterioPorTipo extends Criterio {

     private String tipoAdmitido;

    @Override
    public boolean aceptarComida(Comida comida) {
        if(comida.getTipo()==this.tipoAdmitido){
            return true;
        }
        else{
            return false;
        }


    }
}
