package n3Command;

public class MainParking {
	public static void main(String [] args) {
		// solo he creado BreakBoat, RunBicylcle
		Vehicle newVehicle = Parking.parking();
		
		Break_ breakCommand = new Break_(newVehicle);
		
		AceleradorYFreno pressAcelerador = new AceleradorYFreno(breakCommand);
		
		pressAcelerador.press();
		
	}
	
}
