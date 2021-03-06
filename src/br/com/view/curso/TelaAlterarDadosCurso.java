package br.com.view.curso;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Insets;

public class TelaAlterarDadosCurso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField  nome;
	private JButton alterarButton;
	private JButton excluirButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public TelaAlterarDadosCurso() {
		super("ALTERAR DADOS DO CURSO");
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		nome = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		getContentPane().add(nome, gbc_textField);
		nome.setColumns(15);
		
		JLabel lblHorrio = new JLabel("HORARIO");
		GridBagConstraints gbc_lblHorrio = new GridBagConstraints();
		gbc_lblHorrio.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorrio.anchor = GridBagConstraints.EAST;
		gbc_lblHorrio.gridx = 1;
		gbc_lblHorrio.gridy = 1;
		getContentPane().add(lblHorrio, gbc_lblHorrio);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 1;
		getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblProfessor = new JLabel("COORDENADOR");
		GridBagConstraints gbc_lblProfessor = new GridBagConstraints();
		gbc_lblProfessor.anchor = GridBagConstraints.EAST;
		gbc_lblProfessor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfessor.gridx = 1;
		gbc_lblProfessor.gridy = 2;
		getContentPane().add(lblProfessor, gbc_lblProfessor);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnAlterar = new JButton("ALTERAR");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlterar.gridx = 1;
		gbc_btnAlterar.gridy = 7;
		getContentPane().add(btnAlterar, gbc_btnAlterar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 7;
		getContentPane().add(btnCancelar, gbc_btnCancelar);
		setSize(451,303);
		setLocationRelativeTo(null);
		setVisible(true);
		}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
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

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}



}
