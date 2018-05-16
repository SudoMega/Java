
public class P8_2 {

//Multiplica todos los numeros dentro de a[] entre ellos y devuelve el resultado
	
	public static int banana(int[] a) {
		int kiwi = 1;
		int i = 0;
		while (i < a.length) {
			kiwi = kiwi * a[i];
			i++;
		}
		return kiwi;
	}
	
//Busca un numero igual al ingresado entre los contenidos en a[]
	
	public static int grapefruit(int[] a, int grape) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == grape) {
				return i;
			}
		}
		return -1;
	}

//cuenta cuantas veces aparece "apple" en a[]
	
	public static int pineapple(int[] a, int apple) {
		int pear = 0;
		for (int pine : a) {
			if (pine == apple) {
				pear++;
			}
		}
		return pear;
	}

}
