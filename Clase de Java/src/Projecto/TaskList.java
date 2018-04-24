package Projecto;

public class TaskList {

	public Task[] List = new Task[100]; //Define la lista de tareas
		
	public static TaskList AddTask(TaskList lista, String s) {
		
		Task t1  = new Task();
		t1.Message = s;
		
		return lista;
	}
	
}
