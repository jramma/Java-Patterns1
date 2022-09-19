package n1ejercicio1;


public final class Undo {

	private static Undo historial;
	public String txt;
	
	private Undo(String txt) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		this.txt= txt;
	}
	public static Undo getInstance(String txt) {
		if(historial== null) {
			historial = new Undo(txt);
		}
		return historial;
		
		
	}
	
	
	
	
	
	
}
