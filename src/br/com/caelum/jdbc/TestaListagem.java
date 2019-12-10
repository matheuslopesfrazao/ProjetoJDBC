package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();
		
		Statement statement = connection.createStatement();
		
		boolean resultado = statement.execute("select * from Produto");
		ResultSet resultSet = statement.getResultSet();
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.println(id);
			String nome = resultSet.getString("nome");
			System.out.println(nome);
			String descricao = resultSet.getString("descricao");
			System.out.println(descricao);
			System.out.println("--------------------");
		}
		resultSet.close();
		statement.close();
		connection.close();
	}

	
}
