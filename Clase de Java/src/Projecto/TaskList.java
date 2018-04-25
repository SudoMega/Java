package Projecto;

import java.util.ArrayList;

public class TaskList {

	ArrayList<String> list = new ArrayList<String>();
	
	//public Task[] List = new Task[100];         //Define la lista de tareas con la clase Task, con un maximo de 100 
	//public String[] List = new String[100];     //Define la lista de tareas con Strings, con un maximo de 100                           

	// METODO PARA AGREGAR TAREAS A LA LISTA DE TAREAS CON STING FIJO (actualmente no se utiliza)
/*	public static TaskList AddTask2(TaskList lista, String s) {
		
		//Task t1  = new Task();
		//t1.Message = s;
		
		if (lista.List[0] == null) {
			
			lista.List[0]= s;
			return lista;
		}
		
		int i = 0;
		while (lista.List[i] != null) {
			
			i++;
			if (lista.List[i] == null) {

				lista.List[i] = s;
				break;
			}

			if(i == 99) break;
		}
		return lista;
	}
*/
	
	//METODO PARA AGREGAR TAREAS A LA LISTA
	public static TaskList AddTask(TaskList lista, String s) {  
		
		lista.list.add(s);
		
		return lista;
	}
	
	//METODO PARA REMOVER TAREAS DE LA LISTA 
	public static TaskList RemoveTask(TaskList lista, int x) {
		
		if (lista.list.size() == 0) System.out.println("No hay tareas!");
		else if(lista.list.size() >= x) lista.list.remove(x-1);
		else System.out.println("El numero que ingreso no pertenece a una tarea");
		
		return lista;
	}
	
    //METODO PARA MOSTRAR LO QUE CONTIENE LA LISTA DE TAREAS
	public static void ShowTaskList(TaskList lista) {
		
		if (lista.list.size() == 0) System.out.println("No hay tareas!");
		
		else
		for(int i=0;i < lista.list.size();i++) {
			
			System.out.println((i+1) + ": " + lista.list.get(i));
			
		}
		
		
	}
	
}
