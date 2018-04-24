package Projecto;

public class TaskList {

	public Task[] List = new Task[100]; //Define la lista de tareas, con un maximo de 100 tareas por ahora
	//String[] Task = new String[100];
		
	
	// METODO PARA AGREGAR TAREAS A LA LISTA DE TAREAS
	public static TaskList AddTask(TaskList lista, String s) {
		
		//Task t1  = new Task();
		//t1.Message = s;
		lista.List[0].Message = null;
		
		if (lista.List[0].Message == null) {
			
			lista.List[0].Message = s;
			
			return lista;
		}
		
		
		for (int i = 0; lista.List[i].Message != null; i++) {
			
			if (lista.List[i].Message == null) {
				
				lista.List[i].Message = s;
				break;
			}
			
			
			if(i == 99) break;
		}
		
		return lista;
	}
	
}
