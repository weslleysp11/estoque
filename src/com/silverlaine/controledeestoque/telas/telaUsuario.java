package com.silverlaine.controledeestoque.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class telaUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaUsuario frame = new telaUsuario();
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
	public telaUsuario() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(UIManager.getColor("Button.focus"));
		panel.setBounds(0, 0, 589, 388);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Produtos");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledText"));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBounds(211, 192, 184, 68);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pedidos");
		btnNewButton_1.setBounds(211, 283, 184, 68);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Usuário");
		btnNewButton_2.setBounds(211, 94, 177, 68);
		panel.add(btnNewButton_2);
		
		JLabel lblAdm = new JLabel("Adm:");
		lblAdm.setBounds(36, 37, 114, 50);
		panel.add(lblAdm);
	}
}
