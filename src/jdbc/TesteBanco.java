package jdbc;
import java.sql.Connection;
import java.sql.Statement;

public class TesteBanco {

	public static void main(String[] args) {
		
		try {
			
			Connection banco = ConnectionFactory.getConnection();
			System.out.println("Conexão OK!!!!");
			createNewTable(banco);
			//readTableTest(banco);
		}
		catch(Exception e)
		{
			System.out.println("Erro na Conexão<<>>");
			System.out.println(e);
		}

	}

	public static void createNewTable(Connection banco) {
		
		String sql1 = "CREATE TABLE IF NOT EXISTS professor (\n"
				+ "  email varchar(70) NOT NULL, \n"
				+ "  nome varchar(45) NOT NULL, \n"
				+ "  senha varchar(70) NOT NULL \n"
				+ ");";
		
		String sql2 = "CREATE TABLE IF NOT EXISTS estudante (\n"
				+ "  matricula varchar(70) NOT NULL, \n"
				+ "  nome varchar(45) NOT NULL, \n"
				+ "  idade varchar(45) NOT NULL, \n"
				+ "  faltas varchar(70) NOT NULL \n"
				+ ");";

		try {
			Statement stmt = banco.createStatement();
			
			// create new table
			stmt.execute(sql1);
			System.out.println("Tabela Professor Criada");
			
			stmt.execute(sql2);
			System.out.println("Tabela Estudante Criada");
		}
		catch(Exception e) {
			System.out.println("Erro ao criar tabela");
			System.out.println(e);
		}
		
	}

}










