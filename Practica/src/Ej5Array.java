import java.util.Scanner;

public class Ej5Array {

	public static void main(String[] args) {
		
		int matriz[][]= new int [4][5];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j]=5;
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
			//System.out.println("el valor de la fila " + i + ", columna "+ j + " es: "+ matriz[i][j]);
		}
	}

}
