package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();
		System.out.println("Abrindo uma conex�o com sucesso");
		connection.close();
	}

}
