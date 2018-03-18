package br.com.view.turma;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.control.turma.ControleTelaCadastroTurma;
import br.com.view.falta.TabelaPadrao;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCadastroTurma extends JInternalFrame{

	private static final long serialVersionUID = 1L;
	private JTextField semestre;
	
	private TabelaPadrao tabelaAlunos;
	
	private JButton salvarB;
	private JTextField textField;
	private JTextField textField_1;
	
	@SuppressWarnings("rawtypes")
	private JComboBox professor;
	@SuppressWarnings("rawtypes")
	private JComboBox disciplina;
	
	private ControleTelaCadastroTurma controle;
	private JTextField horario;
	
	@SuppressWarnings("rawtypes")
	public TelaCadastroTurma() {
		getContentPane().setLayout(null);

		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setBounds(12, 12, 91, 15);
		getContentPane().add(lblSemestre);

		semestre = new JTextField();
		semestre.setBounds(100, 10, 114, 19);
		getContentPane().add(semestre);
		semestre.setColumns(10);

		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setBounds(12, 66, 91, 15);
		getContentPane().add(lblProfessor);

		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setBounds(12, 93, 91, 15);
		getContentPane().add(lblDisciplina);

		tabelaAlunos = new TabelaPadrao("Alunos");
		tabelaAlunos.setColumns(new Object[]{"ID","Nome","CPF","Código","Matrícula","E-mail","Telefone","Endereço"});
		tabelaAlunos.setBounds(12, 160, 771, 321);
		tabelaAlunos.podeSelecionar(true);
		getContentPane().add(tabelaAlunos);

		JLabel lblIncio = new JLabel("Início:");
		lblIncio.setBounds(12, 133, 70, 15);
		getContentPane().add(lblIncio);

		JLabel lblTermino = new JLabel("Termino:");
		lblTermino.setBounds(100, 133, 70, 15);
		getContentPane().add(lblTermino);

		salvarB = new JButton("Salvar");
		salvarB.setBounds(303, 544, 117, 47);
		getContentPane().add(salvarB);
		
		disciplina = new JComboBox();
		disciplina.setBounds(113, 97, 101, 24);
		getContentPane().add(disciplina);
		
		professor = new JComboBox();
		professor.setBounds(113, 61, 101, 24);
		getContentPane().add(professor);
		
		JLabel lblHorrio = new JLabel("Horário:");
		lblHorrio.setBounds(258, 14, 70, 15);
		getContentPane().add(lblHorrio);
		
		horario = new JTextField();
		horario.setBounds(346, 10, 114, 19);
		getContentPane().add(horario);
		horario.setColumns(10);
		
		controle = new ControleTelaCadastroTurma(this);
		salvarB.addActionListener(controle);
		
		setSize(805, 700);
		setVisible(true);
	}

	public JTextField getSemestre() {
		return semestre;
	}

	public void setSemestre(JTextField semestre) {
		this.semestre = semestre;
	}

	public JButton getSalvarB() {
		return salvarB;
	}

	public void setSalvarB(JButton salvarB) {
		this.salvarB = salvarB;
	}

	public TabelaPadrao getTabelaAlunos() {
		return tabelaAlunos;
	}

	public void setTabelaAlunos(TabelaPadrao tabelaAlunos) {
		this.tabelaAlunos = tabelaAlunos;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getProfessor() {
		return professor;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getDisciplina() {
		return disciplina;
	}

	public JTextField getHorario() {
		return horario;
	}
}
