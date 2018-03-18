package br.com.control.CadastrarAluno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.facade.UsuarioFacade;
import br.com.view.aluno.TelaCadastrarDadosAlunos;

public class ControleCadastrarAluno implements ActionListener {

	TelaCadastrarDadosAlunos tlc;
	private UsuarioFacade u;
	public ControleCadastrarAluno(TelaCadastrarDadosAlunos tlc) {
		this.tlc = tlc;
		u = new UsuarioFacade();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tlc.getSalvarButton()) {
			try {
				u.cadastrarAluno(this.tlc.getNome().getText(), this.tlc.getCpf().getText(), this.tlc.getEmail().getText(), this.tlc.getEndereco().getText(),tlc.getTelefone().getText(), tlc.getSenha().getText());
				JOptionPane.showMessageDialog(tlc, "Cadastrado");
				tlc.dispose();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(tlc, "Erro ao Cadastrarr");
				
			}
		}

	}

}
