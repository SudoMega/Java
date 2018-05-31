package P2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * El programa simula a un usuario que se pasea al azar por las jaulas
 * cada 1 segundo (para probar rapido el programa) ve un random que le pregunta a la jaula en la que esta si hay un animal
 * si hay animal devuelve la informacion y toca un audio
 * El GPS es un int por el momento, esto se puede cambiar facilmente por otro tipo de dato
 * 
 * La clase Leon cuenta con un metodo utilizado en la Super-Super-Clase Jaula
 */
public class Wrapper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
Jaula[] jaula;
jaula = new Jaula[10]; //hay 10 jaulas en todo el zoologico
jaula[0] = new Jaula();
jaula[1] = new Jaula();
jaula[5] = new Jaula();
	
jaula[0].IngresarAnimal("Mono");
jaula[1].IngresarAnimal("Leon");
jaula[5].IngresarAnimal("Mono"); // El mono va a salir mas ya que hay 2 jaulas con monos
Random rand = new Random();
Animal leon = new Leon();

//para probar el metodo de la clase leon
((Leon) leon ).PrintInfo();

System.out.println("-------------------------------------------------------------------------------");

int x = 1;
while (x == 1) {
	int GPS = rand.nextInt(10);
	if (jaula[GPS] != null) {
		System.out.println("Desea ver la info de este animal? (true/false)");
		boolean bool = in.nextBoolean(); //es "inecesario" decirle el nombre de la jaula al usuario si el esta ahi mismo, asi que por simplicidad, pregunto solo true or false
		if(bool == true)jaula[GPS].GetInfo();		
	}
		
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
in.close();
	}
	
}
