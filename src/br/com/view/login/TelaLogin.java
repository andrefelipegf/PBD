package br.com.view.login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.control.login.TelaLoginController;

public class TelaLogin  extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField cpfField;
	private JPasswordField txtsenha;
	private JButton loginButton;
	private TelaLoginController tlc;
	
	public TelaLogin() {
		super ("Login");

		tlc= new TelaLoginController(this);
		
		setSize(300, 193);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblcpf = new JLabel("CPF");
		lblcpf.setBounds(10, 8, 45, 14);
		getContentPane().add(lblcpf);
		
		this.cpfField=  new JTextField();
		cpfField.setBounds(102, 5, 121, 20);
		getContentPane().add(this.cpfField);
		this.cpfField.setColumns(10);
		
		JLabel lblsenha = new JLabel("SENHA");
		lblsenha.setBounds(10, 43, 59, 14);
		getContentPane().add(lblsenha);
		
		this.txtsenha = new JPasswordField();
		txtsenha.setBounds(102, 40, 86, 20);
		getContentPane().add(this.txtsenha);
		this.txtsenha.setColumns(10);
		
		this.loginButton = new JButton("Logar");
		loginButton.setBounds(82, 120, 95, 23);
		getContentPane().add(this.loginButton);
		loginButton.addActionListener(tlc);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public TelaLoginController getTlc() {
		return tlc;
	}

	public void setTlc(TelaLoginController tlc) {
		this.tlc = tlc;
	}

	public void setCpfField(JTextField cpfField) {
		this.cpfField = cpfField;
	}

	public void setTxtsenha(JPasswordField txtsenha) {
		this.txtsenha = txtsenha;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
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
