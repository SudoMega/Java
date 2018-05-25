package P2;

import java.util.ArrayList;

/**
 * Todo funciona fundamentalmente de la misma manera, pero ahora tenemos un control central que genera una lista de supermercados que pueden hacer cosas individualmente
 * Para simplificar un poco, los supermercados tienen un metodo para agregar especificamente carne, arroz o queso, el resto es fundamentalmente igual
 * 
 */
public class ControlGeneral {
	

	public static void main (String[] args) {
		
		ArrayList<Supermercado> listaSupermercado = new ArrayList<Supermercado>();
		Supermercado S1 = new Supermercado();
		Supermercado S2 = new Supermercado();
		
     	//Agregamos 2 supermercados a la lista
		listaSupermercado.add(S1);
		listaSupermercado.add(S2);
		
        //se agrega 1 empleado a cada seccion, que es lo minimo para poder mover los items en el supermercado, en cada supermercado
        listaSupermercado.get(0).AddEmpleados();
        listaSupermercado.get(1).AddEmpleados();
     	

		//aqui se agregan productos de cada tipo pormolemons 1 vez
     	//Esto se agrega desde reposicion hacia bodega, tambien los pone, de momento, en pasillo
     	//Como se puede ver en el codigo, se agregan productos del tipo carne, queso y arroz, pero todos siguen siendo productos y la lista de bodega solo acepta productos
        listaSupermercado.get(1).AddCarne();
        listaSupermercado.get(0).AddCarne();
        listaSupermercado.get(1).AddArroz();
        listaSupermercado.get(0).AddArroz();
        listaSupermercado.get(1).AddQueso();
        listaSupermercado.get(0).AddQueso();
	
		//Esta opcion vende el primer objeto que hay en la lista, se puede implementar facilmente para que acepte numeros como el ID
        listaSupermercado.get(0).Vender();
        listaSupermercado.get(0).Vender();
        listaSupermercado.get(1).Vender();
        listaSupermercado.get(1).Vender();

    }
		
	}
	
	

