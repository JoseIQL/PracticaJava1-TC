import java.util.Scanner;

public class Ej2array {

	public static void main(String[] args) {

		double matriz[][] = new double[4][4];
		double tot = 0; 
		
		//boolean flag = false;
		Scanner teclado = new Scanner(System.in);

		for (int f = 0; f < 4; f++) {
			// Cargamos notas
			for (int c = 0; c < 3; c++) {
				System.out.println("Ingrese la nota " + (c+1) + " del alumno " + (f+1));
				matriz[f][c] = teclado.nextDouble();
				tot += matriz[f][c];
			}
			matriz[f][3]=tot/3;
			//System.out.println("el promedio del alumno " + (f+1) +" es de: " + matriz[f][3]);
			tot=0;
		}
		// Recorremos la matriz
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("La nota " + (j+1) + " es de: " + matriz[i][j]);
				
			}
			System.out.println("el promedio del alumno " + (i+1) +" es de: " + matriz[i][3]);
		}
	}

}
