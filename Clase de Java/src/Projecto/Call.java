package Projecto;

import java.util.ArrayList;

public class Call {

	int number; // Numero de la llamada
	int timer;  // Tiempo que lleva la llamada desde que empezo
	
	ArrayList<int[]> lostCalls = new ArrayList<int[]>();      // Lista para guardar las llamadas perdidas
	ArrayList<int[]> callsOfTheDay = new ArrayList<int[]>();  // Lista de las llamadas del dia
	
	
	//METODO PARA RECIBIR LLAMADAS Y INGRESARLAS A "lostCalls" (aun no esta terminado)
	public static Call IncomingCall(Call llamada) { 
		                                            
		return llamada;
	}
	
	//METODO PARA REVISAR LAS LLAMADAS DEL DIA Y PASAR LAS LLAMADAS PERDIDAS A LLAMADAS DEL DIA
	public static Call CheckAllCalls(Call llamada) { 
		
		if (llamada.lostCalls.size() == 0) System.out.println("No hay llamdas perdidas!");  //Muestra las llamadas perdidas
		
		else
			System.out.println("Llamadas Perdidas: ");
		for(int i=0;i < llamada.lostCalls.size();i++) {
			
			System.out.println((i+1) + ": " + llamada.lostCalls.get(i));
			
		}
		if (llamada.callsOfTheDay.size() == 0) System.out.println("No hay llamdas en el registro de hoy"); //Muestra todas las llamadas del dia
		
		else
		for(int i=0;i < llamada.callsOfTheDay.size();i++) {
			System.out.println("Llamadas del dia: ");
			System.out.println((i+1) + ": " + llamada.callsOfTheDay.get(i));
			
		}
		
		if (llamada.lostCalls.size() != 0) {  //Pasa las llamadas perdidas a llamadas del dia
			
			llamada.callsOfTheDay.addAll(llamada.lostCalls);
			llamada.lostCalls.clear();
			
		}
		
		return llamada;
	}
	
}
