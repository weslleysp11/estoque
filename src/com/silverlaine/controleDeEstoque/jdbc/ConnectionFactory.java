package com.silverlaine.controleDeEstoque.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/controle_estoque", "root", "root");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
