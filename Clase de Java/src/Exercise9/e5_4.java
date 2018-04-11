package Exercise9;

import java.util.Scanner;

public class e5_4 {
	
	public static void checkFermat() {
		
		double A;
		double B;
		double C;
		double N;
		double suma;
		String[] tasks;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingrese A: ");
		A = in.nextInt();
		System.out.print("Ingrese B: ");
		B = in.nextInt();
		System.out.print("Ingrese C: ");
		C = in.nextInt();
		System.out.print("Ingrese N: ");
		N = in.nextInt();
		
		suma = (Math.pow(A,N)) + (Math.pow(B, N));

		if(N <= 2) {
			System.out.println("En algunos casos se cumple que son numeros iguales  " + suma + " = " + Math.pow(C, N));
			System.out.println("ya que N<=2");
		}
		
		if(suma == Math.pow(C, N) && N > 2) {
			System.out.println("Holy smokes, Fermat was wrong!  " + suma + " = " + Math.pow(C, N));
		}
		if(suma != Math.pow(C, N) && N > 2) {
			System.out.println("No, eso no funciona  " + suma + " = " + Math.pow(C, N));
			System.out.println("Fermat esta en lo correcto ");
		}
		
	}
	
public static void main(String[] args) {
		
	System.out.println("Vamos a verificar el ultimo teorema de Fermat");
	System.out.println("Ingrese las siguientes variables para la ecuacion:");
	System.out.println("      A^N + B^N != C^N     Si N>=2");
		checkFermat();
	
	}

}
