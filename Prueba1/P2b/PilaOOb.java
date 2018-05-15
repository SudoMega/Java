
package Prueba1;

public class PilaOOb {

		 Contenedor[] pila;
		 int idPila;
		
		//Constructor Vacío
		public PilaOOb(int id){
			
			idPila = id;
			pila = new Contenedor[51];
		}
		
	    public void Push(int x, int suma) {
			
			int i= 0;
			while (pila[50]== null) {
				if (pila[i]== null) {pila[i] = new Contenedor(suma, x); break;}
				i++;
				}

		}
			public void Pop(){
				
				if (pila[0] == null) System.out.println("Pila Vacia");
				else {
				int i = 0;
				while (pila[50]== null) {
					if (pila[i]== null) {System.out.println("El contenido del contenedor era: " + pila[i].getContenido());pila[i-1] = null; break;}
					else i++;
				    }
			    }
			}
			
			public boolean IsEmpty(){
				if (pila[0] == null) return true;
				else return false;
			}
			public int getId() {return idPila;}
	
}
