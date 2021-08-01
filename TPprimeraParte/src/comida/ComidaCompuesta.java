package comida;

import java.util.ArrayList;
import java.util.List;

public class ComidaCompuesta extends Comida {
     private List<Comida> comidas;


    public ComidaCompuesta(String nombre, String tipo, String modoPreparacion) {
        super(nombre, tipo, modoPreparacion);
        comidas=new ArrayList<>();

    }
    public void addComida(Comida o){
        comidas.add(o);
    }
    public void removeComida(Comida o){
        comidas.remove(o);
    }


    @Override
    public float getCalorias() {
        int totalCalorias=0;
        for(Comida c:comidas){
            totalCalorias+=c.getCalorias();
        }
        return totalCalorias;
    }

    @Override
    public float getPrecio() {
        int totalPrecio=0;
        for(Comida c:comidas){
            totalPrecio+=c.getPrecio();
        }
        return totalPrecio;
    }

    @Override
    public float getTiempoPreparacion(){
        int totalTiempo=0;
        for(Comida c:comidas){
            totalTiempo+=c.getTiempoPreparacion();
        }
        return totalTiempo;
    }
}
