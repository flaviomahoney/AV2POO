package view;

import javax.swing.*;

import bo.Estudante;

import java.awt.*;
import java.awt.event.*;

public class DeleteEstudanteView implements ActionListener {
	
    private JFrame janela;
    private JPanel painel;
     private JLabel estudante;
     private JTextField txtnum1;
     private JButton btnDel;
     private JLabel resultado;
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	janela = new JFrame();
        painel = new JPanel();
        
 
        estudante = new JLabel("Qual a matricula do aluno a se excluir?");
        painel.add(estudante);
        txtnum1 = new JTextField(" ");
        painel.add(txtnum1);
        
        
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));
        btnDel = new JButton("Deletar");
        resultado = new JLabel(" ");
        
   
        btnDel.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            	Estudante estudante = new Estudante();
        		EstudanteView view = new EstudanteView();
        		
        		estudante.setMatricula(txtnum1.getText().trim());
        		
        		view.delete(estudante);
              }
            });
 
        painel.add(btnDel);
        painel.add(resultado);
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Tela de Delete");
        janela.setSize(300,300);
        janela.setLocation(840, 220);
        janela.pack();
        janela.setVisible(true);
    }   
}
