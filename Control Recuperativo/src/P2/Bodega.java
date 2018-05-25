package P2;

import java.util.ArrayList;

public class Bodega {

	ArrayList<Producto> listaProductos;
	ArrayList<EmpleadoBodega> listaEmpleados;
	
	public Bodega() {
		listaProductos = new ArrayList<Producto>();
		listaEmpleados = new ArrayList<EmpleadoBodega>();
	}
	
public void AddProducto(Producto producto) { 
	
	if (listaEmpleados.size() > 0) { listaProductos.add(producto);}
	else System.out.println("No hay empleados!"); 
	}
	
public void RemoveProducto(int index) {
	
	if (listaProductos.size() == 0) System.out.println("No hay productos!");
	else if(listaProductos.size() >= index)  listaProductos.remove(index-1);
	else System.out.println("No hay productos");
	
}

public void PonerEnPasillo(Producto producto) {
	
	producto.estaEnPasillo = true;
	
}
public void AddEmpleado(EmpleadoBodega empleado) {
	listaEmpleados.add(empleado);
	
}
public void RemoveEmpleado(int index) {
	listaEmpleados.remove(index);
	
}

}
