package br.com.view.professor;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import br.com.model.dao.TurmaDAO;
import br.com.model.vo.Falta;
import br.com.model.vo.Professor;
import br.com.model.vo.Turma;
import br.com.view.aluno.TelaCadastrarDadosAlunos;
import br.com.view.disciplina.TelaCadastrarDisciplina;
import br.com.view.login.TelaLogin;
import br.com.view.turma.TelaCadastroTurma;
import br.com.view.turma.TelaParciais;
import br.com.view.turma.TelaTurma;


public class TelaDelfosProfessor extends JFrame{

	private static final long serialVersionUID = 1L;
	private JMenu turmas;
	private JDesktopPane desktopPane;

	public TelaDelfosProfessor(Professor professor) {

		setTitle("Tela Delfos Professor");

		desktopPane = new JDesktopPane();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(desktopPane, "name_194196286904209");


		//---------------------------> Instancia <---------------------------------------

		JMenu file = new JMenu("Sistema");
		JMenuItem logout = new JMenuItem("Logout");
		JMenuItem sair = new JMenuItem("Sair");

//		JMenu mnCursos = new JMenu("Cursos");

		JMenu cadastros = new JMenu("Cadastro");
		JMenuItem cadastrarProfessor = new JMenuItem("Cadastrar Professor");
		JMenuItem cadastrarAluno = new JMenuItem("Cadastrar Aluno");
		JMenuItem cadastratDisciplina = new JMenuItem("Cadastrar Disciplina");
		JMenuItem cadastrarTurma = new JMenuItem("Cadastrar Turma");

		JMenu mnListaDeAtividades = new JMenu("Lista de Atividades");
		JMenuItem mntmDetalhe = new JMenuItem("Detalhe");

		turmas = new JMenu("Turmas");
		

		JMenuItem resetarAluno = new JMenuItem("Resetar Aluno");


		//------------------> Adição ao meno <--------------------------------------------------


		file.add(logout);
		file.add(sair);

		cadastros.add(cadastrarProfessor);
		cadastros.add(cadastrarAluno);
		cadastros.add(cadastratDisciplina);

		cadastros.add(cadastrarTurma);


		mnListaDeAtividades.add(mntmDetalhe);

		

		menuBar.add(file);
//		menuBar.add(mnCursos);
		menuBar.add(cadastros);
		menuBar.add(mnListaDeAtividades);
		menuBar.add(turmas);
		menuBar.add(resetarAluno);


		//--------------------------> eventos <--------------------------

		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new TelaLogin();
			}
		});

		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}});

		cadastrarProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastrarDadosProfessor tp = new TelaCadastrarDadosProfessor();			
				desktopPane.add(tp);
				tp.show();
			}});

		cadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastrarDadosAlunos tp = new TelaCadastrarDadosAlunos();			
				desktopPane.add(tp);
				tp.show();
			}});

		cadastratDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastrarDisciplina tp = new TelaCadastrarDisciplina();			
				desktopPane.add(tp);
				tp.show();
			}
		});
		
		cadastrarTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroTurma tp = new TelaCadastroTurma();			
				desktopPane.add(tp);
				tp.show();
			}
		});

		

		resetarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAlterarDadosAluno tad = new TelaAlterarDadosAluno();
				desktopPane.add(tad);
				tad.show();
			}
		});
		
		pegarTurmas(professor);
		
		setSize(800,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	private void pegarTurmas(Professor p) {
		ArrayList<Turma> ts = new ArrayList<Turma>(TurmaDAO.getByProfessor(p));
		for (Turma t : ts) {
			JMenuItem mntmTurma = new JMenuItem(t.getDisciplina().getNome()+" "+t.getNome());
			this.turmas.add(mntmTurma);
			
			mntmTurma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TelaTurma tp = new TelaTurma(t);			
					desktopPane.add(tp);
					tp.show();
				}
			});
			
			
			
		}
	}
	
	
	
	
}
