package P1;

import java.sql.Date;

public class Producto {

	String nombre;
	String marca;
	Date fechaIngreso;
	Date fechaFabricacion;
	Date fechaVencimiento;
	boolean estaEnPasillo; 
	
	public Producto (String n, String m, Date fI, Date fF, Date fV) {
		nombre = n;
		marca = m;
		fechaIngreso = fI;
		fechaFabricacion = fF;
		fechaVencimiento= fV;
		estaEnPasillo = false;
						
	}
	
}
