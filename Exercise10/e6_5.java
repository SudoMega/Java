package Exercise10;

public class e6_5 {

	public static void main(String[] args) {
		
		boolean flag1 = isHoopy(202);
		boolean flag2 = isFrabjuous(202);
		
		System.out.println(flag1);
		System.out.println(flag2);
		
		if (flag1 && flag2) {
			System.out.println("ping!");
		}
		if (flag1 || flag2) {
			System.out.println("pong!");
		}
	}

	public static boolean isHoopy(int x) {
		boolean hoopyFlag;
		if (x % 2 == 0) {
			hoopyFlag = true;
		} else {
			hoopyFlag = false;
		}
		return hoopyFlag;
	}

	public static boolean isFrabjuous(int x) {
		boolean frabjuousFlag;
		if (x > 0) {
			frabjuousFlag = true;
		} else {
			frabjuousFlag = false;
		}
		return frabjuousFlag;
	}

	/* El Output es:
	 * 
	 * true
	 * true
	 * ping!
	 * pong!
	 * 	
	 * primero ingresa a isHoopy, para ver si es verdadero o falso, luego lo mismo con isFrabjuous
	 * despues ve si estos dos valores (flag1 y flag2) son verdaderos, como si lo son escribe ping!
	 * Finalmente revisa si alguno de esos es verdadero y escribe pong! 
	 */
	
	
}
