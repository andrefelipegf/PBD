package br.com.control.professor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.facade.UsuarioFacade;
import br.com.view.professor.TelaRedefinicaoSenhaProfessor;

public class ControleRedefinirSenhaProfessor implements ActionListener{
		
		TelaRedefinicaoSenhaProfessor ta;
		UsuarioFacade uf;

	public ControleRedefinirSenhaProfessor(TelaRedefinicaoSenhaProfessor ta){
		this.ta = ta;
		uf = new UsuarioFacade();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.ta.getAlterarButton()) {
			if (ta.getCpf().getText().equals(ta.getAl().getCpf())) {
				try {
					uf.atualizarProfessor(ta.getAl(), ta.getAl().getNome(), ta.getCpf().getText(),ta.getAl().getEmail(),ta.getAl().getTelefone().getTelefone(), ta.getAl().getEndereco(),ta.getNome().getText(), ta.getAl().isCoordenador(), ta.getAl().isVice_coordenador(), ta.getAl().getDepartamento());
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(ta, "Não foi possivel atualizar");
				} finally {
					JOptionPane.showMessageDialog(ta, "CPF alterado com sucesso");
					ta.getNome().setText("");
					ta.getCpf().setText("");
					ta.dispose();
				}
			}else {
				JOptionPane.showMessageDialog(ta, "CPF incorreto");
			}
		}
	}
}
