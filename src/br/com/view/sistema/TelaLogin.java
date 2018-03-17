package br.com.view.sistema;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.control.sistema.TelaLoginController;

public class TelaLogin  extends JFrame{

	private JTextField cpfField;
	private JPasswordField txtsenha;
	private JButton loginButton;
	private TelaLoginController tlc;public TelaLogin() {
		super ("Login");
		
		
		
		
		
		tlc= new TelaLoginController(this);
		
		
		
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		
		
		JLabel lblcpf = new JLabel("CPF");
		add(lblcpf);
		
		this.cpfField=  new JTextField();
		getContentPane().add(this.cpfField);
		this.cpfField.setColumns(10);
		
		JLabel lblsenha = new JLabel("SENHA");
		add(lblsenha);
		
		this.txtsenha = new JPasswordField();
		getContentPane().add(this.txtsenha);
		this.txtsenha.setColumns(10);
		
		this.loginButton = new JButton("Logar");
		getContentPane().add(this.loginButton);
		loginButton.addActionListener(tlc);
		
		setVisible(true);
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JPasswordField getTxtsenha() {
		return txtsenha;
	}

	public JButton getLoginButton() {
		return loginButton;
	}
	
	
}
