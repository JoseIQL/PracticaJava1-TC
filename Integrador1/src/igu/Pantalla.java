package igu;

import java.awt.EventQueue;
import logic.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtNacimiento;
	private JTextField txtindice;
	
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Pantalla() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 681, 459);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agenda Electrónica");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(267, 37, 156, 22);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 87, 621, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(53, 127, 69, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(53, 188, 69, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(53, 240, 69, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dirección");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(377, 127, 82, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(377, 188, 82, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("F. Nacimiento");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(378, 244, 116, 14);
		panel.add(lblNewLabel_6);
		
		txtDni = new JTextField();
		txtDni.setBounds(148, 127, 86, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(148, 188, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(148, 244, 86, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(519, 127, 86, 20);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(519, 188, 86, 20);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setBounds(519, 244, 86, 20);
		panel.add(txtNacimiento);
		txtNacimiento.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 312, 621, 2);
		panel.add(separator_1);
		
		JButton btnNewButton = new JButton("Grabar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					Main.dni[Main.i]=txtDni.getText();
					Main.nombre[Main.i]=txtNombre.getText();
					Main.apellido[Main.i]=txtApellido.getText();
					Main.direccion[Main.i]=txtDireccion.getText();
					Main.telefono[Main.i]=txtTelefono.getText();
					Main.nacimiento[Main.i]=txtNacimiento.getText();
			}
		});
		btnNewButton.setBounds(275, 345, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Main.i < 8) { // 8 para que el indice nunca supere la cantidad de espacios del array que es [9], osea 8
					Main.i++; 
					cargarDatosEnCampos();
				}
				
			}
		});
		btnNewButton_1.setBounds(405, 345, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<<");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Main.i > 0) {
					Main.i--;
					cargarDatosEnCampos();
				}
			}
		});
		btnNewButton_2.setBounds(145, 345, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("Indice: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(148, 398, 86, 14);
		panel.add(lblNewLabel_7);
		
		
		txtindice = new JTextField();
		txtindice.setBounds(278, 398, 86, 20);
		panel.add(txtindice);
		txtindice.setColumns(10);
		txtindice.setEditable(false);
		
		cargarDatosEnCampos(); // iniciamos con esta funcion y empiece en 0(valor del incrementador)
		
	}
	private void cargarDatosEnCampos() {
		
		if (Main.i >= 0 && Main.i < Main.nombre.length) {
			
			txtDni.setText(Main.dni[Main.i] != null ? Main.dni[Main.i] : "");
			txtNombre.setText(Main.nombre[Main.i] != null ? Main.nombre[Main.i] : "");
			txtApellido.setText(Main.apellido[Main.i] != null ? Main.apellido[Main.i] : "");
			txtDireccion.setText(Main.direccion[Main.i] != null ? Main.direccion[Main.i] : "");
			txtTelefono.setText(Main.telefono[Main.i] != null ? Main.telefono[Main.i] : "");
			txtNacimiento.setText(Main.nacimiento[Main.i] != null ? Main.nacimiento[Main.i] : "");
		}
		
		txtindice.setText(String.valueOf(Main.i));
	}
}
