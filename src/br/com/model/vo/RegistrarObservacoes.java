package br.com.model.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RegistrarObservacoes {

	@Id
	@GeneratedValue
	private int id;
	
	private String observacao;
	
	public RegistrarObservacoes() {
		super();
	}

	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}

