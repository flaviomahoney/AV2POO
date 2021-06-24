package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeView implements ActionListener {
    private JFrame janela;
    private JPanel painel;

    private JLabel email;
    private JLabel senha;
    private JLabel cd;
    
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JButton btncAluno;
    private JButton btnuAluno;
    private JButton btndAluno;
    private JButton btnrAluno;
    
    public HomeView() {
    	

    	janela = new JFrame();
        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));
        
        
        btncAluno = new JButton("Registrar Aluno");
        btncAluno.addActionListener(new CreateEstudanteView());
        painel.add(btncAluno);
        

        btndAluno = new JButton("Deletar Aluno em Aluno");
        btndAluno.addActionListener(new DeleteEstudanteView());
        painel.add(btndAluno);
       
        btnrAluno = new JButton("Ver todos os Alunos");
        btnrAluno.addActionListener(new ReadEstudanteView());
        painel.add(btnrAluno);
        
        btnuAluno = new JButton("Update em Aluno");
        btnuAluno.addActionListener(new UpdateEstudanteView());
        painel.add(btnuAluno);
        		
        
        //btncd.addActionListener(new RegView());
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Menu");
        janela.setSize(300,350);
        janela.setLocation(860, 320);
        janela.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    }   
}