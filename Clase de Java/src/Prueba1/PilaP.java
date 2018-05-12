/**
 * EL PROGRAMA NO CUENTA CON UN MENU, PERO DEMUESTRA TODAS SUS FUNCIONALIDADES AL EJECUTARLO 
 */
package Prueba1;

import java.util.Scanner;

public class PilaP {

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
				
		public static void main (String[] args) {
			Scanner in = new Scanner(System.in);
			int[] pila;
			pila = new int[51];

			System.out.println("ingrese 3 push");
			PilaPush(pila, in.nextInt());
			PilaPush(pila, in.nextInt());
			PilaPush(pila, in.nextInt());
			System.out.println("ahora sucederan 2 pop");
			PilaPop(pila);
			PilaPop(pila);
			System.out.println("ahora nos informara si esta vacia");
			PilaEmpty(pila);
			System.out.println("ahora sucedera 2 pop");
			PilaPop(pila);
			PilaPop(pila);
			System.out.println("ahora nos informara si esta vacia");
			PilaEmpty(pila);
			
			in.close();
			
		}
	

	
}
