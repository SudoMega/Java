package Clase3.src.exercise3;



public class Date {

	public static void main(String[] args) {
		
		String name = args[0];
		String mm = args[1];
		int dd = Integer.parseInt(args[2]);
		int yy = Integer.parseInt(args[3]);
		boolean condition = Boolean.parseBoolean(args[4]); //Verdadero es Formato americano
		
		if(condition == true){
			System.out.println("American format:");
			
			while(dd < 31) { // imaginando que el mes tiene siempre 30 dias
				
				System.out.println(name + ", " + mm + ", " + dd + ", " + yy  );
				dd++;
			}
			
		}
		else {
			System.out.println("European format:");
			
			while(dd < 31) {
				
				System.out.println(name + ", " + dd + ", " + mm + ", " + yy  );
				dd++;
			}
			
			
		}
		
	}
	
}
