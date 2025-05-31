package logic;

import java.awt.List;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Parte2 {

	public static void main(String[] args) {

		GestorTickets uno = new GestorTickets();
		Cliente cliente = new Cliente(1,"40389608","José","Quisbert" );
		
		//creamos y agregamos ticket a la lista
		Ticket nuevo = new Ticket(1, 2, 3, 50.0,cliente);
		Ticket nuevo2 = new Ticket(2, 2, 3, 50.0,cliente);
		Ticket nuevo3= new Ticket(3, 5, 3, 60.0,cliente);
		Ticket nuevo4= new Ticket(4, 5, 3, 70.0,cliente);
		uno.agregarTicket(nuevo);
		uno.agregarTicket(nuevo2);
		uno.agregarTicket(nuevo3);
		uno.agregarTicket(nuevo4);
		
		// Creamos un lista y sumamos los precios
		LinkedList<Ticket>todos = uno.getAll();
		uno.totPrecio(todos);
		
		// Solicitamos el numero de fila y muestra los tickets pertenecientes a esa fila
		int num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de fila"));
		uno.mostrarFila(num);
		
//		int numero = 2;
//		Ticket encontrado = null;
//		LinkedList<Ticket>todos = uno.getAll();
//		
//		for (Ticket ticket : todos) {
//			if (ticket.getNumero()==numero) {
//				encontrado = ticket;
//				break;
//			}
//		}
//		
//		if (encontrado !=null) {
//			JOptionPane.showMessageDialog(null, encontrado);
//		}
		
	}
	
}
