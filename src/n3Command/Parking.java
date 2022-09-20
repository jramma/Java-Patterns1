package n3Command;

public class Parking {
	public static Vehicle parking() {
		String vehicle1 = Entrada.leerString("Introduce your vehicle");
		Vehicle vehicle = null;

		switch (vehicle1.toLowerCase()) {
		case "car":
			Vehicle car= new Car();
			vehicle =car;
			break;
		case "plane":
			Vehicle boat= new Plane();
			vehicle = boat;

			break;
		case "boat":
			Vehicle plane= new Boat();
			vehicle = plane;

			break;
		case "bicycle":
			Vehicle bicycle= new Bicycle();
			vehicle =bicycle;
			break;
		default:
			System.out.println("We don't have that on this parking");
		}
		return vehicle;

	}
}
