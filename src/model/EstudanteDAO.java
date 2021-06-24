package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import bo.Estudante;
import bo.Professor;
import jdbc.ConnectionFactory;

public class EstudanteDAO {
	
	
	public void create(Estudante estudante) {
		Connection banco = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = null;
		
		try {
			String sql = "insert into estudante (matricula, nome, idade, faltas) values (?, ?, ?, ?)";
			stmt = banco.prepareStatement(sql);
			
			stmt.setString(1, estudante.getMatricula());
			stmt.setString(2, estudante.getNome());
			stmt.setString(3, estudante.getIdade());
			stmt.setString(4, estudante.getFaltas());
			
			
			stmt.executeUpdate();
			
			System.out.println("Estudante incluido com sucesso");
		}
		catch(SQLException e) {
			System.out.println("Erro ao tentar incluir");
		}
		finally {
			
			ConnectionFactory.closeConnection(banco, stmt);
		}
	}

	public List<Estudante> read() {
		List<Estudante> lista = new ArrayList<Estudante>();
		
		Connection banco = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = null ;
		ResultSet resultado = null ;
		
		String sql = "select matricula, nome, idade, faltas from estudante";
		
		try {
			stmt = banco.prepareStatement(sql);
			resultado = stmt.executeQuery();
			
			while(resultado.next()) {
				Estudante estudante = new Estudante();
				estudante.setMatricula(resultado.getString("Matricula"));
				estudante.setNome(resultado.getString("Nome"));
				estudante.setIdade(resultado.getString("Idade"));
				estudante.setFaltas(resultado.getString("Faltas"));
				
				lista.add(estudante);
			}
		}
		catch (SQLException e) {
			System.out.println("Erro ao tentar ler Aluno...");
		}
		finally {
			ConnectionFactory.closeConnection(banco,stmt);
		}
		return lista;
	}

	public void update(Estudante estudante) {
		
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null ; 
		try {
		String sql = " update estudante \r\n"
				+ "set nome = (?), idade = (?), faltas = (?) \r\n"
				+ "where matricula = (?)";
		stmt = banco.prepareStatement(sql);
		
		stmt.setString(1,estudante.getNome());
		stmt.setString(2,estudante.getIdade());
		stmt.setString(3,estudante.getFaltas());
		stmt.setString(4,estudante.getMatricula());
		
		stmt.executeUpdate();
		
		System.out.println("Aluno atualizado com sucesso !!!");
		
		}
		
		catch(SQLException e) {
			System.out.println("Erro ao atualizar o aluno");
		}
		
	}

	public void delete(Estudante estudante) {
		
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null ; 
		try {
			String sql = "delete from estudante where matricula = (?)";
			
			stmt = banco.prepareStatement(sql);
			stmt.setString(1, estudante.getMatricula());
			stmt.executeUpdate();
			
			System.out.println("Estudante deletado com sucesso !!!");
			
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao deletar aluno");
		}
	}
	
}
