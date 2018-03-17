package br.com.view.turma;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import br.com.control.turma.ControleTelaTurma;
import br.com.model.facade.ParciaisAluno;
import br.com.model.vo.Falta;
import br.com.model.vo.SituacaoAlunoDisciplina;
import br.com.model.vo.Turma;
import br.com.view.falta.TabelaPadrao;

public class TelaTurma extends JInternalFrame{

	private static final long serialVersionUID = 1L;

	private JLabel semestre;
	private JLabel professor;
	private JLabel disciplina;
	
	private Turma t;
	
	private TabelaPadrao tabelaAlunos;
	
	private JButton rAula;
	private JButton rObservaes;
	private JButton rNotas;
	private JButton parciais;
	
	private int qt;
	
	private ControleTelaTurma c;
	
	public TelaTurma(Turma t) {
		this.t = t;
		
		qt = t.getRegistro().size();
		
		
		getContentPane().setLayout(null);

		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setBounds(12, 12, 91, 15);
		getContentPane().add(lblSemestre);

		semestre = new JLabel(t.getNome());
		semestre.setBounds(100, 10, 138, 19);
		getContentPane().add(semestre);

		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setBounds(12, 66, 91, 15);
		getContentPane().add(lblProfessor);

		professor = new JLabel(t.getProfessor().getNome());
		professor.setBounds(113, 61, 42, 24);
		getContentPane().add(professor);

		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setBounds(12, 93, 91, 15);
		getContentPane().add(lblDisciplina);

		disciplina = new JLabel(t.getDisciplina().getNome());
		disciplina.setBounds(113, 97, 52, 24);
		getContentPane().add(disciplina);

		tabelaAlunos = new TabelaPadrao("Alunos");
		tabelaAlunos.setColumns(new Object[]{"ID","Nome","CPF","Matrícula","E-mail","Faltas","Justificadas","Média","Situação"});
		tabelaAlunos.setBounds(12, 198, 790, 133);
		getContentPane().add(tabelaAlunos);
		
		addDados(t);
		
		JLabel lblIncio = new JLabel("Carga Horária:");
		lblIncio.setBounds(12, 133, 70, 15);
		getContentPane().add(lblIncio);

		JLabel lblTermino = new JLabel("Quantidade de Aulas:");
		lblTermino.setBounds(12, 159, 70, 15);
		getContentPane().add(lblTermino);
		
		rAula = new JButton("Registrar Aula");
		rAula.setBounds(309, 24, 217, 25);
		getContentPane().add(rAula);
		
		rObservaes = new JButton("Registrar Observações");
		rObservaes.setBounds(309, 56, 217, 25);
		getContentPane().add(rObservaes);
		
		rNotas = new JButton("Registrar Notas");
		rNotas.setBounds(309, 88, 217, 25);
		getContentPane().add(rNotas);
		
		parciais = new JButton("Parciais");
		parciais.setBounds(309, 123, 217, 25);
		getContentPane().add(parciais);
		
		JLabel ch = new JLabel((this.qt * 4)+" Horas");
		ch.setBounds(106, 133, 70, 15);
		getContentPane().add(ch);
		
		JLabel qt = new JLabel(""+this.qt);
		qt.setBounds(116, 159, 70, 15);
		getContentPane().add(qt);
		
		c = new ControleTelaTurma(this);
		rAula.addActionListener(c);
		rNotas.addActionListener(c);
		rObservaes.addActionListener(c);
		parciais.addActionListener(c);
		
		setSize(800, 500);
		setVisible(true);
	}

	private void addDados(Turma t){
		ArrayList<SituacaoAlunoDisciplina> a = new ArrayList<SituacaoAlunoDisciplina>(t.getSituacoes());
		int na = t.getRegistro().size();
		for (SituacaoAlunoDisciplina al : a) {
			int faltas = 0;
			int faltasJ = 0;
			ArrayList<Falta> f = new ArrayList<Falta>(al.getFaltas());
			for (Falta falta : f) {
				if (falta.isFalta()) {
					faltas ++;
					if(falta.isJustificado()){
						faltasJ++;
					}
				}
			}
			
			ParciaisAluno pa = new ParciaisAluno(al,na);
			al.setSituacao(pa.getSituacao());
			
			float media = 0f;
			if(pa.isReprovouFalta()||pa.isReprovouGeral()) {
				media = pa.getMediaParcial();
			}else if (pa.isFezFinal()) {
				media = pa.getMediaFinal();
			}else {
				media = pa.getMediaParcial();
			}
			
			this.tabelaAlunos.setRow(new Object[]{al.getAluno().getId(),al.getAluno().getNome(),al.getAluno().getCpf(), al.getAluno().getMatricula() ,al.getAluno().getEmail(),faltas,faltasJ, media,al.getSituacao()});
		}
	}
	
	public TabelaPadrao getTabelaAlunos() {
		return tabelaAlunos;
	}

	public Turma getT() {
		return t;
	}

	//-----------------------------------------get e set-------------------------------
	
	public void setT(Turma t) {
		this.t = t;
	}

	public JButton getrAula() {
		return rAula;
	}

	public void setrAula(JButton rAula) {
		this.rAula = rAula;
	}

	public JButton getrObservaes() {
		return rObservaes;
	}

	public void setrObservaes(JButton rObservaes) {
		this.rObservaes = rObservaes;
	}

	public JButton getrNotas() {
		return rNotas;
	}

	public void setrNotas(JButton rNotas) {
		this.rNotas = rNotas;
	}

	public JButton getParciais() {
		return parciais;
	}

	public void setParciais(JButton parciais) {
		this.parciais = parciais;
	}
}
