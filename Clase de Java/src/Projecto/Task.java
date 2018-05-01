package Projecto;
import java.util.Date;

public class Task {
	//tarea, id, string, hora y fecha
	
	private int id;
	public String Message; // Esto es lo que dice la tarea, por ejemplo, leer el diario
	public Date hora;
	
	public Task(int TaskId, String text) {
		
		Message = text;
		
	}
	
	public void ChangeId(int TaskId) {
		id = TaskId;
	}
	
	public String GetMessage() {
		
		return Message;
	}
	
}
