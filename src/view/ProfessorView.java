package view;

import javax.swing.JLabel;
import javax.swing.JTextField;

import bo.Professor;
import controller.ProfessorController;

public class ProfessorView {
	
	private String email;
	private String senha;
	private String nome;
	

	public void create(Professor professor) {
		// TODO Auto-generated method stub
		ProfessorController controller = new ProfessorController();
		
		controller.create(professor);
	}
}
