import adicionales.CalcularAdicional;
import comida.Comida;

import java.util.ArrayList;
import java.util.List;

public class Pedido{

    private int numMesa;
    private String mozo;
    private List<Comida> comidas;

    public Pedido(int numMesa, String mozo) {
        this.numMesa=numMesa;
        this.mozo =mozo;
        comidas= new ArrayList<Comida>();
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public Comida getComida( int comida){
       return comidas.get(comida); /*devuelvo una comida*/
    }

    public int cantComida(){
        return comidas.size();/*devuelve la cantidad de comidas*/
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public float calcularCostoFinal(CalcularAdicional adicional){
        float total=0;
        for(Comida c:comidas) {
            total += c.getPrecio() + adicional.calcularAdicional(c);
        }
        return total;
    }
}
