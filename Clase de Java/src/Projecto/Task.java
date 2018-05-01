package Projecto;
import java.util.Date;

public class Task {
	//tarea, id, string, hora y fecha
	
	public int id;
	public String Message; // Esto es lo que dice la tarea, por ejemplo, leer el diario
	public Date hora;
	
	public Task(int TaskId, String text) {
		
		id = TaskId;
		Message = text;
		
	}
	
}
