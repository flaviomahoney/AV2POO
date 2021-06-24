package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import bo.Estudante;
import controller.EstudanteController;
import controller.ProfessorController;

public class EstudanteView {
	private String nome;
	private String idade;
	private String faltas;
	private String matricula;
	

	public void create(Estudante estudante) {

		EstudanteController controller = new EstudanteController();
		
		controller.create(estudante);
	}


	public List<Estudante> read() {
		List<Estudante> Lista = new ArrayList<Estudante>();
		try {
			EstudanteController controller = new EstudanteController();
			Lista = controller.read();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return Lista;
	}


	public void update(Estudante estudante) {
		EstudanteController controller = new EstudanteController();
		
		controller.update(estudante);
	}


	public void delete(Estudante estudante) {
		EstudanteController controller = new EstudanteController();
		
		controller.delete(estudante);
	}
	
	
}
