package com.silverlaine.controledeestoque.entidades;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class panel1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel1 frame = new panel1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public panel1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setBounds(0, -23, 631, 369);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(161, 5, 60, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(226, 5, 60, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Login:");
		lblNewLabel_2.setBounds(145, 103, 101, 42);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Senha:");
		lblNewLabel_3.setBounds(144, 157, 114, 39);
		panel.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(264, 177, 144, 25);
		panel.add(passwordField);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(264, 119, 144, 21);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(264, 239, 106, 25);
		panel.add(btnNewButton);
	}
}
