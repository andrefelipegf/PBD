package br.com.main;

import br.com.model.dao.DisciplinaDAO;
import br.com.model.vo.Disciplina;


import br.com.model.facade.UsuarioFacade;

import br.com.view.login.TelaLogin;

public class Main {

	public static void main(String[] args) {

		new TelaLogin();

//		Disciplina d = new Disciplina();
//		d.setCarga_horaririo(60);
//		d.setNome("PBD");
//		DisciplinaDAO.persist(d);
//		
//		Disciplina d1 = new Disciplina();
//		d1.setCarga_horaririo(60);
//		d1.setNome("MPOO");
//		DisciplinaDAO.persist(d1);
//		
//		Disciplina d2 = new Disciplina();
//		d2.setCarga_horaririo(60);
//		d2.setNome("IP");
//		DisciplinaDAO.persist(d2);
//		
//		UsuarioFacade uf = new UsuarioFacade();
//		uf.cadastrarAluno("André", "1", "v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Vinícius", "2", "1v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Carol", "3", "2v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Jose", "4", "3v@v.com", "Antonio", "1", "1");
//		uf.cadastrarAluno("Wedson", "5", "4v@v.com", "Antonio", "1", "1");
//		
//		uf.cadastrarProfessor("berg", "10", "1112sdsd", "sdsd", "1", "1", 2, true, false);
//		uf.cadastrarProfessor("ellen", "11", "2112sdsd", "sdsd", "1", "1", 2, false, false);
//		uf.cadastrarProfessor("rico", "12", "3112sdsd", "sdsd", "1", "1", 2, false, false);
//		uf.cadastrarProfessor("ygor", "13", "4112sdsd", "sdsd", "1", "1", 2, false, true);
//		uf.cadastrarProfessor("glauber", "14", "5112sdsd", "sdsd", "1", "1", 2, false, false);
//
//		System.exit(0);
		
	}
}
