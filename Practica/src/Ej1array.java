import java.util.Scanner;

public class Ej1array {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int array[]= new int[15];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("cargue el numero " + (i+1));
			array[i]=teclado.nextInt();
			if (array[i]==3) {
				cont++;
			}
		}
		System.out.println("el numero 3 se cargo: " + cont + " veces");
	}

}
