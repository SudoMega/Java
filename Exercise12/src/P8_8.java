
public class P8_8 {
	public static int maxInRange(int[] numeros, int bottom, int top) {
		if (bottom == top) {
			return numeros[bottom];
		}
		int mid = (bottom + top) / 2;
		return Math.max(maxInRange(numeros, bottom, mid), maxInRange(numeros, (mid + 1), top));
	}

	public static int max(int[] numeros) {
		return maxInRange(numeros, 0, numeros.length - 1);
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(maxInRange(array,3,4));
	}
}
