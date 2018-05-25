package P2;

import java.sql.Date;

public class Queso extends Producto {

	String tipoQueso;
	
	public Queso(String n, String m, Date fI, Date fF, Date fV, String tipo) {
		super(n, m, fI, fF, fV);
		tipoQueso = tipo;
	}

}
