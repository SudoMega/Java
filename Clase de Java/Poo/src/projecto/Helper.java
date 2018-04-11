package projecto;

import java.util.Scanner;

public class Helper {
	
	public static void AskTask() {
		
		int size;
		String[] tasks;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Cuantas Tareas quiere ingresar: ");
		size = in.nextInt();
		tasks = new String[size];
		in.nextLine();
		
		for(int x=1; x<=size; x++) {
			
			System.out.print("Tarea " + x + " : " );
			tasks[x-1] = in.nextLine();
		}
		
		System.out.println();

		for(int x=0; x<size; x++) {
			
			System.out.println(tasks[x]);

		}
		
		in.close();
	}
	
	
	public static void main(String[] args) {
		
		AskTask();
	
	}
}
