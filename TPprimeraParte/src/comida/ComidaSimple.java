package comida;

public class ComidaSimple extends Comida {

    private float precio;
    private float tiempoPreparacion;
    private float cantCalorias;

    public ComidaSimple(String nombre, String tipo, String modoPreparacion, float precio, float tiempoPreparacion, float cantCalorias) {
        super(nombre, tipo, modoPreparacion);
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
        this.cantCalorias = cantCalorias;
    }

    @Override
    public float getCalorias() {
        return cantCalorias;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public float getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTiempoPreparacion(float tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public void setCantCalorias(float cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
