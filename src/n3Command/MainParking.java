package n3Command;

public class MainParking {
	public static void main(String[] args) {
		
		// vehiculos disponibles plane, car, boat y bicycle

		Vehicle newVehicle = Parking.parking();
		int input = 0;
		AceleradorYFreno pressAcelerador = null;
		if(newVehicle != null) {
		switch (input = Entrada.leerInt(" 1.Break_" + "\n 2.Run" + "\n 3.Accelerate")) {
		case 1:
			Break_ breakCommand = new Break_(newVehicle);
			pressAcelerador = new AceleradorYFreno(breakCommand);
			break;
		case 2:

			Run runCommand = new Run(newVehicle);
			pressAcelerador = new AceleradorYFreno(runCommand);
			break;
		case 3:
			Accelerate accelerateComand = new Accelerate(newVehicle);
			pressAcelerador = new AceleradorYFreno(accelerateComand);
			break;
		default:
			System.out.println("Intentalo de nuevo :D");

		}

		pressAcelerador.press();
		}
	}

}
