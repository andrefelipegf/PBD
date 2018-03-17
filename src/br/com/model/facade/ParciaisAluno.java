package br.com.model.facade;

import java.math.BigDecimal;
import java.util.List;

import br.com.model.vo.Falta;
import br.com.model.vo.Nota;
import br.com.model.vo.SituacaoAlunoDisciplina;

public class ParciaisAluno {

	private SituacaoAlunoDisciplina s; 

	private float mediaParcial = 0.0f;
	private float mediaFinal = 0.0f;

	private boolean reprovouFalta = false;
	private boolean reprovouGeral = false;
	private boolean reprovouFinal = false;
	private boolean fezFinal = false;

	private String situacao;

	public ParciaisAluno(SituacaoAlunoDisciplina s, int aulas){
		this.s = s;
		this.verificarnotas(aulas);
	}

	public void verificarnotas(int aulas) {
		List<Nota> notas = this.s.getNotas();
		List<Falta> faltas = this.s.getFaltas();
		if(!reprovouPorFalta(faltas, aulas)) {
			switch (vaiPraFinal(notas)) {
			case 2:{
				passouNaFinal(calMediaParcial(notas.get(0).getNota(), notas.get(1).getNota()),notas.get(2).getNota());
				break;
			}
			}
		}
	}

	public boolean reprovouPorFalta(List<Falta> faltas, int aulas){
		int faltasValidas = 0;
		int numeroAulas = aulas;

		for(int i = 0; i < faltas.size(); i++) {
			if(faltas.get(i).isFalta() && !faltas.get(i).isJustificado()) {
				faltasValidas +=1;
			}
		}

		if(porcento(numeroAulas, faltasValidas) > 75f) {
			reprovouFalta = true;
			this.mediaParcial = calMediaParcial(this.s.getNotas().get(0).getNota(),this.s.getNotas().get(1).getNota());
			this.situacao = "Reprovado por Falta";
			return true;

		}else {
			return false;
		} 
	}

	public boolean passouNaFinal(float mediaparcial, float notaFinal) {
		/*
		 *Retorna -1 se reprovado V.A.
		 *Retorna 1 se aprovado na final 
		 * 
		 */
		float m = calMediaFinal(mediaparcial, notaFinal);
		if (m>=5){
			this.mediaFinal = m;
			this.situacao = "Aprovado na Final";
			return true;
		}else{
			this.reprovouFinal = true;
			this.mediaFinal = m;
			this.situacao = "Reprovado na Final";
			return false;
		}
	}

	public int vaiPraFinal(List<Nota> notas) {
		/*
		 *Retorna -1 se reprovado V.A.
		 *Retorna 1 se aprovado por media na segunda V.A.
		 *Retorna 2 se vai para a terceira V.A.
		 *Retorna 3 se ele n�o tiver notas  
		 */

		try {
			float a = notas.get(0).getNota();
			float b = notas.get(1).getNota();
			float mp = calMediaParcial(a, b);
			if( mp < 3.0) {
				this.reprovouGeral = true;
				this.mediaParcial = mp;
				this.situacao = "Reprovado por Média";
				return -1;
			}else if(mp<7){
				this.fezFinal = true;
				return 2;
			}else {
				this.mediaParcial = mp;
				this.situacao = "Aprovado por Média";
				return 1;
			}

		} catch (Exception e) {
			return 3;
		}
	}

	public float calMediaParcial(float primeiraNota, float segundaNota){
		return arredondar((primeiraNota+segundaNota)/2);
	}

	public float calMediaFinal(float mediaparcial, float notaFinal){
		return arredondar(((mediaparcial * 6)+(notaFinal * 4))/10);
	}

	public float arredondar(float valor) {
		BigDecimal bd = new BigDecimal(valor).setScale(1, BigDecimal.ROUND_HALF_EVEN);
		return bd.floatValue();
	}

	public float porcento(int total,int parte) {
		if(total != 0) {
			return (parte * 100)/total;
		}else {
			return 0f;
		}
	}


	/*
	 * 
	 * 
	 *Gets and set 
	 * 
	 * 
	 * 
	 * */

	public float getMediaParcial() {
		return mediaParcial;
	}

	public float getMediaFinal() {
		return mediaFinal;
	}

	public boolean isReprovouFalta() {
		return reprovouFalta;
	}

	public boolean isReprovouGeral() {
		return reprovouGeral;
	}

	public boolean isReprovouFinal() {
		return reprovouFinal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public boolean isFezFinal() {
		return fezFinal;
	}


}
