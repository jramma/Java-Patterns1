package n3Command;

public class Break_ implements VehicleComands{
Vehicle vehicle;
	
	public Break_(Vehicle newVehicle) {
		
		vehicle = newVehicle;
	}
	
	@Override
	public void execute() {
		vehicle.break_();
	}
}
