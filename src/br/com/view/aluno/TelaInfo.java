package br.com.view.aluno;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaInfo   extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField textCpf;
	private JTextField textNome;
	private JTextField textEndereco;
	private JTextField textEmail;
	private JTextField textTelefone;
	public TelaInfo() {
		setTitle("Informa\u00E7\u00F5es  Pessoais");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CPF:");
		label.setBounds(45, 11, 23, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("NOME:");
		label_1.setBounds(35, 36, 33, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("ENDERE\u00C7O:");
		label_2.setBounds(10, 61, 58, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("EMAIL:");
		label_3.setBounds(34, 86, 34, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("TELEFONE:");
		label_4.setBounds(14, 111, 54, 14);
		getContentPane().add(label_4);
		
		textCpf = new JTextField();
		textCpf.setBounds(92, 8, 86, 20);
		getContentPane().add(textCpf);
		textCpf.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(92, 33, 86, 20);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(92, 58, 86, 20);
		getContentPane().add(textEndereco);
		textEndereco.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(92, 83, 86, 20);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(92, 108, 86, 20);
		getContentPane().add(textTelefone);
		textTelefone.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmLogar_1 = new JMenuItem("Logout");
		mnSistema.add(mntmLogar_1);
		
		JMenuItem mntmLogar = new JMenuItem("Sair");
		mnSistema.add(mntmLogar);
	}
	public JTextField getTextCpf() {
		return textCpf;
	}
	public void setTextCpf(JTextField textCpf) {
		this.textCpf = textCpf;
	}
	public JTextField getTextNome() {
		return textNome;
	}
	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}
	public JTextField getTextEndereco() {
		return textEndereco;
	}
	public void setTextEndereco(JTextField textEndereco) {
		this.textEndereco = textEndereco;
	}
	public JTextField getTextEmail() {
		return textEmail;
	}
	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}
	public JTextField getTextTelefone() {
		return textTelefone;
	}
	public void setTextTelefone(JTextField textTelefone) {
		this.textTelefone = textTelefone;
	}
}
