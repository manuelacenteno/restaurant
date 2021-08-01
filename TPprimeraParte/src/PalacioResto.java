import comida.Comida;

import java.util.ArrayList;
import java.util.List;

public class PalacioResto {

    List<Comida> comidas;
    List<Mesa> mesas;
    List <Mozo> mozos;

    public PalacioResto() {
        comidas=new ArrayList<>();
        mesas= new ArrayList<>();
        mozos=new ArrayList<>();
    }

    public void addComida(Comida comida){
        comidas.add(comida);
    }
    public void removeComida(Comida comida){
        comidas.remove(comida);
    }
    public void addMesa(Mesa me){
        mesas.add(me);
    }
    public void removeMesa(Mesa me){
        mesas.remove(me);
    }
    public void addMozo(Mozo mo){
        mozos.add(mo);
    }
    public void removeMozo(Mozo mo){
        mozos.remove(mo);
    }

}
