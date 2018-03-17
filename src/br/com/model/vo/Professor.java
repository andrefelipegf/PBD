package br.com.model.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Professor {

	@Id
	@GeneratedValue
	private int id;

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matricula;

	@Column(unique= true)
	private String cpf;

	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name= "telefone_id")
	private Telefone telefone;

	@OneToOne
	@JoinColumn(name= "departamento_id")
	private Departamento departamento;
	
	private String email;
	private String endereco;
	private String senha;
	private boolean coordenador;
	private boolean vice_coordenador;
	private String nome;
	
	public Professor() {
		super();
	}

	public void setCoordenador(boolean coordenador) {
		this.coordenador = coordenador;
	}

	public void setVice_coordenador(boolean vice_coordenador) {
		this.vice_coordenador = vice_coordenador;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isCoordenador() {
		return coordenador;
	}

	public boolean isVice_coordenador() {
		return vice_coordenador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
