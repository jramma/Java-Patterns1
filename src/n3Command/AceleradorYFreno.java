package n3Command;

public class AceleradorYFreno {
	VehicleComands command;

	public AceleradorYFreno(VehicleComands newCommand) {
		command = newCommand;
	}

	public void press() {

		command.execute();
	}

}
