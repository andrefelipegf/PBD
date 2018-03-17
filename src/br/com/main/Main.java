package br.com.main;

import br.com.model.dao.AlunoDAO;
import br.com.model.dao.DisciplinaDAO;
import br.com.model.vo.Aluno;
import br.com.model.vo.Disciplina;
import br.com.model.vo.Telefone;


import br.com.model.dao.ProfessorDAO;
import br.com.model.dao.TurmaDAO;
import br.com.model.facade.UsuarioFacade;
import br.com.model.vo.Professor;

import br.com.view.login.TelaLogin;
import br.com.view.turma.TelaCadastroTurma;
import br.com.view.turma.TelaTurma;

public class Main {

	public static void main(String[] args) {

		new TelaLogin();

//		new TelaTurma(TurmaDAO.getById(24));
		
//		Disciplina d = new Disciplina();
//		d.setCarga_horaririo(60);
//		d.setNome("PBD");
//		DisciplinaDAO.persist(d);
//		Disciplina d1 = new Disciplina();
//		d1.setCarga_horaririo(60);
//		d1.setNome("MPOO");
//		DisciplinaDAO.persist(d1);
//		Disciplina d2 = new Disciplina();
//		d2.setCarga_horaririo(60);
//		d2.setNome("IP");
//		DisciplinaDAO.persist(d2);
		
//		new TelaCadastroTurma();
		
//		UsuarioFacade uf = new UsuarioFacade();
//		uf.cadastrarAluno("André", "1", "v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Vinícius", "2", "1v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Carol", "3", "2v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Jose", "4", "3v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Wedson", "5", "4v@v.com", "Antonio", "1", "1");
//		
//		uf.cadastrarProfessor("berg", "10", "1112sdsd", "sdsd", "1", "1", 2, true, false);
//		uf.cadastrarProfessor("ellen", "11", "2112sdsd", "sdsd", "1", "1", 2, true, false);
//		uf.cadastrarProfessor("rico", "12", "3112sdsd", "sdsd", "1", "1", 2, true, false);
//		uf.cadastrarProfessor("ygor", "13", "4112sdsd", "sdsd", "1", "1", 2, true, false);
//		uf.cadastrarProfessor("glauber", "14", "5112sdsd", "sdsd", "1", "1", 2, true, false);
//
//		System.exit(0);
		
		
	}
}
