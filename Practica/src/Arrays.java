//int altura= 4;
//for (int filas = 0; filas < altura; filas++) {
//	for (int espacios = 0; espacios < altura-filas-1; espacios++) {
//		System.out.print(" ");
//	}
//	for (int estrellas = 0; estrellas < (filas*2)+1; estrellas++) {
//		System.out.print("$");
//	}
//	System.out.println();
//}
//int largoTronco=2;
//for (int filas = 0; filas < largoTronco; filas++) {
//	for (int espacios = 0; espacios < altura-2; espacios++) {
//		System.out.print(" ");
//	}
//	for (int tronco = 0; tronco < largoTronco; tronco++) {
//		System.out.print("|");
//	}
//	System.out.println("");
//}
import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * int a[]=new int [4];
		 * 
		 * for (int i = 0; i < a.length; i++) { 
		 * System.out.println("indique valores");
		 * a[i]= teclado.nextInt(); }
		 * 
		 * for (int i = 0; i < a.length; i++) { 
		 * System.out.println("indice" + i);
		 * System.out.println("contenido" + a[i]); 
		 * System.out.println("--"); }
		 * 
		 * DECLARAR MATRIZ Y ASIGNACION MANUAL
		 */
		
		  int matriz[][]= new int [3][3]; //matriz[0][0]=5;
		  
		  for (int f = 0; f < 3; f++) { 
			  for (int c = 0; c < 3; c++) {
		  System.out.println("ingrese el valor de la posicion f:" + f + " c: " + c);
		  
		  matriz[f][c]= teclado.nextInt();
		  System.out.println("El valor de la posicion f: " + f + " c: " + c);
		  System.out.println("es de: "+ matriz[f][c]); } }
		 
	}

}
