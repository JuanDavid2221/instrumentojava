package Nombreciudad;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Nota {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nota window = new Nota();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(57, 152, 198));
		frame.setBounds(100, 100, 782, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Ocultar Nombre");
		btnNewButton.setBounds(28, 176, 150, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(false);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO MIGUEL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(288, 11, 242, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(86, 64, 92, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(192, 69, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ciudad:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(509, 64, 92, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(606, 69, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnVisualizarNombre = new JButton("Visualizar Nombre");
		btnVisualizarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(true);
			}
		});
		btnVisualizarNombre.setBounds(228, 176, 150, 34);
		frame.getContentPane().add(btnVisualizarNombre);
		
		JButton btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.addActionListener(new ActionListener() {
			pubsic void actionPerformed(ActionEvent e) {
				textField_1.setVisible(false);
			}
		});
		btnOcultarCiudad.setBounds(428, 176, 150, 34);
		frame.getContentPane().add(btnOcultarCiudad);
		
		JButton btnVisualizarCiudad = new JButton("Visualizar Ciudad");
		btnVisualizarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setVisible(true);
			}
		});
		btnVisualizarCiudad.setBounds(606, 176, 150, 34);
		frame.getContentPane().add(btnVisualizarCiudad);
	}
}
