package Projecto;

import java.util.Scanner;

public class Assistant {
		
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op;
		int on = 1;
		String Tarea;
		TaskList lista = new TaskList();  // Crea el objeto "lista" de TaskList
		
		System.out.println("Bienvenido, porfavor ingrese una de las siguientes opciones:");
		
		while (on == 1) {
			System.out.println("");
			System.out.println("1- Agregar una tarea");
			System.out.println("2- Leer sus tareas del dia");
			System.out.println("3- Eliminar una tarea");
			op = in.nextInt();
			in.nextLine();
			
			switch (op) {
        
			    case 1:  System.out.println("Ingrese una tarea para el dia");
				         Tarea = in.nextLine();
			    	     lista = TaskList.AddTask(lista,Tarea);
			             break;
			    
               	case 2:  TaskList.ShowTaskList(lista);
               	         break;
               	         
               	case 3:  if (lista.list.size() == 0) {System.out.println("No hay tareas!"); break;}
               		     System.out.println("Ingrese el numero de la tarea que desea eliminar");
		                 op = in.nextInt(); 
               		     lista = TaskList.RemoveTask(lista,op);;
               	         break;
               
		    }
		
		}
		
		in.close();
	
    }
	
}
