import java.util.Scanner;

public class Ej4array {

	public static void main(String[] args) {
		
		Scanner ciudades = new Scanner(System.in);
		Scanner temperaturas = new Scanner(System.in);
		
		String ciudad [] = new String [5];
		double tmax[]= new double [5];
		double tmin[]= new double [5];
		double tmaxima= 0;
		double tminima= 100;
		String cmax = null,cmin = null;
		// carga
		for (int incity = 0; incity < ciudad.length; incity++) {
			System.out.println("Ingrese ciudad " + (incity+1));
			ciudad[incity]= ciudades.next();
			System.out.println("Ingrese Temperatura maxima " + (incity+1));
			tmax[incity]= temperaturas.nextDouble();
			System.out.println("Ingrese Temperatura minima " + (incity+1));
			tmin[incity]= temperaturas.nextDouble();
			
			if (tmax[incity]>tmaxima) {
				tmaxima=tmax[incity];
			}
			if (tmin[incity]<tminima) {
				tminima=tmin[incity];
			}
		}
		// ciudades temp max y min
		for (int i = 0; i < tmin.length; i++) {
			if (tmaxima==tmax[i]) {
				cmax=ciudad[i]; // tambien se puede guardas las posiciones y luego llamar array con ese valor
			}  
			if (tminima==tmin[i]) {
			cmin=ciudad[i];
			}
		}
		System.out.println("La ciudad con la temperatura maxima es: " + cmax + " con: " + tmaxima + " grados");
		System.out.println("La ciudad con la temperatura minima es: " + cmin + " con: " + tminima + " grados");
		ciudades.close();
		temperaturas.close();
	}
	
}
