package br.com.control.professor;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.com.model.dao.AlunoDAO;
import br.com.model.vo.Aluno;
import br.com.view.professor.TelaListarALunos;

public class ControleTelaListarAluno implements ActionListener{

	private TelaListarALunos tela;
	private List<Aluno> alunos;
	
	public ControleTelaListarAluno(TelaListarALunos tela) {
		this.tela = tela;	
		this.alunos = AlunoDAO.findAll();
		
		for (int i = 0; i < alunos.size(); i++) {
			this.tela.getTabela().setRow(new Object[] {alunos.get(i).getId(),alunos.get(i).getNome(),alunos.get(i).getCpf(),alunos.get(i).getCodigo(),alunos.get(i).getMatricula(),alunos.get(i).getEmail(),alunos.get(i).getEndereco(),alunos.get(i).getTelefone()});
		}
	}


	public void actionPerformed(ActionEvent e) {
		
	}


}
