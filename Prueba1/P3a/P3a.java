/**
 * ESTE CODIGO MUESTRA TODA SU FUNCIONALIDAD AL SER EJECUTADO, INTERACTUA CON LAS CLASES DE LA PREGUNTA 2B
 * 
 * Lo que hace es crear 6 listas con 10 contenedores cada una en un barco
 * luego imprime las 10 listas y representa los contenedores que existen en ellas con una X
 * de lo contrario se pone una O
 */
package Prueba1;

import java.util.Random;

public class P3a {

	public static void main (String[] args) {
		Random rand = new Random();
		Barco barco = new Barco();

//LLENAMOS 6 PILAS AL AZAR CON CONTENEDORES 
		
		for(int i = 0; i < 6; i++) {

			int x = rand.nextInt(10);
			while(barco.IsEmpty(x) == false) { //crea un numero al azar no repetido
			 x = rand.nextInt(10);
			}
			
			for(int j = 0; j < 10; j++) {

				barco.Push(x, rand.nextInt(10000),(i*100)+j); //crea un contenedor con un numero dentro (al azar)
			
			}
			
		}
		

		for(int k = 0; k < 10; k++) {
			System.out.println("");
			for(int l = 0; l < 10; l++) {
				
				if (barco.IsEmpty(k)== false)System.out.print("X");//imprime las pilas que no estan vacias
				else System.out.print("O");
				
			}
		}
			
	}
		
}
