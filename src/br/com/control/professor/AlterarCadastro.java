package br.com.control.professor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.dao.AlunoDAO;
import br.com.model.facade.UsuarioFacade;
import br.com.model.vo.Aluno;
import br.com.view.professor.TelaAlterarDadosAluno;

public class AlterarCadastro implements ActionListener{
		
		TelaAlterarDadosAluno ta;
		UsuarioFacade uf;

	public AlterarCadastro(TelaAlterarDadosAluno ta){
		this.ta = ta;
		uf = new UsuarioFacade();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.ta.getAlterarButton()) {
			try {
				Aluno a = AlunoDAO.getBycpf(ta.getCpf().getText());
				uf.atualizarAluno(a, ta.getNome().getText(), ta.getCpf().getText(), ta.getEmail().getText(),ta.getTelefone().getText(), ta.getEndereco().getText(),ta.getSenha().getText());	
			} catch (Exception e2) {
				JOptionPane.showInternalMessageDialog(ta, "Não Foi Possivel Alterar os dados do sistema");
			}finally {
				ta.getCpf().setText("");
				ta.getNome().setText("");
				ta.getEmail().setText("");
				ta.getEndereco().setText("");
				ta.getTelefone().setText("");
				ta.getSenha().setText("");
				JOptionPane.showInternalMessageDialog(ta, "Alteração Concluida");

			}
			
		}
		if(e.getSource() == this.ta.getBuscar()) {
			try {
				Aluno a = AlunoDAO.getBycpf(ta.getCpf().getText());
				ta.getNome().setText(a.getNome());
				ta.getEmail().setText(a.getEmail());
				ta.getEndereco().setText(a.getEndereco());
				ta.getTelefone().setText(a.getTelefone().getTelefone());
				ta.getSenha().setText(a.getSenha());
			} catch (Exception e2) {
				JOptionPane.showInternalMessageDialog(ta, "Aluno Não Encontrado");
			}
		}		
	}
}
