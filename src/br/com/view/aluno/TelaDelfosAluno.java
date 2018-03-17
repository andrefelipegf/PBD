package br.com.view.aluno;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import br.com.model.vo.Aluno;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDelfosAluno extends JFrame {

	
	private static final long serialVersionUID = 1L;

	public TelaDelfosAluno(Aluno aluno) {
		setTitle("Tela Delfos Aluno");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu sistema = new JMenu("Sistema");
		JMenuItem logout = new JMenuItem("Logout");
		JMenuItem sair = new JMenuItem("Sair");
		
		JMenu cisciente = new JMenu("Consulta");
		
		JMenu detalhadamentoDoDiscente = new JMenu("Detalhadamento do discente");
		JMenuItem informacao = new JMenuItem("Informações Pessoais");
		JMenuItem histrico = new JMenuItem("Histórico");
		JMenuItem gradeDeHorrio = new JMenuItem("Grade de Horário");

		
		
		
		
		
		sistema.add(sair);
		menuBar.add(cisciente);
		menuBar.add(sistema);
		
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		cisciente.add(detalhadamentoDoDiscente);
		
		detalhadamentoDoDiscente.add(informacao);
		
		
		detalhadamentoDoDiscente.add(histrico);
		
		
		detalhadamentoDoDiscente.add(gradeDeHorrio);
		
		JMenu mnServios = new JMenu("Servi\u00E7os");
		menuBar.add(mnServios);
		
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(desktopPane, "name_194196286904209");
		
		JMenuItem mntmAtualizarDados = new JMenuItem("Alterar Senha ");
		mntmAtualizarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			TelaRedefinicaoSenha talterar = new TelaRedefinicaoSenha(aluno);
			
			desktopPane.add(talterar);
			talterar.show();
			}
		});
		mnServios.add(mntmAtualizarDados);
		
	
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setVisible(true);
	}
	
}
