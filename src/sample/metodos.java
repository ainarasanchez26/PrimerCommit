package sample;

public class metodos {
	public static double calculaPi(double precision) {
		int n=0;
		double suma=0.0; 
		double an=0.0;
		do {
			an=Math.pow(-1.0, n)*1.0/(2.0*n+1.0);
			suma+=an;
			n++;
		} while(Math.abs(an)>precision);
		
		return 4.0*suma;
	}
	
	public static long calcularFactorial(int numero) {
	    long factorial = 1;
	    for (int i = 1; i <= numero; i++) {
	        factorial = factorial * i;
	    }
	    return factorial;
	}

}
