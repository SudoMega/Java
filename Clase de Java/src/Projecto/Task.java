package Projecto;
import java.text.DateFormat;

public class Task {
	//tarea, id, string, hora y fecha
	
	private int id;
	private String message; // Esto es lo que dice la tarea, por ejemplo, leer el diario
	private String date;
//    DateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
//   Date date = new Date();
	
	public Task(int TaskId, String text, String tiempo) {
		
		message = text;
		date = tiempo;
	}
	
	public void ChangeId(int TaskId) {
		id = TaskId;
	}
	
	public String GetMessage() {
		
		return message;
	}

	public String GetDate() {
		
		return date;
	}
	
}
