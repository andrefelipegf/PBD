package br.com.model.vo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma {
	@Id
	@GeneratedValue
	private int id;

	private String nome;
	
	@ManyToOne
	private Professor professor;

	@OneToMany(cascade= {CascadeType.ALL})
	private List<Registro> registro;

	@OneToMany(cascade= {CascadeType.ALL})
	private List<RegistrarObservacoes > registrarObservacoes;

	@OneToMany(cascade= {CascadeType.ALL})
	private List<SituacaoAlunoDisciplina> situacoes;

	@ManyToOne
	private Disciplina disciplina;


	public Turma() {
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Registro> getRegistro() {
		if (registro!=null) {
			return registro;
		}else{
			this.registro = new ArrayList<>();
			return registro;
		}
	}

	public void setRegistro(List<Registro> registro) {
		this.registro = registro;
	}


	public List<RegistrarObservacoes> getRegistrarObservacoes() {
		if (registrarObservacoes!=null) {
			return registrarObservacoes;
		}else{
			this.registrarObservacoes = new ArrayList<>();
			return registrarObservacoes;
		}
	}


	public void setRegistrarObservacoes(List<RegistrarObservacoes> registrarObservacoes) {
		this.registrarObservacoes = registrarObservacoes;
	}

	public List<SituacaoAlunoDisciplina> getSituacoes() {
		if (situacoes!=null) {
			return situacoes;
		}else{
			this.situacoes = new ArrayList<>();
			return situacoes;
		}
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSituacoes(List<SituacaoAlunoDisciplina> situacoes) {
		this.situacoes = situacoes;
	}
}
