package br.com.control.alterarcadastroAluno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.facade.UsuarioFacade;
import br.com.view.aluno.TelaRedefinicaoSenha;

public class ControleRedefinirSenha implements ActionListener{
		
		TelaRedefinicaoSenha ta;
		UsuarioFacade uf;

	public ControleRedefinirSenha(TelaRedefinicaoSenha ta){
		this.ta = ta;
		uf = new UsuarioFacade();
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Entrou aqui");
		if(e.getSource() == this.ta.getAlterarButton()) {
			if (ta.getCpf().getText().equals(ta.getAl().getCpf())) {
				try {
					uf.atualizarAluno(ta.getAl(), ta.getAl().getNome(), ta.getCpf().getText(),ta.getAl().getEmail(),ta.getAl().getTelefone().getTelefone(), ta.getAl().getEndereco(),ta.getNome().getText() );	
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(ta, "Não foi possivel atualizar");
				} finally {
					JOptionPane.showMessageDialog(ta, "CPF alterado com sucesso");
					ta.getNome().setText("");
					ta.getCpf().setText("");
				}
			}else {
				JOptionPane.showMessageDialog(ta, "CPF incorreto");
			}
		}
	}
}
