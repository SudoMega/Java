package P3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * El programa simula a un usuario que se pasea al azar por las jaulas
 * cada 1 segundo (para probar rapido el programa) ve un random que le pregunta a la jaula en la que esta si hay un animal
 * si hay animal devuelve la informacion y toca un audio
 * 
 * Cada vez que pasa por un animal, se le suma puntos al jugador, si es en orden, el jugador recibe mas puntos
 * voy a mantener el puntaje en su propia clase PuntajeJugador para que cada jugador tenga sus puntos, 
 * si pusiera los puntos en la clase animales o jaula cualquier jugador podria interferir con el resto
 * para mantener la ruta simple, sera del 1 al 10, y si el jugador visita mas de una vez alguna jaula, recibe igualmente puntaje
 * por estar ahi denuevo, el puntaje por jaula es 1 punto y el bonus por orden es 2 puntos
 * 
 * Este Wrapper es actualmente el juego ya que es mas sencillo trabajar directamente con las jaulas, aunque todo el codigo se puede
 * llevar a su propia clase con metodos bien definidos, el ciclo While es basicamente un metodo bien encapsulado ya que ahi esta 
 * toda la logica del juego en si
 */
public class Wrapper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
Jaula[] jaula;
jaula = new Jaula[10]; //hay 10 jaulas en todo el zoologico
jaula[0] = new Jaula();
jaula[1] = new Jaula();
jaula[2] = new Jaula();
	
jaula[0].IngresarAnimal("Mono");
jaula[1].IngresarAnimal("Leon");
jaula[2].IngresarAnimal("Mono"); // El mono va a salir mas ya que hay 2 jaulas con monos

Random rand = new Random();
PuntajeJugador puntaje = new PuntajeJugador();
int x = 1;
int GPS = 0;

while (x <= 30) {//El juego dura 30 segundos para probar los premios
	
	int LastGPS = GPS;
    GPS = rand.nextInt(10);
	if (jaula[GPS] != null) {
		//LE QUITE LA PARTE DE LA PREGUNTA SI SE QUIERE LA INFO O NO PARA AGILIZAR EL JUEGO Y PODER PROBARLO MULTIPLES VECES RAPIDO
		/**
		System.out.println("Desea ver la info de este animal? (true/false)");
	    boolean bool = in.nextBoolean(); //es "inecesario" decirle el nombre de la jaula al usuario si el esta ahi mismo, asi que por simplicidad, pregunto solo true or false
	    if(bool == true)
		*/
		jaula[GPS].GetInfo();		
		puntaje.addPuntos(1);
		if(LastGPS == GPS-1) puntaje.addPuntos(2);//revisa si la jaula anterior es efectivamente la que esta antes
	}
	//PARA PROBAR DE MANERA RAPIDA COMENTE ESTE DELAY DE 1 SEGUNDO
	
	/**
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	x++;
}

System.out.println("Su puntaje fue de: " + puntaje.getPuntaje());
System.out.println("Su premio es:");

if (puntaje.getPuntaje()<=10) System.out.println("Un Sticker");
else if (puntaje.getPuntaje()<=15)System.out.println("Un Helado");
else if (puntaje.getPuntaje()<=20)System.out.println("Un Peluche");
else if (puntaje.getPuntaje()<=30)System.out.println("Un HotDog");
else if (puntaje.getPuntaje()<=40)System.out.println("Un Leon");



	}
	
}
