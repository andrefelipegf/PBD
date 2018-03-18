package br.com.view.aluno;

import java.util.ArrayList;

import javax.swing.JInternalFrame;

import br.com.model.dao.TurmaDAO;
import br.com.model.facade.ParciaisAluno;
import br.com.model.vo.Aluno;
import br.com.model.vo.SituacaoAlunoDisciplina;
import br.com.model.vo.Turma;
import br.com.view.falta.TabelaPadrao;

public class TelaHistorico extends JInternalFrame {
	
	private static final long serialVersionUID = 1L;
	private TabelaPadrao tabelaAlunos;

	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	public TelaHistorico(Aluno a) {
		
		tabelaAlunos = new TabelaPadrao("Histórico");
		tabelaAlunos.setColumns(new Object[]{"Diciplina","Semestre","CH","Faltas","Média","Situação"});
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
					ParciaisAluno p = new ParciaisAluno(s,t.getRegistro().size());
					tabelaAlunos.setRow(new Object[]{t.getDisciplina().getNome(),t.getNome(),t.getDisciplina().getCarga_horaririo(),p.getFaltas(),p.getMedia(),p.getSituacao()});
				}
			}
		}
	} 
	
	
	
	
	
}
