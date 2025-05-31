package logic;

import java.util.LinkedList;

public class Cliente {

	private int id;
	private String dni;
	private String nombre;
	private String apellido;
	private LinkedList<Ticket> my= new LinkedList<Ticket>();

	public Cliente(int id, String dni, String nombre, String apellido) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido  
				+ "]";
	}

}
