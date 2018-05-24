package P1;

/**
 * para efectos de este control, la bodega controla objetos en pasillo y en bodega misma, lo unico que hace el cajero es ver si el producto
 * esta o no en pasillo con su variable, si es asi lo puede vender
 * 
 * reposicion agrega productos a la bodega, estos pueden ser de la subclase arroz, carne o quesos 
 *
 *
 */


public class Supermercado {
	

	public static void main (String[] args) {
		
		Producto producto;
		Bodega bodega = new Bodega();
		Cajero cajero = new Cajero();  
		Reposicion reposicion = new Reposicion();      
		
		
        //se agrega 1 empleado a cada seccion, que es lo minimo para poder mover los items en el supermercado
		bodega.AddEmpleado(null);
	    cajero.AddEmpleado(null);
     	reposicion.AddEmpleado(null);
		
		/* con esto podemos quitar empleados
		 * 
		bodega.RemoveEmpleado(0);
        cajero.RemoveEmpleado(0);
	    reposicion.RemoveEmpleado(0);
	    *
		*/
		
		//aqui se agregan productos de cada tipo pormolemons 1 vez
     	//Esto se agrega desde reposicion hacia bodega, tambien los pone, de momento, en pasillo
     	//Como se puede ver en el codigo, se agregan productos del tipo carne, queso y arroz, pero todos siguen siendo productos y la lista de bodega solo acepta productos
		producto = new Carne("Posta Negra", "Lider",null , null, null, true);
		reposicion.addBodega(producto, bodega); 
		producto = new Queso("Queso Chanco", "Colun",null , null, null,"Chanco");
		reposicion.addBodega(producto, bodega); 
		producto = new Arroz("Arroz Grado1", "Acuenta",null , null, null, 2);
		reposicion.addBodega(producto, bodega); 
		producto = new Queso("Queso Gauda", "Colun",null , null, null,"Gauda");
		reposicion.addBodega(producto, bodega);
		producto = new Carne("Posta Negra", "Lider",null , null, null, true);
		reposicion.addBodega(producto, bodega);
	
		//Esta opcion vende los objetos y imprime en pantalla lo que son
		cajero.Sell(3, bodega);
		cajero.Sell(0, bodega);
		cajero.Sell(0, bodega);
		cajero.Sell(0, bodega);

    }
		

	}
	
	

