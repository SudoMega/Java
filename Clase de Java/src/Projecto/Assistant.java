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
		Task task;
		Call call;
		TaskList listaTareas = new TaskList();  // Crea el objeto "lista" de la clase TaskList
		CallList listaLlamadas = new CallList();        // Crea el objeto "llamada" de la clase Call (actualmente no se utiliza)
		
		System.out.println("Bienvenido, porfavor ingrese una de las siguientes opciones:");
		
		while (on == 1) {
			System.out.println("");
			System.out.println("1- Agregar una tarea");
			System.out.println("2- Leer sus tareas del dia");
			System.out.println("3- Eliminar una tarea");
			System.out.println("4- Ver las noticias del Dia");
			System.out.println("5- Llamada entrante al azar");
			System.out.println("6- Revisar las llamadas");
			op = in.nextInt();
			in.nextLine();
			
			switch (op) {
        
			    case 1:  System.out.println("Ingrese una tarea para el dia");
				         Tarea = in.nextLine();
				         System.out.println("Ingrese la hora (minutos-hora)");
				         String tiempo = in.nextLine();
				         task = new Task(0, Tarea, tiempo);
			    	     listaTareas.AddTask(task);
			             break;
			    
               	case 2:  listaTareas.ShowTaskList();
               	         break;
               	         
               	case 3:  System.out.println("Ingrese el numero de la tarea que desea eliminar");
		                 op = in.nextInt(); 
               		     listaTareas.RemoveTask(op);
               	         break;
               	         
               	case 4: try {News.ReadNews();}
               	        catch (IOException e) {System.out.println("No pudimos establecer conección con sus noticias");}
               	        break;
               	        
               	case 5:System.out.println("Se ingreso un numero al azar, ¿quiere dejar un mensaje?(true/false)");
                       Boolean y = in.nextBoolean();
               	       if (y == true) {
               	       System.out.println("Ingrese el mensaje:");
               	       String mensaje = in.nextLine();
               	       in.nextLine();
               	       call = new Call(0, mensaje);
      //        	       listaLlamadas.AddCall(call);
               	       }
               	       else {call = new Call(0, null);  break;}
               		
               	case 6:
               
		    }
		
		}
		
		in.close();
	
    }
	
}
