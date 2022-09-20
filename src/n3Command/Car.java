package n3Command;

public class Car implements Vehicle {

	@Override
	public void acelerate() {
		System.out.println("No puedes sobrepasar el límite de velocidad");
	}

	@Override
	public void break_() {
		System.out.println("frenando coche");
	}

	@Override
	public void run() {
		System.out.println("brum brummmm");
	}

}
