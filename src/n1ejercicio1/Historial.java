package n1ejercicio1;

import java.util.ArrayList;

public class Historial {
	
	private static ArrayList <Historial> instance;
	
	private Historial() {
		
	}
	public static synchronized ArrayList<Historial> getInstance() {
		if(instance== null) {
			
			instance = new ArrayList<Historial>();
		}
		return instance;
		
		
	}

}
