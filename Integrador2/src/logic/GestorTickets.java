package logic;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorTickets {
	private LinkedList<Ticket> all = new LinkedList<Ticket>();

	public GestorTickets() {
		super();

	}

	public LinkedList<Ticket> getAll() {
		return all;
	}

	public void setAll(LinkedList<Ticket> all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "GestorTickets [all=" + all + "]";
	}

	public void agregarTicket(Ticket ticket) {
		if (ticket != null) { // verificar si el objeto no es nulo
			this.all.add(ticket);
		}
	}
	// Suma los precios
	public double totPrecio(LinkedList<Ticket> todos) {
		double tot = 0;
		for (Ticket ticket : todos) {
			tot += ticket.getPrecio();
		}
		JOptionPane.showMessageDialog(null, tot);
		return tot;

	}
	// Mostrar fila seleccionada
	public void mostrarFila(int fila) {
		boolean flag=false;
		
		LinkedList<Ticket> filas = new LinkedList<Ticket>();
		for (Ticket ticket : this.all) {
			if (fila == ticket.getFila()) {
				filas.add(ticket);
				
			}
			
		}
		if (filas.isEmpty()) {
			flag=true;
		}
		if (!flag) {
			JOptionPane.showMessageDialog(null, filas);
		} else {
			JOptionPane.showMessageDialog(null, "No hay tickets en fila");
			
		}
	}

}
