package br.com.control.professor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.model.dao.DisciplinaDAO;
import br.com.model.facade.UsuarioFacade;
import br.com.model.vo.Disciplina;
import br.com.view.professor.TelaCadastrarDadosProfessor;

public class ControleTelaCadastroProfessor implements ActionListener{


	private TelaCadastrarDadosProfessor t;
	private UsuarioFacade u;

	public ControleTelaCadastroProfessor(TelaCadastrarDadosProfessor t) {
		this.t=t;
		u = new UsuarioFacade();
		pre();
	}

	@SuppressWarnings("unchecked")
	private void pre() {
		ArrayList<Disciplina> l = new ArrayList<Disciplina>(DisciplinaDAO.findAll()); 
		for (Disciplina disciplina : l) {
			t.getDi().addItem(""+disciplina.getNome()+";"+disciplina.getId());
		}
	}

	public void actionPerformed(ActionEvent e) {
		try {

			String nome = t.getNome().getText();
			String cpf = t.getCpf().getText();
			String senha = t.getSenha().getText();
			String endereco = t.getEndereco().getText();
			String email = t.getEmail().getText();
			String telefone = t.getTelefone().getText();
			boolean coo = t.getCoo().isSelected();
			boolean vice = t.getCoo().isSelected();

			String ids =  String.valueOf(t.getDi().getSelectedItem());
			String[] array = ids.split(";");
			int id = Integer.parseInt(array[1]);
			u.cadastrarProfessor(nome, cpf, email, endereco, telefone, senha, id, coo, vice);
			JOptionPane.showMessageDialog(t, "Cadastrou.");
			t.dispose();
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(t, "Erro no Cadastro!");
		}

	}

}
