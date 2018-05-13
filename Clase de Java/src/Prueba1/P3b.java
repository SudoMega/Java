/**
 * Se crea un barco con 50 pilas y cada una de estas tiene 50 contenedores
 * cada contenedor tiene un numero al azar dentro, pero no se utiliza en este codigo
 *  
 * lo que hace el programa es darle un id a cada contenedor, este utiliza una formula simple
 * lo que hace que todos los id sean entre 1001 y 5050. La priimera parte es por ejemplo 
 * contenedor 40 y pila 20 = id 2040
 * 
 * el id de la pila es lo mismo que su ubicacion en esta, aun asi cuenta con su propio metodo y se utilizan
 * ambos id para realizar algunos calculos
 * 
 */


package Prueba1;

import java.util.Random;
import java.util.Scanner;

public class P3b {

	public static void main (String[] args) {
		Random rand = new Random();
		Barco barco = new Barco();

//LLENAMOS 6 PILAS AL AZAR CON CONTENEDORES 
		
		for(int i = 0; i < 50; i++) {			
			for(int j = 0; j < 50; j++) {
				barco.Push(j, rand.nextInt(10000),(i*100)+j); //crea un contenedor con un numero dentro (al azar), ademas de esto le da	
			}                                                 //un id al contenedor dependiendo de su posicion (i*100)+j
			
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese el numero del contenedor (ejemplo 3025):");
		int x = in.nextInt();
		System.out.print(barco.Search(x));
		in.close();
    }
}
