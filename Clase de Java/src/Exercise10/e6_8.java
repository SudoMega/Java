package Exercise10;

import java.util.Scanner;

public class e6_8 {

	public static long ack(long m, long n) {
		
		      if (m == 0) return n + 1;
		      
		      if (n == 0) return ack(m - 1, 1);
		      
		      return ack(m - 1, ack(m, n - 1));	
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Funcion de Ackermann!");
		System.out.println("Trate de ingresar numeros no negativos enteros menores a 3");
		System.out.print("Ingrese M: ");
		long m = in.nextInt();
		System.out.print("Ingrese N: ");
		long n = in.nextInt();
		System.out.print(ack(m, n));
		in.close();
	}

}
