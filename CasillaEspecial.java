package tema8.monopoly.modelo;

public abstract class CasillaEspecial extends Casilla {

    public CasillaEspecial(String nombre) {
        super(nombre);
    }

    public abstract void actuar(Jugador jugador, Juego juego);
}
