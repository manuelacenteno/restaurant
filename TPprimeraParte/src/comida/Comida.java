package comida;

public abstract  class Comida  {

    private String nombre;
    private String tipo;
    private String modoPreparacion;

    public Comida(String nombre, String tipo, String modoPreparacion) {
        this.nombre=nombre;
        this.tipo=tipo;
        this.modoPreparacion=modoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public void setModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    public abstract float getCalorias();

    public abstract float getPrecio();

    public abstract float getTiempoPreparacion();

}
