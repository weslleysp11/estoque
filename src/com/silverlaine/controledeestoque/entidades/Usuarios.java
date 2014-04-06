package com.silverlaine.controledeestoque.entidades;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Button;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 562);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(5, 0, 772, 23);
		
		JMenu mnNewMenu = new JMenu("Voltar");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Lista Usuarios");
		menuBar.add(mnNewMenu_1);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setBounds(27, 48, 60, 15);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(66, 75, 60, 15);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(66, 102, 60, 15);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(66, 141, 60, 15);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(66, 172, 60, 15);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(134, 70, 167, 23);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(134, 105, 167, 24);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(134, 141, 167, 19);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(134, 172, 167, 23);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 214, 1, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(5, 214, 787, 2);
		
		Button button = new Button("Cadastrar");
		button.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setName("Cadastrar");
		button.setBounds(465, 48, 138, 44);
		
		Button button_1 = new Button("Alterar");
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(465, 98, 138, 43);
		
		Button button_2 = new Button("Excluir");
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBounds(465, 147, 138, 40);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Usuarios");
		chckbxNewCheckBox.setBounds(132, 255, 118, 23);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Produtos");
		chckbxNewCheckBox_1.setBounds(254, 255, 118, 23);
		
		JLabel lblNewLabel_5 = new JLabel("Permissões:");
		lblNewLabel_5.setBounds(27, 233, 118, 15);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Pedidos Produtos");
		chckbxNewCheckBox_2.setBounds(398, 255, 153, 23);
		contentPane.setLayout(null);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textPane);
		contentPane.add(textPane_1);
		contentPane.add(textPane_2);
		contentPane.add(textPane_3);
		contentPane.add(separator);
		contentPane.add(separator_1);
		contentPane.add(button);
		contentPane.add(button_1);
		contentPane.add(button_2);
		contentPane.add(chckbxNewCheckBox);
		contentPane.add(chckbxNewCheckBox_1);
		contentPane.add(lblNewLabel_5);
		contentPane.add(chckbxNewCheckBox_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(5, 296, 787, 37);
		contentPane.add(separator_2);
		
		table = new JTable();
		table.setBounds(290, 314, -230, 54);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(new Rectangle(0, 0, 0, 10));
		table_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		table_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		table_1.setBounds(5, 316, 787, 217);
		contentPane.add(table_1);
	}
}
