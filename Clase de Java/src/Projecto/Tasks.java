package Projecto;

import java.util.Scanner;

public class Tasks {

	public static void AddTask() {
		
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
		
	}
}
