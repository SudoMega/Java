package Projecto;

import java.util.ArrayList;

public class CallList {

	
	ArrayList<Call> lostCalls;      // Lista para guardar las llamadas perdidas
    ArrayList<Call> callsOfTheDay;  // Lista de las llamadas del dia
	
    public CallList()
    {
        lostCalls = new ArrayList<Call>();
        callsOfTheDay = new ArrayList<Call>();
    }
    
	public void AddTask(Call call) {  
		
		lostCalls.add(call);
		lostCalls.get(lostCalls.size()-1).ChangeId(lostCalls.size()-1);
	}
    
	public Call CheckAllCalls(Call llamada) { 
		
		if (lostCalls.size() == 0) System.out.println("No hay llamdas perdidas!");  //Muestra las llamadas perdidas
		
		else
			System.out.println("Llamadas Perdidas: ");
		for(int i=0;i < lostCalls.size();i++) {
			
			System.out.println((i+1) + ": " + lostCalls.get(i));
			
		}
		if (callsOfTheDay.size() == 0) System.out.println("No hay llamdas en el registro de hoy"); //Muestra todas las llamadas del dia
		
		else
		for(int i=0;i < callsOfTheDay.size();i++) {
			System.out.println("Llamadas del dia: ");
			System.out.println((i+1) + ": " + callsOfTheDay.get(i));
			
		}
		
		if (lostCalls.size() != 0) {  //Pasa las llamadas perdidas a llamadas del dia
			
			callsOfTheDay.addAll(lostCalls);
			lostCalls.clear();
			
		}
		
		return llamada;
	}
}
