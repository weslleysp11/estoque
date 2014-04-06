package com.silverlaine.controledeestoque.entidades;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Label;
import javax.swing.UIManager;

public class Tela2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 frame = new Tela2();
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
	public Tela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(UIManager.getColor("Button.focus"));
		panel.setBounds(0, 0, 706, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 706, 21);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Produtos");
		mnNewMenu.setFont(new Font("Dialog", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Saídas de Produtos");
		mnNewMenu_1.setFont(new Font("Dialog", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Entrada de Pedidos");
		mnNewMenu_2.setFont(new Font("Dialog", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
	}
}
