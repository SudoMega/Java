
public class P9_4 {
	/**
	 * Returns the first character of the given String.
	 */
	public static char first(String s) {
		return s.charAt(0);
	}

	/**
	 * Returns all but the first letter of the given String.
	 */
	public static String rest(String s) {
		return s.substring(1);
	}

	/**
	 * Returns all but the first and last letter of the String.
	 */
	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	/**
	 * Returns the length of the given String.
	 */
	public static int length(String s) {
		return s.length();
	}

	public static void printString(String s) {

		System.out.println(first(s));
		if (length(s) > 1)
			printString(rest(s));

	}

	public static void printBackward(String s) {
		String x = "";
		for (int i=0;i<length(s)*100;i++) {
         x = first (s) + x;
		 s = rest(s);	
		}
		printString(x);
	}
	
	public static String reverseString(String s) {
		String x = "";
		for (int i=0;i<length(s)*100;i++) {
         x = first (s) + x;
		 s = rest(s);	
		}
		return x;
	}
	
	public static boolean palindro(String s) {
		
		if (reverseString(s).compareTo(s) == 0) return true;
		else return false;
	}
	
	public static void main(String[] args) {

		System.out.println(first("hola"));
		System.out.println(rest("hola2"));
		System.out.println(middle("hola3"));
		System.out.println(length("hola4"));
		printString("palabra");
		printBackward("coffee");
		System.out.println(reverseString("coffee"));
		System.out.println(palindro("otto"));
	}
}
