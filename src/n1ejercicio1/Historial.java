package n1ejercicio1;


public class Historial {
	private static Historial instance;
	
	private Historial() {
		
	}
	public static synchronized Historial getInstance() {
		if(instance== null) {
			instance = new Historial();
		}
		return instance;
		
		
	}

}
