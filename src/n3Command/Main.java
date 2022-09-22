package n3Command;
import parking.Avion;
import parking.Barco;
import parking.Bicicleta;
import parking.Coche;

public class Main {
	
	public static void main(String[] args) {

	CommandQueue q = new CommandQueue();	
	q.addAccion( new Arrancar());
	q.addAccion(new Acelerar());
	q.addAccion(new Frenar());
	
	Command command = new Command();
	Coche coche = new Coche();
	Bicicleta bicilceta = new Bicicleta();
	Barco barco = new Barco();
	Avion avion = new Avion();
	command.ejecutar(q, coche);
	command.ejecutar(q, bicilceta);
	command.ejecutar(q, barco);
	command.ejecutar(q, avion);
	
	
	
	
	
	}
}
