package br.com.view.curso;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastrarCurso extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton salvarButton;
	private JButton excluirButton;
	private JTextField textField;
	private JTextField textFieldNome;
	private JTextField textFieldHorario;
	private JTextField textFieldCoordenador;

	public TelaCadastrarCurso() {
		super("CADASTRAR DADOS DO CURSO");
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textFieldNome = new JTextField();
		GridBagConstraints gbc_textFieldNome = new GridBagConstraints();
		gbc_textFieldNome.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNome.gridx = 4;
		gbc_textFieldNome.gridy = 0;
		getContentPane().add(textFieldNome, gbc_textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblHorrio = new JLabel("HORARIO");
		GridBagConstraints gbc_lblHorrio = new GridBagConstraints();
		gbc_lblHorrio.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorrio.anchor = GridBagConstraints.EAST;
		gbc_lblHorrio.gridx = 1;
		gbc_lblHorrio.gridy = 1;
		getContentPane().add(lblHorrio, gbc_lblHorrio);
		
		textFieldHorario = new JTextField();
		GridBagConstraints gbc_textFieldHorario = new GridBagConstraints();
		gbc_textFieldHorario.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHorario.gridx = 4;
		gbc_textFieldHorario.gridy = 1;
		getContentPane().add(textFieldHorario, gbc_textFieldHorario);
		textFieldHorario.setColumns(10);
		
		JLabel lblProfessor = new JLabel("COORDENADOR");
		GridBagConstraints gbc_lblProfessor = new GridBagConstraints();
		gbc_lblProfessor.anchor = GridBagConstraints.EAST;
		gbc_lblProfessor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfessor.gridx = 1;
		gbc_lblProfessor.gridy = 2;
		getContentPane().add(lblProfessor, gbc_lblProfessor);
		
		textFieldCoordenador = new JTextField();
		GridBagConstraints gbc_textFieldCoordenador = new GridBagConstraints();
		gbc_textFieldCoordenador.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCoordenador.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCoordenador.gridx = 4;
		gbc_textFieldCoordenador.gridy = 2;
		getContentPane().add(textFieldCoordenador, gbc_textFieldCoordenador);
		textFieldCoordenador.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlterar.gridx = 1;
		gbc_btnAlterar.gridy = 7;
		getContentPane().add(btnSalvar, gbc_btnAlterar);
		
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

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public void setSalvarButton(JButton salvarButton) {
		this.salvarButton = salvarButton;
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

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(JTextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}

	public JTextField getTextFieldHorario() {
		return textFieldHorario;
	}

	public void setTextFieldHorario(JTextField textFieldHorario) {
		this.textFieldHorario = textFieldHorario;
	}

	public JTextField getTextFieldCoordenador() {
		return textFieldCoordenador;
	}

	public void setTextFieldCoordenador(JTextField textFieldCoordenador) {
		this.textFieldCoordenador = textFieldCoordenador;
	}
}
