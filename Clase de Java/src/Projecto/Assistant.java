package Projecto;

import java.io.IOException;
import java.util.Scanner;
/*
 * tarea, id, string, hora y fecha
 * 
 * news id, fecha hora, header, url, subtitulo
 * 
 * 
 */
public class Assistant {
		
	public static void main(String[] args){   //El main crea solo el menu y los objetos
		
		Scanner in = new Scanner(System.in);
		int op;
		int on = 1;
		String Tarea;
		TaskList lista = new TaskList();  // Crea el objeto "lista" de la clase TaskList
		Call llamada = new Call();        // Crea el objeto "llamada" de la clase Call (actualmente no se utiliza)
		
		System.out.println("Bienvenido, porfavor ingrese una de las siguientes opciones:");
		
		while (on == 1) {
			System.out.println("");
			System.out.println("1- Agregar una tarea");
			System.out.println("2- Leer sus tareas del dia");
			System.out.println("3- Eliminar una tarea");
			System.out.println("4- Ver las noticias del Dia");
			op = in.nextInt();
			in.nextLine();
			
			switch (op) {
        
			    case 1:  System.out.println("Ingrese una tarea para el dia");
				         Tarea = in.nextLine();
			    	     lista = TaskList.AddTask(lista,Tarea);
			             break;
			    
               	case 2:  TaskList.ShowTaskList(lista);
               	         break;
               	         
               	case 3:  if (lista.list.size() == 0) {System.out.println("No hay tareas!"); break;} //esta es la unica instancia que le pregunto en el main sobre el objeto directamente, para facilitarle el uso al usuario
               		     System.out.println("Ingrese el numero de la tarea que desea eliminar");
		                 op = in.nextInt(); 
               		     lista = TaskList.RemoveTask(lista,op);;
               	         break;
               	         
               	case 4: try {News.ReadNews();}
               	        catch (IOException e) {System.out.println("No pudimos establecer conección con sus noticias");}
               	        break;
               
		    }
		
		}
		
		in.close();
	
    }
	
}
