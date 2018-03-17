package br.com.view.aluno;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.control.alterarcadastroAluno.ControleRedefinirSenha;
import br.com.model.vo.Aluno;

public class TelaRedefinicaoSenha extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField 	cpf;
	private JTextField  novasenha;
	
	private JButton alterarButton;
	

	private Aluno al;
	
	private ControleRedefinirSenha controle;
	
	public TelaRedefinicaoSenha(Aluno al) {
		super("Redefinir senha");
		
		this.al= al;
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
		
		cpf = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		getContentPane().add(cpf, gbc_textField);
		cpf.setColumns(15);
		
		JLabel novaSenha = new JLabel("Nova senha:");
		GridBagConstraints gbc_novaSenha = new GridBagConstraints();
		gbc_novaSenha.anchor = GridBagConstraints.EAST;
		gbc_novaSenha.insets = new Insets(0, 0, 5, 5);
		gbc_novaSenha.gridx = 1;
		gbc_novaSenha.gridy = 1;
		getContentPane().add(novaSenha, gbc_novaSenha);
		
		novasenha = new JTextField();
		GridBagConstraints gbc_novasenha = new GridBagConstraints();
		gbc_novasenha.insets = new Insets(0, 0, 5, 5);
		gbc_novasenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_novasenha.gridx = 2;
		gbc_novasenha.gridy = 1;
		getContentPane().add(novasenha, gbc_novasenha);
		novasenha.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 6;
		getContentPane().add(panel, gbc_panel);
		
		alterarButton = new JButton("Alterar Senha");
		panel.add(alterarButton);
		
		controle = new ControleRedefinirSenha(this);
		alterarButton.addActionListener(controle);
		
		setSize(451,303);
		setVisible(true);
		}

	public JTextField getCpf() {
		return cpf;
	}

	public JTextField getNome() {
		return novasenha;
	}

	public JButton getAlterarButton() {
		return alterarButton;
	}

	public Aluno getAl() {
		return al;
	}


}
