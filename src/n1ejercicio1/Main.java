package n1ejercicio1;

public class Main {


	public static void main(String[] args) {
		int decision=0;
		String txt = "";
		String txtDelete = "";
		int i=0;

		
		do {
			System.out.println("----------------------------------------");
		 decision=Entrada.leerInt("elige 1 o 2 si quiere escribir más \n"
						+ "1. escribir \n"+"2. volver atra's");
			System.out.println("----------------------------------------");

		 if(decision ==1) {
			if(i!=0)
			txt = txt+"\n"+i+". "+txtDelete;

			txtDelete= Entrada.leerString("presione intro para dejar de escribir...");		
			i++;
			
		}else if(decision ==2) {
			System.out.println("Eliminando... :"+ txtDelete);
			System.out.println("Historial>");
			Undo historial = Undo.getInstance(txt);
			System.out.println(historial.txt);
		}
		
		}while(decision ==1 || decision ==2);		
		

	}

}


//public static void main(String[] args) {
//    System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
//            "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
//            "RESULT:" + "\n");
//    Singleton singleton = Singleton.getInstance("FOO");
//    Singleton anotherSingleton = Singleton.getInstance("BAR");
//    System.out.println(singleton.value);
//    System.out.println(anotherSingleton.value);
//}









