package logic;

import java.util.Random;

import javax.swing.JOptionPane;

import igu.Pantalla;

public class Main {

	public static String[] emojis = { "✨", "🎄", "🎅", "🎁" };
	public static String matriz[][] = new String[4][4];

	public static void main(String[] args) {

		Pantalla pantalla = new Pantalla();
		pantalla.setVisible(true);
		pantalla.setLocationRelativeTo(null);

	}

	public static String mostrarMatriz() {
		Random random = new Random();

		int random1 = emojis.length;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = emojis[random.nextInt(random1)];
				sb.append(matriz[i][j]).append("  ");

			}

			sb.append("\n");
		}
		return sb.toString(); // devolvemos la matriz como un String
	}

}
