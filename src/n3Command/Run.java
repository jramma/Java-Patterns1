package n3Command;

public class Run implements VehicleComands{
Vehicle vehicle;
	
	public Run(Vehicle newVehicle) {
		
		vehicle = newVehicle;
	}
	
	@Override
	public void execute() {
		vehicle.run();
	}
}
