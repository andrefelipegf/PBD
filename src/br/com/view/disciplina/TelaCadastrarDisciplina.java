package br.com.view.disciplina;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.model.dao.DisciplinaDAO;
import br.com.model.vo.Disciplina;

public class TelaCadastrarDisciplina extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldCargaHorario;

	public TelaCadastrarDisciplina() {
		super("CADASTRAR DADOS DA DISCIPLINA");

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
		gbc_textFieldNome.gridwidth = 4;
		gbc_textFieldNome.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNome.gridx = 2;
		gbc_textFieldNome.gridy = 0;
		getContentPane().add(textFieldNome, gbc_textFieldNome);
		textFieldNome.setColumns(15);

		JLabel lblCargaHorria = new JLabel("CARGA HOR\u00C1RIA");
		GridBagConstraints gbc_lblCargaHorria = new GridBagConstraints();
		gbc_lblCargaHorria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargaHorria.gridx = 1;
		gbc_lblCargaHorria.gridy = 1;
		getContentPane().add(lblCargaHorria, gbc_lblCargaHorria);

		textFieldCargaHorario = new JTextField();
		GridBagConstraints gbc_textFieldCargaHorario = new GridBagConstraints();
		gbc_textFieldCargaHorario.gridwidth = 4;
		gbc_textFieldCargaHorario.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCargaHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCargaHorario.gridx = 2;
		gbc_textFieldCargaHorario.gridy = 1;
		getContentPane().add(textFieldCargaHorario, gbc_textFieldCargaHorario);
		textFieldCargaHorario.setColumns(10);
		
				JButton salvarButton_1 = new JButton("SALVAR");
				GridBagConstraints gbc_salvarButton_1 = new GridBagConstraints();
				gbc_salvarButton_1.gridwidth = 3;
				gbc_salvarButton_1.insets = new Insets(0, 0, 5, 5);
				gbc_salvarButton_1.gridx = 3;
				gbc_salvarButton_1.gridy = 3;
				getContentPane().add(salvarButton_1, gbc_salvarButton_1);
				
				salvarButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Disciplina d = new Disciplina();
							d.setCarga_horaririo(Integer.parseInt(textFieldCargaHorario.getText()));
							d.setNome(textFieldNome.getText());
							DisciplinaDAO.persist(d);
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Não Foi Possivel cadastrar");
						}
					}
				});
		setSize(451,303);
	}
}
