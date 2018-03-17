package br.com.model.facade;

import br.com.model.dao.AlunoDAO;
import br.com.model.dao.ProfessorDAO;
import br.com.model.dao.TelefoneDAO;
import br.com.model.vo.Aluno;
import br.com.model.vo.Departamento;
import br.com.model.vo.ObjetoReturn;
import br.com.model.vo.Professor;

public class UsuarioFacade {


	public UsuarioFacade() {
		super();
	}

	// polimorfismo
	public ObjetoReturn verificarLogin(String cpf, String senha) {
		ObjetoReturn objr = null;
		Aluno obj = AlunoDAO.getBycpf(cpf);
		if(obj!=null) {
			if(obj.getSenha().equals(senha)) {
				objr= new ObjetoReturn(obj);
				System.out.println(obj.getNome());
				return objr;
			}
		}else {
			Professor objp = ProfessorDAO.getBycpf(cpf);
			if(objp!=null) {
				if(objp.getSenha().equals(senha)) {
					objr= new ObjetoReturn(objp);
					return objr;
				}
			}
		}
		objr= new ObjetoReturn();
		return objr;
	}
		
	public boolean atualizarAluno(Aluno aluno,String nome,String cpf,String senha,String email,String telefone,String endereco){
		try {
			aluno.setNome(nome);
			aluno.setCpf(cpf);
			aluno.setEmail(email);
			aluno.getTelefone().setTelefone(telefone);
			aluno.setSenha(senha);
			TelefoneDAO.merge(aluno.getTelefone());
			aluno.setEndereco(endereco);
			
			AlunoDAO.merge(aluno);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean atualizarProfessor(Professor professor,String nome,String cpf,String email,String telefone,String endereco,boolean coordenador,boolean vice_coordenador,Departamento departamento){
		try {
			professor.setNome(nome);
			professor.setCpf(cpf);
			professor.setEmail(email);
			professor.getTelefone().setTelefone(telefone);
			TelefoneDAO.merge(professor.getTelefone());
			professor.setEndereco(endereco);
			professor.setCoordenador(coordenador);
			professor.setVice_coordenador(vice_coordenador);
			professor.setDepartamento(departamento);;
			ProfessorDAO.merge(professor);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}



}
