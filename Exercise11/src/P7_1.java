//imprime el numero que se ingresa al loop, revisa que sea divisible por 2,
//si lo es, lo divide por 2 y continua el loop, si no es divisible por 2 le suma 1

public class P7_1 {

	public static void main(String[] args) {
		loop(100000);
	}

	public static void loop(int n) {
		int i = n;
		while (i > 1) {
			System.out.println(i);
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i + 1;

			}
		}
	}
}