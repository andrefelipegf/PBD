package br.com.view.observacao;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.com.model.dao.TurmaDAO;
import br.com.model.vo.RegistrarObservacoes;
import br.com.model.vo.Turma;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TelaRegistrarObservacao extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField observacaoField;
	private JButton  btnSalvar;
	private JButton	 btnCancelar;


	public TelaRegistrarObservacao(Turma t) {
		super("REGISTRAR OBSERVA��ES");
		setSize(399,335);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		observacaoField = new JTextField();
		observacaoField.setBounds(10, 25, 363, 224);
		getContentPane().add(observacaoField);
		observacaoField.setColumns(10);

		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(55, 260, 104, 23);
		getContentPane().add(btnSalvar);

		JLabel lblObservaes = new JLabel("OBSERVA��ES:");
		lblObservaes.setBounds(10, 11, 124, 14);
		getContentPane().add(lblObservaes);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarObservacoes o = new RegistrarObservacoes();
				o.setObservacao(observacaoField.getText());
				t.getRegistrarObservacoes().add(o);
				TurmaDAO.merge(t);
				dispose();
			}
		});
		
		setVisible(true);
	}


	public JTextField getObservacaoField() {
		return observacaoField;
	}


	public void setObservacaoField(JTextField observacaoField) {
		this.observacaoField = observacaoField;
	}


	public JButton getBtnSalvar() {
		return btnSalvar;
	}


	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}


	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
}
