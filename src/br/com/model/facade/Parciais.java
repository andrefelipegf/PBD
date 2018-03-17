package br.com.model.facade;

import java.math.BigDecimal;
import java.util.List;

import br.com.model.dao.DisciplinaDAO;
import br.com.model.vo.Disciplina;
import br.com.model.vo.Falta;
import br.com.model.vo.Nota;
import br.com.model.vo.Registro;

public class Parciais {
	
	private Disciplina disciplina; 
	
	private int matriculados=0;
	private int reprovadosPorFaltas=0;
	private int cursando=0;
	
	private int aprovadosPorMedia=0;
	private int aprovadosPorFinal=0;
	private int reprovadosPorMedia=0;
	private int reprovadosNaFinal=0;
	
	private float perCursando=0.0f;
	private float perAprovadosPorMedia=0.0f;
	private float perAprovadosPorFinal=0.0f;
	private float perReprovados=0.0f;
	private float perReprovadosNaFinal=0.0f;
	private float aprovadosGeral=0.0f;
	private float reprovadosGeral=0.0f;
	
	public Parciais(Disciplina disciplina){
		this.disciplina = disciplina;
	
		this.matriculados = disciplina.getSituacoes().size();
		
		this.verificarnotas();
		
		this.perCursando = this.porcento(matriculados, cursando);
		this.perAprovadosPorMedia = this.porcento(this.matriculados,this.aprovadosPorMedia);
		this.perAprovadosPorFinal = this.porcento(this.matriculados,this.aprovadosPorFinal);
		this.perReprovados = this.porcento(this.matriculados,this.reprovadosPorMedia);
		this.perReprovadosNaFinal = this.porcento(this.matriculados,this.reprovadosNaFinal);
		this.aprovadosGeral = this.porcento(this.matriculados,this.aprovadosPorFinal+this.aprovadosPorMedia);
		this.reprovadosGeral = 100.0f - this.aprovadosGeral;
		
		
		
		
		
		
		
		System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		System.out.println("Matriculados: "+getMatriculados());
		System.out.println("Reprovados por Falta: "+getReprovadosPorFaltas());
		System.out.println("____________________________________________________________________________________");
		System.out.println("Cursando: "+getCursando());
		System.out.println(getPerCursando()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("Aprovados Por Media: "+getAprovadosPorMedia());
		System.out.println(""+getPerAprovadosPorMedia()+"%");
		
		System.out.println("Aprovados na Final: "+getAprovadosPorFinal());
		System.out.println(""+getPerAprovadosPorFinal()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("Reprovados: "+getReprovadosPorMedia());
		System.out.println(""+getPerReprovados()+"%");

		System.out.println("Reprovads na Final: "+getReprovadosNaFinal());
		System.out.println(""+getPerReprovadosNaFinal()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("Aprovados Geral: "+getAprovadosGeral()+"%");
		System.out.println("Reprovados Geral: "+getReprovadosGeral()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000");
	}

	public void verificarnotas() {
		for(int i = 0; i < this.disciplina.getSituacoes().size();i++){
			List<Nota> notas = this.disciplina.getSituacoes().get(i).getNotas();
			List<Falta> faltas = this.disciplina.getSituacoes().get(i).getFaltas();
			if(!reprovouPorFalta(faltas, this.disciplina.getRegistro())) {
				switch (vaiPraFinal(notas)) {
				case 2:{
					try {
						passouNaFinal(calMediaParcial(notas.get(0).getNota(), notas.get(1).getNota()),notas.get(2).getNota() );
					} catch (Exception e) {
						System.out.println("não tem notas");
						this.cursando+=1;
					}
					
					break;
				}
				case 3:{
					System.out.println("Sem notas");
					this.cursando+=1;
					break;
				}
				default:
					continue;
				}
			}
			
		}
	}
	
	public boolean reprovouPorFalta(List<Falta> faltas,List<Registro> registrosAulas){
		int faltasValidas = 0;
		int numeroAulas = registrosAulas.size();
		for(int i = 0; i < faltas.size(); i++) {
			if(faltas.get(i).isFalta() && !faltas.get(i).isJustificado()) {
				faltasValidas +=1;
			}
		}
		if(porcento(numeroAulas, faltasValidas) > 75f) {
			this.reprovadosPorFaltas +=1;
			return true;
			
		}else {
			return false;
		} 
	}
	
	public int vaiPraFinal(List<Nota> notas) {
		/*
		 *Retorna -1 se reprovado V.A.
		 *Retorna 1 se aprovado por media na segunda V.A.
		 *Retorna 2 se vai para a terceira V.A.
		 *Retorna 3 se ele não tiver notas  
		 */
		
		try {
			float a = notas.get(0).getNota();
			float b = notas.get(1).getNota();
			float mp = (a+b)/2;
			if( mp < 3.0) {
				this.reprovadosPorMedia +=1;
				return -1;
			}else if(mp<7){
				return 2;
			}else {
				this.aprovadosPorMedia +=1;
				return 1;
				}

		} catch (Exception e) {
			return 3;
		}
	}
	
	public int passouNaFinal(float mediaparcial, float notaFinal) {
		/*
		 *Retorna -1 se reprovado V.A.
		 *Retorna 1 se aprovado na final 
		 * 
		 */
		float m = calMediaFinal(mediaparcial, notaFinal);
		if (m>=5){
			this.aprovadosPorFinal +=1;
			return 1;
		}else{
			this.reprovadosNaFinal+=1;
			return -1;
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
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public int getMatriculados() {
		return matriculados;
	}

	public int getReprovadosPorFaltas() {
		return reprovadosPorFaltas;
	}

	public int getCursando() {
		return cursando;
	}

	public int getAprovadosPorMedia() {
		return aprovadosPorMedia;
	}

	public int getAprovadosPorFinal() {
		return aprovadosPorFinal;
	}

	public int getReprovadosPorMedia() {
		return reprovadosPorMedia;
	}

	public int getReprovadosNaFinal() {
		return reprovadosNaFinal;
	}

	public float getPerCursando() {
		return perCursando;
	}

	public float getPerAprovadosPorMedia() {
		return perAprovadosPorMedia;
	}

	public float getPerAprovadosPorFinal() {
		return perAprovadosPorFinal;
	}

	public float getPerReprovados() {
		return perReprovados;
	}

	public float getPerReprovadosNaFinal() {
		return perReprovadosNaFinal;
	}

	public float getAprovadosGeral() {
		return aprovadosGeral;
	}

	public float getReprovadosGeral() {
		return reprovadosGeral;
	}
	
	
	
	public static void main(String[] args) {
		
		Disciplina d = DisciplinaDAO.getById(0);
		Parciais p = new Parciais(d);
		System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		System.out.println("Matriculados: "+p.getMatriculados());
		System.out.println("Reprovados por Falta: "+p.getReprovadosPorFaltas());
		System.out.println("____________________________________________________________________________________");
		System.out.println("Cursando: "+p.getCursando());
		System.out.println(p.getPerCursando()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("Aprovados Por Media: "+p.getAprovadosPorMedia());
		System.out.println(""+p.getPerAprovadosPorMedia()+"%");
		
		System.out.println("Aprovados na Final: "+p.getAprovadosPorFinal());
		System.out.println(""+p.getPerAprovadosPorFinal()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("Reprovados: "+p.getReprovadosPorMedia());
		System.out.println(""+p.getPerReprovados()+"%");

		System.out.println("Reprovads na Final: "+p.getReprovadosNaFinal());
		System.out.println(""+p.getPerReprovadosNaFinal()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("Aprovados Geral: "+p.getAprovadosGeral()+"%");
		System.out.println("Reprovados Geral: "+p.getReprovadosGeral()+"%");
		System.out.println("____________________________________________________________________________________");
		System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000");
	}
}
