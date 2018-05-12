package Prueba1;

public class PilaOO {
	
	private int[] pila;
	
	//Constructor Vacío
	public PilaOO(){
		
		pila = new int[51];
		
	}
	
    public void Push(int x) {
		
		int i= 0;
		while (pila[50]== 0) {
			if (pila[i]== 0) {pila[i] = x; break;}
			i++;
			}

	}
		public void Pop(){
			
			if (pila[0] == 0) System.out.println("Pila Vacia");
			else {
			int i = 0;
			while (pila[50]== 0) {
				if (pila[i]== 0) {System.out.println(pila[i-1]);pila[i-1] = 0; break;}
				else i++;
			    }
		    }
		}
		
		public void IsEmpty(){
			if (pila[0] == 0) System.out.println("Pila Vacia");
			else System.out.println("Pila con numeros");
		}
}
