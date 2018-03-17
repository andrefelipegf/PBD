package br.com.view.disciplina;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAlterarDadosDisciplina  extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton alterarButton;
	private JButton excluirButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public TelaAlterarDadosDisciplina() {
		super("ALTERAR DADOS DA DISCIPLINA");

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("NOME:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(15);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 0;
		getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

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

		JLabel lblCargaHorria = new JLabel("Carga hor\u00E1ria");
		GridBagConstraints gbc_lblCargaHorria = new GridBagConstraints();
		gbc_lblCargaHorria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargaHorria.gridx = 1;
		gbc_lblCargaHorria.gridy = 3;
		getContentPane().add(lblCargaHorria, gbc_lblCargaHorria);

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

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
}
