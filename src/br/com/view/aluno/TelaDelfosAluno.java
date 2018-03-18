package br.com.view.aluno;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import br.com.model.vo.Aluno;
import br.com.view.login.TelaLogin;

import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDelfosAluno extends JFrame {


	private static final long serialVersionUID = 1L;

	public TelaDelfosAluno(Aluno aluno) {
		setTitle("Tela Delfos Aluno");

		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(desktopPane, "name_194196286904209");

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu sistema = new JMenu("Sistema");
		JMenuItem logout = new JMenuItem("Logout");
		JMenuItem sair = new JMenuItem("Sair");

		JMenu consulta = new JMenu("Consulta");

		JMenu detalhadamentoDoDiscente = new JMenu("Detalhadamento do discente");
		JMenuItem informacao = new JMenuItem("Informações Pessoais");
		JMenuItem historico = new JMenuItem("Histórico");
		JMenuItem notasSemestre = new JMenuItem("Notas Pos Semestre");
		JMenuItem disciplinaMatriculada = new JMenuItem("Disciplina Matriculadas");
		
		JMenu servicos = new JMenu("Serviços");
		JMenuItem alterarSenha = new JMenuItem("Alterar Senha ");

		//-------------------------> Add <----------------------------

		sistema.add(logout);
		sistema.add(sair);

		detalhadamentoDoDiscente.add(informacao);
		detalhadamentoDoDiscente.add(historico);
		detalhadamentoDoDiscente.add(notasSemestre);
		detalhadamentoDoDiscente.add(disciplinaMatriculada);
		consulta.add(detalhadamentoDoDiscente);


		servicos.add(alterarSenha);

		menuBar.add(sistema);
		menuBar.add(consulta);
		menuBar.add(servicos);


		//--------------------------------> Evento <------------

		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new TelaLogin();
			}
		});

		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		informacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaDadosAluno talterar = new TelaDadosAluno(aluno);
				desktopPane.add(talterar);
				talterar.show();
			}
		});

		historico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaHistorico talterar = new TelaHistorico(aluno);
				desktopPane.add(talterar);
				talterar.show();
			}
		});
		notasSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaNotasSemestre talterar = new TelaNotasSemestre(aluno);
				desktopPane.add(talterar);
				talterar.show();
			}
		});
		disciplinaMatriculada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaDisciplinasMatriculadas talterar = new TelaDisciplinasMatriculadas(aluno);
				desktopPane.add(talterar);
				talterar.show();
			}
		});

		alterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaRedefinicaoSenha talterar = new TelaRedefinicaoSenha(aluno);
				desktopPane.add(talterar);
				talterar.show();
			}
		});

		setSize(800,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setVisible(true);
	}

}
