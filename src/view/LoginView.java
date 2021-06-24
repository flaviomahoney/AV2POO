package view;

import javax.swing.*;

import bo.Estudante;
import bo.Professor;

import java.awt.*;
import java.awt.event.*;

public class LoginView implements ActionListener {
    private JFrame janela;
    private JPanel painel;

    private JLabel email;
    private JLabel senha;
    private JLabel cd;
    
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JButton btnLg;
    private JButton btncd;
    
    public LoginView() {
    	
    	janela = new JFrame();
        painel = new JPanel();
        
        email = new JLabel("Usuario: ");
        painel.add(email);
        
        txtnum1 = new JTextField(" ");
        painel.add(txtnum1);
        
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));
        
        senha = new JLabel("Senha: ");
        painel.add(senha);
        txtnum2 = new JTextField(" ");
        painel.add(txtnum2);
        
        
        
        btnLg = new JButton("Login");
        btnLg.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            		String u = txtnum1.getText().trim();
            		if( u != "admin") {
            			new HomeView();
            		} else {
            			System.out.print("Erro");
            		}
              }
            });
        painel.add(btnLg);
        
        cd = new JLabel("Se cadastrar :");
        painel.add(cd);
        btncd = new JButton("Cadastrar-se");
        btncd.addActionListener(new CreateProfessorView());
        painel.add(btncd);
        
        
        //btncd.addActionListener(new RegView());
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Login");
        janela.setSize(300,350);
        janela.setLocation(860, 320);
        janela.setVisible(true);
    }
    public static void main(String[] args) {
        new LoginView();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    }   
}