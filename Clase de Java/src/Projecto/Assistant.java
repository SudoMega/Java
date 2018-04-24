package Projecto;

import java.util.Scanner;

public class Assistant {
		
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op;
		int on = 1;
		TaskList lista = new TaskList();  // Crea el objeto "lista" de TaskList

		
		System.out.println("Bienvenido, porfavor ingrese una de las siguientes opciones:");
		
		while (on == 1) {
			
			System.out.println("1- Agregar tareas");
			System.out.println("2- Leer sus tareas del dia");
			System.out.println("3- Exit");
			op = in.nextInt();
			
			switch (op) {
        
			    case 1:  TaskList.AddTask(lista,"string"); // Para probar pormientras solo e puesto una palabra estatica
			             break;
			    
               	case 2:  System.out.println(lista.List[1].Message); // Falta crear una funcion, esto es para probar si se agregan las tareas
               	         break;
               	         
               	case 3:  on = 0;
               	         break;
               
		    }
		
		}
		
		in.close();
	
    }
	
}
