package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bo.Professor;
import jdbc.ConnectionFactory;

public class ProfessorDAO {
	
	
	public void create(Professor professor) {
		// TODO Auto-generated method stub
		Connection banco = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = null;
		
		try {
			String sql = "insert into professor (email, nome, senha) values (?, ?, ?)";
			stmt = banco.prepareStatement(sql);
			
			stmt.setString(1, professor.getEmail());
			stmt.setString(2, professor.getNome());
			stmt.setString(3, professor.getSenha());
			
			stmt.executeUpdate();
			
			System.out.println("Professor incluido com sucesso");
		}
		catch(SQLException e) {
			System.out.println("Erro ao tentar incluir");
		}
		finally {
			
			ConnectionFactory.closeConnection(banco, stmt);
		}
	}
}
