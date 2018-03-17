package br.com.control.professor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.model.dao.TurmaDAO;
import br.com.model.vo.Nota;
import br.com.model.vo.Turma;
import br.com.view.professor.TelaRegistrarNotas;

public class ControleTelaRegistrarNotas implements ActionListener {

	TelaRegistrarNotas t;
	private Turma tu; 
	public ControleTelaRegistrarNotas(TelaRegistrarNotas t, Turma tu) {
		this.t = t;
		this.tu = tu;
	}

	public void actionPerformed(ActionEvent e) {
		int linhas = t.getTl().getTable().getRowCount();
		for (int i = 0; i < linhas; i++) {
			
			float n1 = Float.parseFloat(String.valueOf(t.getTl().getTable().getValueAt(i, 3)));
			float n2 = Float.parseFloat(String.valueOf(t.getTl().getTable().getValueAt(i, 4)));
			float n3 =  Float.parseFloat(String.valueOf(t.getTl().getTable().getValueAt(i, 5)));

			if (tu.getSituacoes().get(i).getNotas().size()<2) {
				Nota no = new Nota();
				no.setNota(n1);

				Nota no1 = new Nota();
				no1.setNota(n2);

				Nota no2 = new Nota();
				no2.setNota(n3);

				tu.getSituacoes().get(i).getNotas().add(no);
				tu.getSituacoes().get(i).getNotas().add(no1);
				tu.getSituacoes().get(i).getNotas().add(no2);
			}else {
				tu.getSituacoes().get(i).getNotas().get(0).setNota(n1);
				tu.getSituacoes().get(i).getNotas().get(1).setNota(n2);
				tu.getSituacoes().get(i).getNotas().get(2).setNota(n3);
			}
		}
		
		TurmaDAO.merge(tu);
		t.dispose();
	}
}
