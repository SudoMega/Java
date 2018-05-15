package tarea4;

public class Exercise7 {

	public static void main(String[] args) {
		
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		
		double degrees = 90;
		double angle2 = degrees / 180.0 * Math.PI;
		
		double radians = Math.toRadians(180.0);
		double degrees2 = Math.toDegrees(Math.PI);
		
		long x = Math.round(Math.PI * 20.0);
		
		System.out.println(root);
		System.out.println(angle);
		System.out.println(height);
		System.out.println(degrees);
		System.out.println(angle2);
		System.out.println(radians);
		System.out.println(degrees2);
		System.out.println(x);
		
	}
	
}
