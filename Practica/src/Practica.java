import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practica {

	public static void main(String[] args) {

		// OPERADOR TERNIARIO Y SCANNER(Crear un objeto scanner para distintos tipos de variables)
		/*
		 * double promedio; String condicionFinal;
		 * 
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("ingrese el promedio");
		 * 
		 * promedio = teclado.nextDouble(); 
		 * 			//variable condicion verdadero falso
		 * condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
		 * 
		 * System.out.println(condicionFinal);
		 */
		
		// WHILE
		/*
		 * int cont=0; 
		 * while (cont<=10) { 
		 * System.out.println(cont); 
		 * cont++; 
		 * }
		 */
		/* EJ1
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el limite");
		int limite = teclado.nextInt();
		for (int i = 1; i <= limite; i++) {
			System.out.println(i);
		}
		EJ2
		for (int i = 200; i <= 250; i+=2) {
			System.out.println(i);
		}
		EJ3
		Scanner teclado = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("ingrese palabra");
			String palabra= teclado.next();
			System.out.println("La palabra es: " + palabra);
			if (flag) {
				System.out.println("desea salir?");
				String rta = teclado.next();
				if (rta.equalsIgnoreCase("salir")) {
					flag=false;
					System.out.println("SALIMOS");
				}
			}
		} while (flag);
		EJ4
		Scanner teclado= new Scanner(System.in);
		boolean flag = false;
		int instot=0;
		int a=0,b=0,j=0,ad=0,am=0;
		
		do {
			//DATOS 
			System.out.println("ingrese nombre");
			String nombre= teclado.next();
			System.out.println("ingrese edad");
			int edad= teclado.nextInt();
			System.out.println("ingrese dni");
			int dni= teclado.nextInt();
			
			System.out.println("Para salir indique dni 0 y nombre fin\n");
			
			if (edad>=6 && edad<=10) {
				a++;
				System.out.println(nombre + " inscripto a la categoria Menores A");
			} else if (edad>=11 && edad<=17) {
				b++;
				System.out.println(nombre + " inscripto a la categoria Menores B");
			} else if (edad>=18 && edad<=30) {
				j++;
				System.out.println(nombre + " inscripto a la categoria Juveniles");
			} else if (edad>=31 && edad<=50) {
				ad++;
				System.out.println(nombre + " inscripto a la categoria Adultos");
			} else if (edad>50) {
				am++;
				System.out.println(nombre + " inscripto a la categoria Adultos Mayores");
			}
			//CONDICION PARA SALIR
			if (nombre.equalsIgnoreCase("fin") && dni==0) {
				flag= true;
			} 
		
		instot++;
		//System.err.println(instot);
		} while (!flag);
		teclado.close();
		*/
		int altura=4;
		
		for (int fila = 0; fila < altura; fila++) {
			for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
				System.out.print(" ");
			}
			for (int asteriscos = 0; asteriscos < (fila*2)+1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int largoTronco = 2;
		for (int base = 0; base < largoTronco; base++) {
			for (int espacio = 0; espacio < (altura-2); espacio++) {
				System.out.print(" ");
			}
			for (int tronco = 0; tronco < 2; tronco++) {
				System.out.print("|");
			}
			System.out.println("");
		}
		
		
	}
}
