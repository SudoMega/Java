//EL CODIGO MULTIPLICA NUMEROS AL CUBO EN SUCESION, HASTA EL NUMERO QUE LE ENTREGUEMOS
public class PQfuncions1a {

	public static int cube(int i) {
		
		int j = i * i * i;
		return j;
	}
	public static void main (String[] args) {
		
		int N = Integer.parseInt(args[0]);
		for (int i = 1; i<= N; i++)
			System.out.println(i + " " + cube (i));
	}
	
}
