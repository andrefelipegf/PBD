package br.com.view.professor;

import br.com.control.professor.ControleTelaRegistrarNotas;
import br.com.model.vo.Nota;
import br.com.model.vo.SituacaoAlunoDisciplina;
import br.com.model.vo.Turma;
import br.com.view.falta.TabelaPadrao;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaRegistrarNotas extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton btnSalvar;

	private ControleTelaRegistrarNotas ct;

	private TabelaPadrao tl;

	public TelaRegistrarNotas(Turma t) {

		setResizable(true);
		setTitle("Regstro de Aula");
		setSize(500,800);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		getContentPane().setLayout(null);

		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(194, 589, 89, 23);
		getContentPane().add(btnSalvar);


		tl= new TabelaPadrao("Faltas");
		tl.setBounds(12, 28, 456, 434);
		tl.setColumns(new Object[]{"ID","Nome","CPF","1° Nota","2° Nota","Final"});
		getContentPane().add(tl);


		ct = new ControleTelaRegistrarNotas(this, t);
		btnSalvar.addActionListener(ct);

		addDados(t);
		setVisible(true);

	}
	private void addDados(Turma t){
		ArrayList<SituacaoAlunoDisciplina> a = new ArrayList<SituacaoAlunoDisciplina>(t.getSituacoes());
		for (SituacaoAlunoDisciplina al : a) {
			if (al.getNotas().size()<2) {
				Nota n = new Nota();
				n.setNota(0.0f);
				Nota n1 = new Nota();
				n1.setNota(0.0f);
				Nota n2 = new Nota();
				n2.setNota(0.0f);
				al.getNotas().add(n);
				al.getNotas().add(n1);
				al.getNotas().add(n2);
			}
			this.tl.setRow(new Object[]{al.getAluno().getId(),al.getAluno().getNome(),al.getAluno().getCpf(),al.getNotas().get(0).getNota() ,al.getNotas().get(1).getNota() ,al.getNotas().get(2).getNota() });
		}
	}

	public JButton getBsalvar() {
		return btnSalvar;
	}

	public TabelaPadrao getTl() {
		return tl;
	}
	public void setTl(TabelaPadrao tl) {
		this.tl = tl;
	}
}
