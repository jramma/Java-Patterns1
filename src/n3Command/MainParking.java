package n3Command;

public class MainParking {
	public static void main(String [] args) {
		// vehiculos disponibles "car" "bicycle" "plane" "boat"
		Vehicle newVehicle = Parking.parking();
		
		Break_ breakCommand = new Break_(newVehicle);
		
		AceleradorYFreno pressAcelerador = new AceleradorYFreno(breakCommand);
		
		pressAcelerador.press();
		
	}
	
}
