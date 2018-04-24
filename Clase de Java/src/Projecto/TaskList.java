package Projecto;

public class TaskList {

	public Task[] List = new Task[100]; //Define la lista de tareas
	//String[] Task = new String[100];
		
	public TaskList AddTask(TaskList lista, String s) {
		
		//Task t1  = new Task();
		//t1.Message = s;
		
		if (lista.List[0].Message == null) {
			
			lista.List[0].Message = s;
			
			return lista;
		}
		
		
		for (int i = 0; lista.List[i].Message != null; i++) {
			
			if (lista.List[i].Message == null)
			
			
			if(i == 99) break;
		}
		
		return lista;
	}
	
}
