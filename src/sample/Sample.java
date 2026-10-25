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
		
		//------------
		String[] asignaturas = {"ALED", "SBIO", "RCOM", "Fisio", "MNUB"};
		int[] horas = {3, 5, 2, 4};
		int totalHoras = 0;
		int maxHoras = 0;
		String asignaturaMax = "";
		for (int i = 0; i < horas.length; i++) {
			totalHoras = totalHoras + horas[i];
			if (horas[i] > maxHoras) {
				maxHoras = horas[i];
				asignaturaMax = asignaturas[i];
			}
		}

		System.out.println("Esta semana he estudiado " + totalHoras + " horas");
		System.out.println("La asignatura a la que mas tiempo he dedicado es "
				+ asignaturaMax + " con " + maxHoras + " horas");
		
		System.out.println("Esta semana no he podido hacer mucho pero viva ALED");
		

	}
	

}
