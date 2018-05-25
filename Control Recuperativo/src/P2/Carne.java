package P2;

import java.sql.Date;

public class Carne extends Producto {

	boolean roja;
	
	public Carne(String n, String m, Date fI, Date fF, Date fV, boolean tipo) {
		super(n, m, fI, fF, fV);
		roja = tipo;
		// TODO Auto-generated constructor stub
	}

	
	
}
