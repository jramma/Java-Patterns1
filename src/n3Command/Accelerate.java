package n3Command;

public class Accelerate implements VehicleComands {
	
	Vehicle vehicle;
	
	public Accelerate(Vehicle newVehicle) {
		
		vehicle = newVehicle;
	}
	
	@Override
	public void execute() {
		vehicle.run();
	}

}
