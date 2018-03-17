package br.com.model.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Disciplina {
	
	private String nome;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date calendario;

	@OneToMany(cascade= {CascadeType.ALL})
	private List<Registro> registro;
	
	
	@OneToMany
	private List<SituacaoAlunoDisciplina> situacoes;
	
	private int carga_horaririo;
	
	
	
	public Disciplina() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCalendario() {
		return calendario;
	}

	public void setCalendario(Date calendario) {
		this.calendario = calendario;
	}
	
	

	//public List<Aluno> getAlunos() {
	//	return Alunos;
	//}

	//public void setAlunos(List<Aluno> alunos) {
	//	Alunos = alunos;
	//}

	public List<SituacaoAlunoDisciplina> getSituacoes() {
		if (situacoes!=null) {
			return situacoes;
		}else{
			this.situacoes = new ArrayList<>();
			return situacoes;
		}
	}

	public void setSituacoes(List<SituacaoAlunoDisciplina> situacoes) {
		this.situacoes = situacoes;
	}


	public void setRegistro(List<Registro> registro) {
		this.registro = registro;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCarga_horaririo() {
		return carga_horaririo;
	}

	public void setCarga_horaririo(int carga_horaririo) {
		this.carga_horaririo = carga_horaririo;
	}

	public List<Registro> getRegistro() {
		if (registro!=null) {
			return registro;
		}else{
			this.registro = new ArrayList<>();
			return registro;
		}

	}

	
	
	
}
