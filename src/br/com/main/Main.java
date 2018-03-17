package br.com.main;

import br.com.view.aluno.TelaCadastrarDadosAlunos;
import br.com.view.aluno.TelaDelfosAluno;
import br.com.view.curso.TelaAlterarDadosCurso;
import br.com.view.curso.TelaCadastrarCurso;
import br.com.view.departamento.TelaAlterarDadosDepartamento;
import br.com.view.departamento.TelaCadastrarDepartamento;
import br.com.view.disciplina.TelaAlterarDadosDisciplina;
import br.com.view.disciplina.TelaCadastrarDisciplina;

import java.util.Date;

import br.com.model.dao.AlunoDAO;
import br.com.model.dao.DisciplinaDAO;
import br.com.model.facade.Parciais;
import br.com.model.facade.RegistrarFacade;
import br.com.model.facade.UsuarioFacade;
import br.com.model.vo.Disciplina;
import br.com.model.vo.ObjetoReturn;
import br.com.view.aluno.TelaAlterarDadosAluno;
import br.com.view.observacao.TelaRegistrarObservacao;
import br.com.view.professor.TelaAlterarDadosProfessor;
import br.com.view.professor.TelaCadastrarDadosProfessor;
import br.com.view.professor.TelaDelfosProfessor;
import br.com.view.sistema.TelaLogin;

public class Main {

	public static void main(String[] args) {
		
	
		//new TelaAlterarDadosProfessor();
		//new TelaAlterarDadosAluno();
		//new TelaRegistrarObservacao();
		new TelaLogin();
		//new TelaCadastrarDadosAlunos();
		//new TelaCadastrarDadosProfessor();
		//new TelaAlterarDadosCurso();
		//new TelaCadastrarCurso();
		
		//new TelaAlterarDadosDepartamento();
		//new TelaCadastrarDepartamento();
		//new TelaAlterarDadosDisciplina();
		//new TelaCadastrarDisciplina();
	
		
		/*
		UsuarioFacade uf = new UsuarioFacade();
		uf.atualizarAluno(AlunoDAO.getById(0), "andre", "876","minhasnovasenha", "fulano@gmail", "7654387","rua da subida");
		
		
		
		
		ObjetoReturn or= uf.verificarLogin("10", "1");
		
		 	if ( or.isPodelogar()) {
		 		if (or.isEaluno()) {
		 			System.out.println("aluno logou");
		 		}else 
		 			System.out.println("professor logou");
		 	} else
		 		System.out.println(" cpf ou senha n encontrado");
	
		
		
*/	
	
//		Disciplina dc = DisciplinaDAO.getById(0);
//		Parciais pa = new Parciais(dc);
		
		
		//RegistrarFacade rf = new RegistrarFacade();
		//rf.registrarAula(dc, new Date(), "aula pbd muito boa");
	
		
		
		
	}
	
	
	
}
