package br.com.model.vo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Disciplina {
	
	private String nome;
	
	@Id
	@GeneratedValue
	private int id;
	
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
	
}
