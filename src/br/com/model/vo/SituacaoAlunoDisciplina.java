package br.com.model.vo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SituacaoAlunoDisciplina {

	@Id
	@GeneratedValue
	private int id;

	@OneToOne
	@JoinColumn(name="aluno_id")
	private Aluno aluno;

	@OneToMany(cascade= {CascadeType.ALL})
	private List<Falta> faltas;
	
	@OneToMany(cascade= {CascadeType.ALL})
	private List<Nota> notas;
	
	private String situacao;
	
	public SituacaoAlunoDisciplina(){}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Falta> getFaltas() {
		if (faltas!=null) {
			return faltas;
		}else{
			this.faltas = new ArrayList<>();
			return faltas;
		}
	}

	public void setFaltas(List<Falta> faltas) {
		this.faltas = faltas;
	}

	public List<Nota> getNotas() {
		if (notas!=null) {
			return notas;
		}else{
			this.notas = new ArrayList<>();
			return notas;
		}
	}

	public void setNota(List<Nota> notas) {
		this.notas = notas;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
