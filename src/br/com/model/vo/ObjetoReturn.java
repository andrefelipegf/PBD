package br.com.model.vo;

public class ObjetoReturn {


	private Aluno aluno = null;

	private Professor professor = null;
	private boolean ealuno = false;
	private boolean eprofessor= false;
	private boolean podelogar= false;

	public ObjetoReturn() {
		super();
	}

	// um construtor só pra receber.
	
	public ObjetoReturn(Aluno aluno) {
		this.aluno= aluno;

		this.ealuno= true;
		this.podelogar= true;
	}

	public ObjetoReturn(Professor professor) {
		this.professor= professor;

		this.eprofessor= true;
		this.podelogar= true;
	}


	
	public Aluno getAluno() {
		return aluno;
	}

	public Professor getProfessor() {
		return professor;
	}


	public boolean isEaluno() {
		return ealuno;
	}

	public boolean isEprofessor() {
		return eprofessor;
	}

	public boolean isPodelogar() {
		return podelogar;
	}
}
