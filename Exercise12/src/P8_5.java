
public class P8_5 {

	public static boolean[] sieve(int n) {
		boolean[] result = new boolean[n];
		
		for (int i = 2; i < n; i++)
			result[i] = true;
		for (int num = 2; num <= (int) Math.sqrt(n); num++) {
			if (result[num] == true) {
				for (int id = num * num; id < n; id += num) {
					result[id] = false;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sieve(5)[3]);
	}
}
