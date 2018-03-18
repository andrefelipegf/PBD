package br.com.view.aluno;

import java.util.ArrayList;

import javax.swing.JInternalFrame;

import br.com.model.dao.TurmaDAO;
import br.com.model.facade.ParciaisAluno;
import br.com.model.vo.Aluno;
import br.com.model.vo.Nota;
import br.com.model.vo.SituacaoAlunoDisciplina;
import br.com.model.vo.Turma;
import br.com.view.falta.TabelaPadrao;

public class TelaNotasSemestre extends JInternalFrame {
	
	private static final long serialVersionUID = 1L;
	private TabelaPadrao tabelaAlunos;

	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	public TelaNotasSemestre(Aluno a) {
		
		tabelaAlunos = new TabelaPadrao("Notas No Sistema");
		tabelaAlunos.setColumns(new Object[]{"Semestre","Diciplina","1° Nota","2° Nota","Final","Média","Situação"});
		getContentPane().add(tabelaAlunos);
		pegarTurmas(a.getId());
		addDados(a.getId());
		
		setSize(700,400);
		
	}
	
	public void pegarTurmas(int idA) {
		
		ArrayList<Turma> ts = new ArrayList<Turma>(TurmaDAO.findAll());
		
		for (Turma t : ts) {
			for (SituacaoAlunoDisciplina s : t.getSituacoes()) {
				if(s.getAluno().getId() == idA){
					turmas.add(t);
				}
			}
		}
	} 
	
	public void addDados(int idA) {
		
		for (Turma t : turmas) {
			for (SituacaoAlunoDisciplina s : t.getSituacoes()) {
				if(s.getAluno().getId() == idA){
					if (s.getNotas().size()<2) {
						Nota n = new Nota();
						n.setNota(0.0f);
						Nota n1 = new Nota();
						n1.setNota(0.0f);
						Nota n2 = new Nota();
						n2.setNota(0.0f);
						s.getNotas().add(n);
						s.getNotas().add(n1);
						s.getNotas().add(n2);
					}
					
					
					
					ParciaisAluno p = new ParciaisAluno(s,t.getRegistro().size());
					tabelaAlunos.setRow(new Object[]{t.getNome(),t.getDisciplina().getNome(),s.getNotas().get(0).getNota() ,s.getNotas().get(1).getNota() ,s.getNotas().get(2).getNota(),p.getMedia(),p.getSituacao()});
				}
			}
		}
	} 
	
	
	
	
	
}
