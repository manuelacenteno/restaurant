import comida.Comida;

import java.util.ArrayList;
import java.util.List;

public class Cocina{


        List<Estacion> estaciones;
        List<Pedido> pedidos;

        public Cocina(){
                estaciones=new ArrayList<>();
                pedidos=new ArrayList<>();
        }

        public void tomarPedido(Pedido pedido){
                pedidos.add(pedido);
                for(int i=0;i<pedido.cantComida();i++) {/*recorro la lista de pedidos*/
                        asignarComida(pedido.getComida(i));
                }
        }

        public void asignarComida(Comida comida) {
                for(Estacion e:estaciones){
                        e.aceptarComida(comida);
                }
        }



}
