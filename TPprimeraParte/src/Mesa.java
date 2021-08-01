import java.util.ArrayList;
import java.util.List;

public class Mesa{

    int numMesa;
    String pedido;/*no seria una lista de comidas*/

    public Mesa(int numMesa,String pedido) {
        this.numMesa=numMesa;
        this.pedido= pedido;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }


}
