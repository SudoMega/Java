package Prueba1;

//CADA CONTENEDOR TIENE UN ID Y SU CONTENIDO

public class Contenedor {

	int idContenedor;
	int contenido;
	
	public Contenedor(int x, int y) {
		
		idContenedor = x;
		contenido = y;
	}
	
	public int getId() {return idContenedor;}
	
	public int getContenido() {return contenido;}
}
