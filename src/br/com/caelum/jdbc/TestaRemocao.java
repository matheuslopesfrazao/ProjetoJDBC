package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();
		Statement statement = connection.createStatement();
		statement.execute("delete from produto where id>3");
		int count = statement.getUpdateCount();
		System.out.println(count+ " linhas atualizadas");
		
		connection.close();
	}
	
}
