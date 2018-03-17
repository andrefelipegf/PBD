package br.com.view.aluno;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaInfo   extends JFrame{
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	public TelaInfo() {
		setTitle("Informa\u00E7\u00F5es  Pessoais");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CPF:");
		label.setBounds(0, 11, 23, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("NOME:");
		label_1.setBounds(0, 36, 33, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("ENDERE\u00C7O:");
		label_2.setBounds(0, 61, 58, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("EMAIL:");
		label_3.setBounds(-1, 86, 34, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("TELEFONE:");
		label_4.setBounds(0, 111, 54, 14);
		getContentPane().add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 33, 49, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(15);
		textField_2.setBounds(81, 8, 49, 20);
		getContentPane().add(textField_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(81, 58, 49, 20);
		getContentPane().add(textField);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(81, 83, 49, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(81, 108, 49, 20);
		getContentPane().add(textField_4);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmLogar_1 = new JMenuItem("Logout");
		mnSistema.add(mntmLogar_1);
		
		JMenuItem mntmLogar = new JMenuItem("Sair");
		mnSistema.add(mntmLogar);
	}
}
