package br.com.model.vo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Registro {
	
	@Id
	@GeneratedValue
	private int id;

	@Temporal(TemporalType.DATE)
	private Date data;
	
	private String registro;

		
	public Registro() {
		
	}
	
	



	
	
	
	
	
	
	
	
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
}

