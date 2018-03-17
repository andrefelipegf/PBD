package br.com.view.aluno;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import br.com.model.vo.Aluno;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDelfosAluno extends JFrame {
	public TelaDelfosAluno(Aluno aluno) {
		setTitle("Tela Delfos Aluno");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Sistema");
		mnFile.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\file.png"));
		menuBar.add(mnFile);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\X.png"));
		mnFile.add(mntmSair);
		
		JMenu mnDisciente = new JMenu("Consulta");
		mnDisciente.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\consulta.png"));
		menuBar.add(mnDisciente);
		
		JMenu mnDetalhadamentoDoDiscente = new JMenu("Detalhadamento do discente");
		mnDisciente.add(mnDetalhadamentoDoDiscente);
		
		JMenuItem mntmInformao = new JMenuItem("Informa\u00E7\u00E3o Pessoais");
		mnDetalhadamentoDoDiscente.add(mntmInformao);
		
		JMenuItem mntmHistrico = new JMenuItem("Hist\u00F3rico");
		mnDetalhadamentoDoDiscente.add(mntmHistrico);
		
		JMenuItem mntmGradeDeHorrio = new JMenuItem("Grade de Hor\u00E1rio");
		mnDetalhadamentoDoDiscente.add(mntmGradeDeHorrio);
		
		JMenu mnServios = new JMenu("Servi\u00E7os");
		mnServios.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\Servi\u00E7os.png"));
		menuBar.add(mnServios);
		
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(desktopPane, "name_194196286904209");
		
		JMenuItem mntmAtualizarDados = new JMenuItem("Atualizar Dados ");
		mntmAtualizarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			TelaAlterarDadosAluno talterar = new TelaAlterarDadosAluno();
			
			desktopPane.add(talterar);
			talterar.show();
			}
		});
		mnServios.add(mntmAtualizarDados);
		
	
		setSize(500,500);
		setLocationRelativeTo(null);
		
		
		
		setVisible(true);
	}
	
}
