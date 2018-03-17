package br.com.model.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Telefone{

	@Id
	@GeneratedValue
	private int id;	

	private String telefone;

	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}

















	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
