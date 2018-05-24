package P1;

import java.util.ArrayList;

public class Cajero {

	ArrayList<EmpleadoCajero> listaEmpleados;
	
	public Cajero() {
		
listaEmpleados = new ArrayList<EmpleadoCajero>();

	}
	
public void Sell(int producto, Bodega bodega) { 
	
	if (listaEmpleados.size() > 0) {
		
		if(bodega.listaProductos.get(producto).estaEnPasillo == true) {
		bodega.RemoveProducto(producto + 1);
		System.out.println(bodega.listaProductos.get(producto).nombre +", "+ bodega.listaProductos.get(producto).marca);
	}
		else System.out.println("El objeto no esta en pasillo!");
	}
	
	else System.out.println("No hay empleados para vender!"); 
	

	}
	
public void AddEmpleado(EmpleadoCajero empleado) {
	listaEmpleados.add(empleado);
	
}
public void RemoveEmpleado(int index) {
	listaEmpleados.remove(index);
	
}

	
}
