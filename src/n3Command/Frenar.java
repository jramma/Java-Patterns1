package n3Command;

public class Frenar implements AccionarVehiculo{

	@Override
	public void accionar(Vehiculo vehiculo) {
		System.out.println("Frenando... \n"+ vehiculo.frenar());
		
	}

}
