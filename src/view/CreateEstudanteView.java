package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bo.Estudante;
import bo.Professor;

public class CreateEstudanteView implements ActionListener {
	private JFrame janela; 
    private JPanel painel;
    private JLabel nome;
	private JLabel idade;
	private JLabel faltas;
	private JLabel matricula;

    private JTextField txtnum1;
    private JTextField txtnum2;
    private JTextField txtnum3;
    private JTextField txtnum4;
 
    private JLabel resultado;
    private JButton btnCd;
    
	@Override
    public void actionPerformed(ActionEvent e) {
		
    	janela = new JFrame();
        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));
        
        matricula= new JLabel("Insira a matricula do aluno: ");
        painel.add(matricula);
        txtnum1 = new JTextField(" ");
        painel.add(txtnum1);
        
        nome = new JLabel("Insira o Nome: ");
        painel.add(nome);
        txtnum2 = new JTextField(" ");
        painel.add(txtnum2);
        
        idade= new JLabel("Insira a Idade do Aluno: ");
        painel.add(idade);
        txtnum3 = new JTextField(" ");
        painel.add(txtnum3);
        
        faltas= new JLabel("Insira a porcentagem de faltas: ");
        painel.add(faltas);
        txtnum4 = new JTextField(" ");
        painel.add(txtnum4);

        
        btnCd = new JButton("Finalizar");
        btnCd.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            	
            		Estudante estudante = new Estudante();
            		EstudanteView view = new EstudanteView();
            		
            		estudante.setMatricula(txtnum1.getText().trim());
            		estudante.setNome(txtnum2.getText().trim());
            		estudante.setIdade(txtnum3.getText().trim());
            		estudante.setFaltas(txtnum4.getText().trim());
            		
            		
            		view.create(estudante);
              }
            });

        painel.add(btnCd);
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Criar Estudante");
        janela.setSize(300,400);
        janela.setLocation(940, 620);
        janela.setVisible(true);
    }   
}