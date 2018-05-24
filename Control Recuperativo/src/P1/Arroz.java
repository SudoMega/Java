package P1;

import java.sql.Date;

public class Arroz extends Producto {

	int grano;
	
	public Arroz(String n, String m, Date fI, Date fF, Date fV, int tipo) {
		super(n, m, fI, fF, fV);
		grano = tipo;
	}


	
}
