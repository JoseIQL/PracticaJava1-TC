package igu;

import java.awt.EventQueue;
import logic.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCant;
	private JTextField txtTot;
	private JTextField txtFinal;
	private JTextArea txtMatriz;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Desafio navideño");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(416, 11, 179, 22);
		contentPane.add(lblNewLabel);

		JTextArea txtMatriz = new JTextArea();
		txtMatriz.setFont(new Font("Monospaced", Font.ITALIC, 25));
		txtMatriz.setBounds(186, 298, 645, 227);
		contentPane.add(txtMatriz);
		txtMatriz.setEditable(false);

		JButton btngift = new JButton("");
		btngift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// regalo
				String emoji = "🎁";
				txtMatriz.setText(Main.mostrarMatriz());
				buscar(emoji);
			}
		});
		btngift.setIcon(new ImageIcon(Pantalla.class.getResource("/img/caja-de-regalo.png")));
		btngift.setBounds(714, 124, 117, 133);
		contentPane.add(btngift);

		JButton btnTree = new JButton("");
		btnTree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// arbol
				String emoji = "🎄";
				txtMatriz.setText(Main.mostrarMatriz());
				buscar(emoji);
			}
		});
		btnTree.setIcon(new ImageIcon(Pantalla.class.getResource("/img/arbol-de-navidad.png")));
		btnTree.setBounds(355, 124, 117, 133);
		contentPane.add(btnTree);

		JButton btnSanta = new JButton("");
		btnSanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Santa
				String emoji = "🎅";
				txtMatriz.setText(Main.mostrarMatriz());
				buscar(emoji);
			}
		});
		btnSanta.setIcon(new ImageIcon(Pantalla.class.getResource("/img/papa-noel.png")));
		btnSanta.setBounds(534, 124, 117, 133);
		contentPane.add(btnSanta);

		JButton btnStar = new JButton("");
		btnStar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// estrella
				String emoji = "✨";
				txtMatriz.setText(Main.mostrarMatriz());
				buscar(emoji);

			}
		});

		btnStar.setIcon(new ImageIcon(Pantalla.class.getResource("/img/estrella.png")));
		btnStar.setBounds(186, 124, 117, 133);
		contentPane.add(btnStar);

		JLabel lblNewLabel_1 = new JLabel("Elija un emoji");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(186, 58, 135, 22);
		contentPane.add(lblNewLabel_1);

		txtCant = new JTextField();
		txtCant.setBounds(355, 93, 86, 20);
		contentPane.add(txtCant);
		txtCant.setColumns(10);
		txtCant.setText(txtCant.getText());

		JLabel lblNewLabel_2 = new JLabel("Indique cantidad 0-16: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(186, 91, 168, 22);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Cantidad Final\r\n:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(186, 572, 117, 22);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Acertó: ");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(186, 617, 135, 22);
		contentPane.add(lblNewLabel_2_2);

		txtTot = new JTextField();
		txtTot.setBounds(313, 572, 86, 20);
		contentPane.add(txtTot);
		txtTot.setColumns(10);
		txtTot.setEditable(false);

		txtFinal = new JTextField();
		txtFinal.setBounds(313, 617, 86, 20);
		contentPane.add(txtFinal);
		txtFinal.setColumns(10);
		txtFinal.setEditable(false);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCant.setText("");
				txtTot.setText("");
				txtFinal.setText("");
				txtMatriz.setText("");
			}
		});
		btnReset.setBounds(714, 574, 89, 23);
		contentPane.add(btnReset);

	}

	public void buscar(String e) {

		int numero = Integer.parseInt(txtCant.getText()); // Cantidad de veces que cree del emoji
		int contador = 0;
		if (numero >= 0 && numero <= 16) {
			for (int i = 0; i < Main.matriz.length; i++) {
				for (int j = 0; j < Main.matriz[i].length; j++) {
					if (Main.matriz[i][j].equals(e)) {
						contador++;
					}
				}
			}
			txtTot.setText(String.valueOf(contador));
			if (numero == contador) {
				txtFinal.setText("Si");
			} else {
				txtFinal.setText("No");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Ingrese un numero valido de 0-16");
		}
	}

}
