package Projecto;

import java.util.ArrayList;

public class TaskList {

	private static ArrayList<Task> list;
	
	//CONSTRUCTOR VACIO
    public TaskList()
    {
        list = new ArrayList<Task>();
    }
	
	
	//METODO PARA AGREGAR TAREAS A LA LISTA
	public static void AddTask(Task task) {  
		
		list.add(task);
		list.get(list.size()-1).ChangeId(list.size()-1);
	}
	
	//METODO PARA REMOVER TAREAS DE LA LISTA 
	public static void RemoveTask(int x) {
		
		if (list.size() == 0) System.out.println("No hay tareas!");
		else if(list.size() >= x) list.remove(x-1);
		else System.out.println("El numero que ingreso no pertenece a una tarea");
		
	}
	
    //METODO PARA MOSTRAR LO QUE CONTIENE LA LISTA DE TAREAS
	public static void ShowTaskList() {
		
		if (list.size() == 0) System.out.println("No hay tareas!");
		
		else
		for(int i=0;i < list.size();i++) {
			
			System.out.println((i+1) + ": " + list.get(i).GetMessage());
			
		}
		
		
	}
	
}
