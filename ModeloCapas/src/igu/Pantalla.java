package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// ej1
public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 340, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Copiadora");
		lblNewLabel.setBounds(128, 11, 79, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese un texto");
		lblNewLabel_1.setBounds(10, 51, 89, 14);
		panel.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 76, 86, 20);
		panel.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("El texto que ingreso es este:");
		lblNewLabel_2.setBounds(10, 120, 149, 14);
		panel.add(lblNewLabel_2);
		
		txt2 = new JTextField();
		txt2.setBounds(10, 164, 86, 20);
		panel.add(txt2);
		txt2.setColumns(10);
		
		JButton btn = new JButton("Copiar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				txt2.setText(texto);
			}
		});
		btn.setBounds(153, 86, 89, 23);
		panel.add(btn);
		
		JButton btn2 = new JButton("Limpiar");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
			}
		});
		btn2.setBounds(153, 163, 89, 23);
		panel.add(btn2);
	}
}
