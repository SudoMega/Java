package Projecto;

import java.util.Scanner;

public class Assistant {
	
	public static void CheckTasks() {
				
		//System.out.println();
		Tasks Task = new Tasks();

		for(int x=0; x<Tasks.size; x++) {
			
			System.out.println(tasks.Task[x]);

		}
		
	}

	public static void CheckAlerts() {
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op;
		int on = 1;
		
		System.out.println("Bienvenido, porfavor ingrese una de las siguientes opciones:");
		
		while (on == 1) {
			
			System.out.println("1- Agregar tareas");
			System.out.println("2- Leer sus tareas del dia");
			System.out.println("3- Exit");
			op = in.nextInt();
			
			switch (op) {
        
			    case 1:  Tasks.AddTask();
			             break;
			    
               	case 2:  CheckTasks();
               	         break;
               	         
               	case 3:  on = 0;
               	         break;
               
		    }
		
		}
		
		in.close();
	
    }
	
}
