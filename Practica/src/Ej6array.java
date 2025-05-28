import java.util.Scanner;

public class Ej6array {

	public static void main(String[] args) {
		// SHIFT ALT Y PARA AJUSTE DE LINEA

		String finish;
		int matriz[][] = new int[6][3];
		String[] ciudad = new String[5];
		String hora[] = new String[2];

		boolean flag = false;

		Scanner teclado = new Scanner(System.in);
		Scanner texto = new Scanner(System.in);
		int ncity, nhora, cant;
		// carga de asientos
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("ingre cantidad de asientos para la fila " + i + " y columna " + j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		do {
			boolean v = false;
			do {

				System.out.println(
						"ingrese el numero de destino: 0=Rio de Janeiro, 1=Cancún, 2=Madrid, 3=Roma, 4=Milán, 5=Iguazú");
				ncity = teclado.nextInt();

				System.out.println("ingrese el horario: 0=Mañana, 1=Mediodia, 2=Noche");
				nhora = teclado.nextInt();

				System.out.println("ingrese la cantidad de pasajes a comprar");
				cant = teclado.nextInt();

				if ((ncity >= 0 && ncity <= 5) && (nhora >= 0 && nhora <= 2) && (cant > 0)) {

					for (int f = 0; f < 6; f++) {
						for (int c = 0; c < 3; c++) {

							if (matriz[f][c] == matriz[ncity][nhora]) {
								if (matriz[f][c] >= cant) {
									matriz[f][c] -= cant;
									System.out.println("Su reserva fue realizada con exito");
									v = true;

								} else {
									System.out.println(
											"Disculpe, no se pudo completar su operacion dado que no hay mas asientos disponibles");
								}
							}
						}
					}

				} else {
					System.out.println("datos no validos");
				}
			} while (!v);

			System.out.println("Desea continuar reservando?. Indique finish si desea terminar la compra");
			finish = texto.next();
			if (finish.equalsIgnoreCase("finish")) {
				flag = true;
			}
		} while (!flag);
		System.out.println("El programa fue cerrado");
	}

}
