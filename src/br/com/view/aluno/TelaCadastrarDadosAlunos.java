package br.com.view.aluno;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.control.CadastrarAluno.ControleCadastrarAluno;

public class TelaCadastrarDadosAlunos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField cpf;
	private JTextField nome;
	private JTextField endereco;
	private JTextField email;
	private JTextField telefone;
	private JTextField senha;

	private JButton salvarButton;
	
	ControleCadastrarAluno c;

	public TelaCadastrarDadosAlunos() {
		super("CADASTRAR DADOS DO ALUNO");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("CPF:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		cpf = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		getContentPane().add(cpf, gbc_textField);
		cpf.setColumns(15);


		JLabel lblNome = new JLabel("NOME:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		getContentPane().add(lblNome, gbc_lblNome);

		nome = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		getContentPane().add(nome, gbc_textField_1);
		nome.setColumns(10);

		JLabel lblEndereo = new JLabel("ENDERE\u00C7O:");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 1;
		gbc_lblEndereo.gridy = 2;
		getContentPane().add(lblEndereo, gbc_lblEndereo);

		endereco = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 2;
		getContentPane().add(endereco, gbc_textField_2);
		endereco.setColumns(10);

		JLabel lblEmail = new JLabel("EMAIL:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 3;
		getContentPane().add(lblEmail, gbc_lblEmail);

		email = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 3;
		getContentPane().add(email, gbc_textField_3);
		email.setColumns(10);

		JLabel lblTelefone = new JLabel("TELEFONE:");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 1;
		gbc_lblTelefone.gridy = 4;
		getContentPane().add(lblTelefone, gbc_lblTelefone);

		telefone = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 4;
		getContentPane().add(telefone, gbc_textField_4);
		telefone.setColumns(10);

		JLabel lblSenha = new JLabel("SENHA:");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenha.anchor = GridBagConstraints.EAST;
		gbc_lblSenha.gridx = 1;
		gbc_lblSenha.gridy = 5;
		getContentPane().add(lblSenha, gbc_lblSenha);

		senha= new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 5;
		getContentPane().add(senha, gbc_textField_5);
		senha.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 6;
		getContentPane().add(panel, gbc_panel);

		salvarButton = new JButton("Salvar");
		GridBagConstraints gbc_s = new GridBagConstraints();
		gbc_s.insets = new Insets(0, 0, 5, 5);
		gbc_s.fill = GridBagConstraints.BOTH;
		gbc_s.gridx = 2;
		gbc_s.gridy = 7;
		getContentPane().add(salvarButton, gbc_s);
		
		c = new ControleCadastrarAluno(this);
		salvarButton.addActionListener(c);
		
		setSize(451,303);
	}


	public JTextField getCpf() {
		return cpf;
	}


	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}


	public JTextField getNome() {
		return nome;
	}


	public void setNome(JTextField nome) {
		this.nome = nome;
	}


	public JTextField getEndereco() {
		return endereco;
	}


	public void setEndereco(JTextField endereco) {
		this.endereco = endereco;
	}


	public JTextField getEmail() {
		return email;
	}


	public void setEmail(JTextField email) {
		this.email = email;
	}


	public JTextField getTelefone() {
		return telefone;
	}


	public void setTelefone(JTextField telefone) {
		this.telefone = telefone;
	}


	public JButton getSalvarButton() {
		return salvarButton;
	}


	public void setSalvarButton(JButton salvarButton) {
		this.salvarButton = salvarButton;
	}

	public JTextField getSenha() {
		return senha;
	}

	public void setSenha(JTextField senha) {
		this.senha = senha;
	}


}
