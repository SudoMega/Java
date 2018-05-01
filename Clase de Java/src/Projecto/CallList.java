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
    
	public void AddCall(Call call) {  
		
		lostCalls.add(call);
		lostCalls.get(lostCalls.size()-1).ChangeId(lostCalls.size()-1);
	}
    
	public void CheckAllCalls() { 
		
		if (lostCalls.size() == 0) System.out.println("No hay llamdas perdidas!");  //Muestra las llamadas perdidas
		
		else
			System.out.println("Llamadas Perdidas: ");
		for(int i=0;i < lostCalls.size();i++) {
			
			if(lostCalls.get(i).GetMessage()!= null) {
			     System.out.println(lostCalls.get(i).GetDate() + "("+ lostCalls.get(i).GetNumber() + "): " + lostCalls.get(i).GetMessage());
			}
			else System.out.println(lostCalls.get(i).GetDate() + "("+ lostCalls.get(i).GetNumber() + "): No hay mensaje");
		}
		if (callsOfTheDay.size() == 0) System.out.println("No hay llamdas en el registro de hoy"); //Muestra todas las llamadas del dia
		
		else {
			System.out.println("Llamadas del dia: ");
		    for(int i=0;i < callsOfTheDay.size();i++) {
		       	if(callsOfTheDay.get(i).GetMessage()!= null) {
			         System.out.println(callsOfTheDay.get(i).GetDate() + "("+ callsOfTheDay.get(i).GetNumber() + "): " + callsOfTheDay.get(i).GetMessage());
		    	}
			    else System.out.println(callsOfTheDay.get(i).GetDate() + "("+ callsOfTheDay.get(i).GetNumber() + "): No hay mensaje");
		    }
		}
		if (lostCalls.size() > 0) {  //Pasa las llamadas perdidas a llamadas del dia
			
			callsOfTheDay.addAll(lostCalls);
			lostCalls.clear();
			
		}
		

	}
}
