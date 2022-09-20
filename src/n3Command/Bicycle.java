package n3Command;

public class Bicycle implements Vehicle {

	@Override
	public void acelerate() {
		System.out.println("A pedalear más fuerte");
	}

	@Override
	public void break_() {
		System.out.println("Frenando");

	}

	@Override
	public void run() {
		System.out.println("Pedalenado");
	}

}
