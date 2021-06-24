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

import bo.Professor;

public class CreateProfessorView implements ActionListener {
	private JFrame janela; 
    private JPanel painel;
    private JLabel nome;
    private JLabel email;
    private JLabel senha;

    private JTextField txtnum1;
    private JTextField txtnum2;
    private JTextField txtnum3;
 
    private JLabel resultado;
    private JButton btnCd;
    
	@Override
    public void actionPerformed(ActionEvent e) {
		
    	janela = new JFrame();
        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));
        
        nome = new JLabel("Insira o Nome: ");
        painel.add(nome);
        txtnum1 = new JTextField(" ");
        painel.add(txtnum1);
        
        email= new JLabel("Insira o Email: ");
        painel.add(email);
        txtnum2 = new JTextField(" ");
        painel.add(txtnum2);
        
        senha= new JLabel("Insira a Senha: ");
        painel.add(senha);
        txtnum3 = new JTextField(" ");
        painel.add(txtnum3);

        
        btnCd = new JButton("Finalizar");
        btnCd.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            	
            		Professor professor = new Professor();
            		ProfessorView view = new ProfessorView();
            		
            		professor.setNome(txtnum1.getText().trim());
            		professor.setEmail(txtnum2.getText().trim());
            		professor.setSenha(txtnum3.getText().trim());
            		
            		view.create(professor);
              }
            });

        painel.add(btnCd);
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Atualizar Dados");
        janela.setSize(300,400);
        janela.setLocation(940, 620);
        janela.setVisible(true);
    }   
}