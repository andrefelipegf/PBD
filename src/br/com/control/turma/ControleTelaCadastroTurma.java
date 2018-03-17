package br.com.control.turma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.model.dao.AlunoDAO;
import br.com.model.dao.DisciplinaDAO;
import br.com.model.dao.ProfessorDAO;
import br.com.model.dao.TurmaDAO;
import br.com.model.vo.Aluno;
import br.com.model.vo.Disciplina;
import br.com.model.vo.Professor;
import br.com.model.vo.SituacaoAlunoDisciplina;
import br.com.model.vo.Turma;
import br.com.view.turma.TelaCadastroTurma;

public class ControleTelaCadastroTurma implements ActionListener {
	
	private TelaCadastroTurma t;
	
	public ControleTelaCadastroTurma(TelaCadastroTurma t) {
		this.t= t;
		pre();
	
	}
	
	@SuppressWarnings("unchecked")
	private void pre() {
		ArrayList<Disciplina> l = new ArrayList<Disciplina>(DisciplinaDAO.findAll()); 
		for (Disciplina disciplina : l) {
			t.getDisciplina().addItem(""+disciplina.getNome()+";"+disciplina.getId());
		}
		
		ArrayList<Professor> p = new ArrayList<Professor>(ProfessorDAO.findAll()); 
		for (Professor pr : p) {
			t.getProfessor().addItem(""+pr.getNome()+";"+pr.getId());
		}
		ArrayList<Aluno> a = new ArrayList<Aluno>(AlunoDAO.findAll());
		for (Aluno al : a) {
			t.getTabelaAlunos().setRow(new Object[]{al.getId(),al.getNome(),al.getCpf(),al.getCodigo(), al.getMatricula() ,al.getEmail(),al.getTelefone(),al.getEndereco()});
		}
		
	}

	
	
	public void actionPerformed(ActionEvent e) {
		try {
			Turma tu = new Turma();
			tu.setNome(t.getSemestre().getText());

			String ids =  String.valueOf(t.getDisciplina().getSelectedItem());
			String[] array = ids.split(";");
			int idd = Integer.parseInt(array[1]);
			
			String idv =  String.valueOf(t.getProfessor().getSelectedItem());
			String[] arra = idv.split(";");
			int idp = Integer.parseInt(arra[1]);
			
			Disciplina d = DisciplinaDAO.getById(idd);
			Professor p = ProfessorDAO.getById(idp);
			
			tu.setProfessor(p);
			tu.setDisciplina(d);
			
			
			int[] linha = t.getTabelaAlunos().getTable().getSelectedRows();
			
			for (int i = 0; i < linha.length; i++) {
				
				int id = (int) t.getTabelaAlunos().getTable().getValueAt(linha[i],0);
				SituacaoAlunoDisciplina s = new SituacaoAlunoDisciplina();
				Aluno a = AlunoDAO.getById(id);
				s.setAluno(a);
				tu.getSituacoes().add(s);
				
			}
			
			TurmaDAO.persist(tu);

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(t, "impossivel criar a Turma");

		}finally {
			JOptionPane.showMessageDialog(t, "Turma criada com sucesso");
			t.dispose();
		}
		
	}
	
	
	
}
