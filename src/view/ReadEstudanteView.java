package view;

import javax.swing.*;

import bo.Estudante;

import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import java.awt.event.*;

public class ReadEstudanteView implements ActionListener {
	private JFrame janela;
    private JPanel painel;
    private JLabel list;
    private JLabel jt;
    private JButton btn1;

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	janela = new JFrame();
        painel = new JPanel();
        
        list = new JLabel("Listagem de Alunos");
        painel.setLayout(new GridBagLayout());
        janela.setTitle("Tela de Listagem");
        janela.setSize(400,350);
        janela.setLocation(300, 320);
        
        
        //Espaçando linhas
        GridBagConstraints col = new GridBagConstraints();
        col.insets = new Insets (10,10,10,10);
        col.gridx = 0;
        col.gridy = 1;
        
        painel.add(list,col);
        col.gridx=0;
        col.gridy=2;
        
        btn1 = new JButton("Mostrar alunos");
        btn1.setBounds(20,30,50,30);
        painel.add(btn1,col);
        
        col.gridx=0;
        col.gridy=3;
        

        janela.add(painel);
        btn1.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            	EstudanteView leitura = new EstudanteView();
        		List<Estudante> listaEstudantes = new ArrayList<Estudante>();
        		listaEstudantes = leitura.read();
        		int x=3;
        		for(Estudante estudante:listaEstudantes) 
        		{
        			col.gridx=0;
        			col.gridy=x;
        			x++;
        			
        			System.out.println(listaEstudantes);
        			System.out.println(estudante.getNome());
        			jt = new JLabel(" ");
        			jt.setText("Matricula : "+estudante.getMatricula()+
        					" Nome : "+estudante.getNome()+
        					" Idade : "+estudante.getIdade()+
        					" Faltas (%): " + estudante.getFaltas());
        			painel.add(jt,col);
        			painel.revalidate();
        		}
              }
            });
        janela.setVisible(true);

    }   

}
