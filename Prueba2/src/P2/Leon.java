package P2;
/**
 * 
 * En esta clase reeplique un metodo de la clase Jaula, la cual es superclase de animal, que a su vez es superclase de Leon
 *
 */


public class Leon extends Animal {

	public Leon() {
		super(2,2,"Carne","Lento","Savanna","Play Audio", "Leon");
		// TODO Auto-generated constructor stub
	}

public void PrintInfo() {
	System.out.println("El Leon Come Carne, crece Lento y vive en la Sabanna");
	System.out.println("Play Audio");
	
}


	
}
