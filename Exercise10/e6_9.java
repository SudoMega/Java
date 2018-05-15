package Exercise10;
import java.util.Scanner;


public class e6_9 {


	public static double power(double x, int n) {
		
		if (n==0) return 1;
				
		else return x * power(x, n-1);
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("A continuacion se le solicitara X^N");
		System.out.print("ingrese X (Decimal): ");
		double x = in.nextDouble();
		System.out.print("ingrese N (Entero): ");
		int n = in.nextInt();
		System.out.println(power(x, n));
		in.close();
		
	}
	
    
}
