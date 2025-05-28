import java.util.Scanner;

public class Ej3array {

	public static void main(String[] args) {
		
		String vector[]= new String [8];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese los nombres");
			vector[i]= teclado.next();
		}
		System.out.println("Los nombres son: ");
		for (int i = 0; i < vector.length; i++) {
			
			System.out.println(vector[i]);
		}
		teclado.close(); // cerramos scanner
	}

}
