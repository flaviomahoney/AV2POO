package controller;

import bo.Professor;
import model.ProfessorDAO;

public class ProfessorController {
	
	public void create(Professor professor) {
		
		ProfessorDAO model = new ProfessorDAO();
		model.create(professor);
	}
}
