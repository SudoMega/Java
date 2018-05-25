package P2;

public class Supermercado {

	Producto producto;
	Bodega bodega;
	Cajero cajero;  
	Reposicion reposicion;
	
	public Supermercado() {
		
		bodega = new Bodega();
		cajero = new Cajero();
		reposicion = new Reposicion();
	}
	
	//Es facil agregar cosas para reemplazar los nombres y marcas de los productos, pero para mantenerlo simple, va a estar predeterminado
	
	public void AddCarne() {
		producto = new Carne("Posta Negra", "Lider",null , null, null, true);
		reposicion.addBodega(producto, bodega);
	}
	public void AddArroz() {
		producto = new Arroz("Arroz Grado1", "Acuenta",null , null, null, 2);
		reposicion.addBodega(producto, bodega);
	}
	public void AddQueso() {
		producto = new Queso("Queso Chanco", "Colun",null , null, null,"Chanco");
		reposicion.addBodega(producto, bodega);
	}
	

	public void AddEmpleados() {
		bodega.AddEmpleado(null);
	    cajero.AddEmpleado(null);
     	reposicion.AddEmpleado(null);
	}
	
	public void Vender() {
		cajero.Sell(0, bodega);
		
	}
}
