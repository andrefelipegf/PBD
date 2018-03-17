package br.com.view.aluno;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAlterarDadosAluno extends JInternalFrame {
	private JTextField  textEndereco;
	private JTextField 	textEmail;
	private JTextField  textTelefone;
	
	private JButton alterarButton;
	private JButton excluirButton;
	private JButton buscarButton;
	private JTextField textNome;
	private JTextField textCpf;

	public TelaAlterarDadosAluno() {
		super("ALTERAR DADOS DO ALUNO");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		
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
		
		textCpf = new JTextField();
		GridBagConstraints gbc_textCpf = new GridBagConstraints();
		gbc_textCpf.insets = new Insets(0, 0, 5, 5);
		gbc_textCpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCpf.gridx = 2;
		gbc_textCpf.gridy = 0;
		getContentPane().add(textCpf, gbc_textCpf);
		textCpf.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		getContentPane().add(lblNome, gbc_lblNome);
		
		textNome = new JTextField();
		GridBagConstraints gbc_textNome = new GridBagConstraints();
		gbc_textNome.insets = new Insets(0, 0, 5, 5);
		gbc_textNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNome.gridx = 2;
		gbc_textNome.gridy = 1;
		getContentPane().add(textNome, gbc_textNome);
		textNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("ENDERE\u00C7O:");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 1;
		gbc_lblEndereo.gridy = 2;
		getContentPane().add(lblEndereo, gbc_lblEndereo);
		
		textEndereco = new JTextField();
		GridBagConstraints gbc_textEndereco = new GridBagConstraints();
		gbc_textEndereco.insets = new Insets(0, 0, 5, 5);
		gbc_textEndereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEndereco.gridx = 2;
		gbc_textEndereco.gridy = 2;
		getContentPane().add(textEndereco, gbc_textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 3;
		getContentPane().add(lblEmail, gbc_lblEmail);
		
		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 2;
		gbc_textEmail.gridy = 3;
		getContentPane().add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 1;
		gbc_lblTelefone.gridy = 4;
		getContentPane().add(lblTelefone, gbc_lblTelefone);
		
		textTelefone = new JTextField();
		GridBagConstraints gbc_textTelefone = new GridBagConstraints();
		gbc_textTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefone.gridx = 2;
		gbc_textTelefone.gridy = 4;
		getContentPane().add(textTelefone, gbc_textTelefone);
		textTelefone.setColumns(10);
		
		JButton alterarButton_1 = new JButton("Salvar");
		GridBagConstraints gbc_alterarButton_1 = new GridBagConstraints();
		gbc_alterarButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_alterarButton_1.gridx = 2;
		gbc_alterarButton_1.gridy = 6;
		getContentPane().add(alterarButton_1, gbc_alterarButton_1);
		alterarButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setSize(451,303);
		//ssetLocationRelativeTo(null);
		setVisible(true);
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

	public JButton getAlterarButton() {
		return alterarButton;
	}

	public void setAlterarButton(JButton alterarButton) {
		this.alterarButton = alterarButton;
	}

	public JButton getExcluirButton() {
		return excluirButton;
	}

	public void setExcluirButton(JButton excluirButton) {
		this.excluirButton = excluirButton;
	}

	public JButton getBuscarButton() {
		return buscarButton;
	}

	public void setBuscarButton(JButton buscarButton) {
		this.buscarButton = buscarButton;
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public JTextField getTextCpf() {
		return textCpf;
	}

	public void setTextCpf(JTextField textCpf) {
		this.textCpf = textCpf;
	}
}
