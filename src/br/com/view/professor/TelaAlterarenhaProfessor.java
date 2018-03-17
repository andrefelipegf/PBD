package br.com.view.professor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class TelaAlterarenhaProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNovaSenha;
	public TelaAlterarenhaProfessor() {
		setTitle("Alterar Senha Professor");
		getContentPane().setLayout(null);

		JLabel lblDigiteSuaNova = new JLabel("Digite sua Nova Senha:");
		lblDigiteSuaNova.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDigiteSuaNova.setBounds(10, 22, 166, 14);
		getContentPane().add(lblDigiteSuaNova);

		textFieldNovaSenha = new JTextField();
		textFieldNovaSenha.setBounds(192, 21, 86, 20);
		getContentPane().add(textFieldNovaSenha);
		textFieldNovaSenha.setColumns(10);
	}


}
