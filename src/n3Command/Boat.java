package n3Command;

public class Boat implements Vehicle{

	@Override
	public void acelerate() {
		System.out.println("Arriando velas");
		
	}

	@Override
	public void break_() {
		System.out.println("los barcos no frenan, te vas a la deriva");
	}

	@Override
	public void run() {
		System.out.println("Barco en marcha");		
	}

}
