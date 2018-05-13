/**
 * Lo que hace el codigo es crear 2 listas, llenarlas con numeros aleatorios de igual manera en ambas
 * todos los metodos sirven para ambas listas, solo hay que especificar cual se quiere utilizar
 * Ademas agregue un metodo para imprimir en consola todo lo que contiene las listas,con un maximo de 50 cada una 
 * 
 */
package Prueba1;

import java.util.Random;
import java.util.Scanner;
public class Pila2P {

public static void PilaPush(int[] S, int x) {
		
		int i= 0;
		while (S[50]== 0) {
			if (S[i]== 0) {S[i] = x; break;}
			i++;
			}
	}
		public static void PilaPop(int[] S){
			
			if (S[0] == 0) System.out.println("Pila Vacia");
			else {
			int i = 0;
			while (S[50]== 0) {
				if (S[i]== 0) {System.out.println(S[i-1]);S[i-1] = 0; break;}
				else i++;
			    }
		    }
		}
		
		public static void PilaEmpty(int[] S){
			
			if (S[0] == 0) System.out.println("Pila Vacia");
			else System.out.println("Pila con numeros");
			
		}
		
		public static void PilaRandom(int[] S, int[] S2, int n) {
			Random rand = new Random();
			boolean g = true;
			for(int i=0; i<n; i++) {
				
				if(g==true) {PilaPush(S, rand.nextInt(1000) + 1); g = false;}
				else {PilaPush(S2, rand.nextInt(1000) + 1); g = true;}
			}
		}
		
		public static void PilaPrintAll(int[] S) {
			
			int i= 0;
			while (S[50]== 0) {
				if (S[i]== 0) {System.out.println("");break;}
				System.out.print(S[i]+" ");
				i++;
				}
		}
				
		public static void main (String[] args) {
			Scanner in = new Scanner(System.in);
			int[] pila, pila2;
			pila = new int[51];
			pila2 = new int[51];
			
			System.out.println("Esta la lista 1 vacia?");
			PilaEmpty(pila);
			
			System.out.println("Se ingresaran 20 numeros aleatorios a ambas listas");
            PilaRandom(pila, pila2, 20);
            
			System.out.println("Esta la lista 1 vacia?");
			PilaEmpty(pila);
			
			System.out.println("ahora sucedera 2 pop en cada lista, en orden");
			PilaPop(pila);
			PilaPop(pila);
			PilaPop(pila2);
			PilaPop(pila2);
			
			System.out.println("contenido de la pila 1");
			PilaPrintAll(pila);
			System.out.println("contenido de la pila 2");
			PilaPrintAll(pila2);
			
			System.out.println("Esta la lista 2 vacia?");
			PilaEmpty(pila2);
			in.close();
			
		}
	
}
