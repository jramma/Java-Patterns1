package n3Command;

public class Plane implements Vehicle {

	@Override
	public void acelerate() {
		System.out.println("Acelerando");
	}

	@Override
	public void break_() {
		System.out.println("frenando (espero que en tierra)");
	}

	@Override
	public void run() {
		System.out.println("Turbinas encendidas");
	}

}
