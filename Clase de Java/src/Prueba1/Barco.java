package Prueba1;

//EL BARCO PUEDE TENER 50 PILAS CON 50 CONTENEDORES CADA UNA

public class Barco {

	private PilaOOb[] pilas = new PilaOOb[51];
	//Constructor Vacío
	public Barco(){	
		
		for (int i = 0; i < 50; i++) {
			pilas[i] = new PilaOOb(i);
			
		}
	}
	
    public void Push(int id, int x,int suma) {
		
		int i= 0;
		while (i<51) {
			if (pilas[i].getId() == id) {pilas[i].Push(x, suma); break;}
			i++;
			}
	}
	
    public boolean IsEmpty(int id){
		if (pilas[id].IsEmpty() == true) return true;
		else return false;
	}
    
    public String Search(int x) {//Busca el ID del contenedor que queramos, retornando su posicion
    	for(int i = 0; i < 50; i++) {
    		for(int j = 0; j < 50; j++) {
    			if(pilas[i].pila[j].getId() == x) {
    				System.out.println("El contenedor que busca esta en:");
    				System.out.println("pila "+ i + ", Contenedor " + j + " El id de la pila es " + pilas[i].getId());
    				return "";
    			}
    		}
    	}
        return "error";
    }
}
