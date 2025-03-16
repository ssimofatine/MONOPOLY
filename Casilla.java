package tema8.monopoly.modelo;

public class Casilla {
    protected String nombre;

    public Casilla(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "[" + nombre + "]";
    }
}
