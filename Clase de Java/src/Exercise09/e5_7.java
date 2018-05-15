package Exercise9;

import java.util.Random;
import java.util.Scanner;

public class e5_7 {


	public static void recursive(int A, int n) {
		Scanner in = new Scanner(System.in);
		
		if (A == n) {
			System.out.print("Exacto! su numero es: " + n);
			
		}
		
		else if (A > n) {
			System.out.print("El numero que busca es menor que " + A + ", ingrese otro:");
			A = in.nextInt();
			recursive (A, n);
			
		}
		
		else {
			System.out.print("El numero que busca es mayor que " + A + ", ingrese otro:");
			A = in.nextInt();
			recursive (A, n);
		}
		
		in.close();
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
		int A;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingrese el numero que cree que salio(entre 1 y 50): ");
		A = in.nextInt();
		
		while (A != n) {
			
			if (A > n) {
				System.out.print("El numero que busca es menor que " + A + ", ingrese otro:");
				A = in.nextInt();
				
			}
			
			else {
				System.out.print("El numero que busca es mayor que " + A + ", ingrese otro:");
				A = in.nextInt();
				
			}
	
		}
		
		System.out.print("Exacto! su numero es: " + n);
		in.close();
		
		/*          METODO RECURSIVO 
		 * 
		 *          (Este es el main)
		 * 
		 * Random rand = new Random();
		 * int  n = rand.nextInt(50) + 1;
		 * int A;
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.print("Ingrese el numero que cree que salio(entre 1 y 50): ");
		 * A = in.nextInt();
		 * recursive(A, n);
		 * 
		 * in.close();
		 * 
		 */
	}
	
}
