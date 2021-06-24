package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import bo.Estudante;
import model.EstudanteDAO;
import model.ProfessorDAO;

public class EstudanteController {

	public void create(Estudante estudante) {

		EstudanteDAO model = new EstudanteDAO();
		model.create(estudante);
	}

	public List<Estudante> read() {
		List<Estudante> lista = new ArrayList<Estudante>();
		
		EstudanteDAO model = new EstudanteDAO();
		lista = model.read();
		return lista;
	}

	public void update(Estudante estudante) {

		EstudanteDAO model = new EstudanteDAO();
		model.update(estudante);
		
	}

	public void delete(Estudante estudante) {
		
		EstudanteDAO model = new EstudanteDAO();
		model.delete(estudante);
	}

}
