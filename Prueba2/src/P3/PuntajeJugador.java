package P3;
/**
 *Esta clase deberia servir en cualquier juego con un sistema de puntos basico
 */
public class PuntajeJugador {

	int Puntaje;
	
	public PuntajeJugador() {
		Puntaje = 0;
	}
	
	public int getPuntaje() {
		//Devuelve el puntaje del jugador
		return Puntaje;
	}
	public void addPuntos(int x) {
		//Agrega puntos al jugador, sirve en culaquier juego
		Puntaje = Puntaje + x;
		
	}
	
	
}
