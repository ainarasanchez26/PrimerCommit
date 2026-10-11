package sample;

public class Sample {
	public static void main (String [] args) {
		System.out.println("Ejercicio de clonación completado");
		//-------------------
		//Semana tres: 
		System.out.println("Estado de supervivencia de mi semana");
		for(int dia=1 ; dia<=7 ; dia++)
			System.out.println("Día " + dia + ": sigo vivo");
		System.out.println("He sobrevivido a la semana!");
		//-----------
		double ahorro = 20;
		for (int semana = 1; semana <= 5; semana++) {
			ahorro = ahorro + 10;
			System.out.println("Semana " + semana + ": " + ahorro + " euros");
		}
		if (ahorro >= 50) {
			System.out.println("Ya puedo comprarme algo :)");
		}
	}
	

}
