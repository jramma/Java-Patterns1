package n3Command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue implements AccionarVehiculo {

	private List<AccionarVehiculo> queue = new ArrayList<AccionarVehiculo>();
	
	public void addAccion(AccionarVehiculo accion) {
		queue.add(accion);
	}
	
	@Override
	public void accionar(Vehiculo vehiculo) {
		queue.forEach((a)-> a.accionar(vehiculo));

	}

}


