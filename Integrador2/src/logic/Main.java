package logic;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String matriz [][] = new String [10][10];
		
		cargaMapa(matriz);
		
		reservaAsientos(matriz);
		
		
		
	}

	private static void cargaMapa(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]="L";
				//System.out.print(matriz[i][j] + "  ");
			}
			//System.out.print("\n");
		}
	}
	private static void mostrarMapa(String matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(i+" ");
			for (int j = 0; j < matriz[i].length; j++) {
				//matriz[i][j]="L";
				
				System.out.print("["+matriz[i][j]+"]" + "  ");
			}
			System.out.print("\n");
		}
	}
	
	private static void reservaAsientos(String matriz[][]) {
		boolean flag =false;
		do {
			limpiarConsola();
			mostrarMapa(matriz);
			int f = Integer.parseInt(JOptionPane.showInputDialog("Indique fila"));
			int c= Integer.parseInt(JOptionPane.showInputDialog("Indique columna"));
			
			if ((f >=0 && f<10) && (c>=0 && c<10) ) {
				if (matriz[f][c].equalsIgnoreCase("L")) {
					matriz[f][c]= "X";
					
					JOptionPane.showMessageDialog(null, "Se reservo correctamente el asiento");
					limpiarConsola();
					mostrarMapa(matriz);
				} else {
					JOptionPane.showMessageDialog(null, "Se encuentra reservado");
				}
			} else {
				JOptionPane.showMessageDialog(null, "no existe esa f/c");
			}
			
			String r = JOptionPane.showInputDialog("Desea cargar otro boleto? Y/N");
			flag = r.equalsIgnoreCase("Y") ? false : true;
			
		} while (!flag);
		
		
	}
	private static void limpiarConsola() {
        for (int i = 0; i < 35; ++i) System.out.println(); 
    }
}
