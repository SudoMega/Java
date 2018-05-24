package P1;

import java.sql.Date;

/**
 * para efectos de este control, la bodega controla objetos en pasillo y en bodega misma, lo unico que hace el cajero es ver si el producto
 * esta o no en pasillo con su variable, si es asi lo puede vender
 * 
 * reposicion agrega productos a la bodega, estos pueden ser de la subclase arroz, carne o quesos 
 * para simplificar, el la opcion agregar empleado agrega de los 3 empleados a cada una de las zonas, lo mismo con remover
 *
 */


public class Supermercado {

	int on = 1;
	String Tarea;
	final Date date;
	Producto producto;
	Bodega bodega = new Bodega();
	Cajero cajero = new Cajero();  // Crea el objeto "lista" de la clase TaskList
	CallList listaLlamadas = new CallList();        // Crea el objeto "llamada" de la clase Call (actualmente no se utiliza)
	
	System.out.println("Bienvenido, porfavor ingrese una de las siguientes opciones:");
	
	public static void main (String[] args) {
		
		while (on == 1) {
			System.out.println("");
			System.out.println("1- agregar objeto a bodega");
			System.out.println("2- vender objeto");
			System.out.println("3- mover objeto a pasillo");
			System.out.println("4- agregar empleado");
			System.out.println("5- remover empleado");
			System.out.println("6- ");
			op = in.nextInt();
			in.nextLine();
			
			switch (op) {
        
			    case 1:  System.out.println("1-carne 2-queso 3-arroz");
				         int i = in.nextLine();
				         if (i == 1) {
				         Producto producto = new Carne("arroz", "acuenta",null , null, null, true);
				         String tiempo = in.nextLine();
				         task = new Task(0, Tarea, tiempo);
			    	     listaTareas.AddTask(task);
			             break;
			    
               	case 2:  listaTareas.ShowTaskList();
               	         break;
               	         
               	case 3:  System.out.println("Ingrese el numero de la tarea que desea eliminar");
		                 op = in.nextInt(); 
               		     listaTareas.RemoveTask(op);
               	         break;
               	         
               	case 4: try {News.ReadNews();}
               	        catch (IOException e) {System.out.println("No pudimos establecer conección con sus noticias");}
               	        break;
               	        
               	case 5:System.out.println("Se ingreso un numero al azar, ¿quiere dejar un mensaje?(1:si/2:no)");
                       int y = in.nextInt();
                       in.nextLine();
               	       if (y == 1) {
               	       System.out.println("Ingrese el mensaje:");
               	       String mensaje = in.nextLine();
               	       call = new Call(0, mensaje);
             	       listaLlamadas.AddCall(call);
             	       break;
               	       }
               	       else {call = new Call(0, null); listaLlamadas.AddCall(call);  break;}
               		
               	case 6:listaLlamadas.CheckAllCalls();
               	       break;
               
		    }
		
		}
		
		in.close();
	
    }
		
		
	}
	
	
}
