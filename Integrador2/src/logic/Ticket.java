package logic;

import java.time.LocalDate;
import java.util.LinkedList;

public class Ticket {

	private int numero;
	private int fila;
	private int asiento;
	private LocalDate fechaCompra;
	private LocalDate fechaValidez;
	private double precio;
	private Cliente cliente;

	public Ticket(int numero, int fila, int asiento, double precio,
			Cliente cliente) {
		super();
		this.numero = numero;
		this.fila = fila;
		this.asiento = asiento;
		this.fechaCompra = LocalDate.now();
		this.fechaValidez = this.fechaCompra.plusDays(2);
		this.precio = precio;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public LocalDate getFechaValidez() {
		return fechaValidez;
	}

	public void setFechaValidez(LocalDate fechaValidez) {
		this.fechaValidez = fechaValidez;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", fechaCompra=" + fechaCompra
				+ ", fechaValidez=" + fechaValidez + ", precio=" + precio + ", cliente=" + cliente + "]" + "\n";
	}

}
