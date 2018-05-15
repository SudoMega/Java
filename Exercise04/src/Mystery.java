
public class Mystery {

	public static int FMystery(int a, int b) {
		
		if (b == 0) return 1;
		if (b % 2 == 0) return FMystery(a+a, b/2);
		return FMystery(a+a, b/2) * a; // el programa origina multiplica a*b
	}
	
	public static void main (String[] args) {
		System.out.println(FMystery(2, 25));
		System.out.println(FMystery(3, 11));
	}
	
}
