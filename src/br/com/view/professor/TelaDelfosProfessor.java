package br.com.view.professor;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import br.com.model.vo.Professor;

import javax.swing.ImageIcon;

public class TelaDelfosProfessor extends JFrame{
	public TelaDelfosProfessor(Professor professor) {
		setTitle("Tela Delfos Professor");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAluno = new JMenu("File");
		mnAluno.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\file.png"));
		menuBar.add(mnAluno);
		
		JMenuItem mntmLogr = new JMenuItem("Logout");
		mnAluno.add(mntmLogr);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\X.png"));
		mnAluno.add(mntmSair);
		
		JMenu mnCursos = new JMenu("Cursos");
		mnCursos.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\cursos.png"));
		menuBar.add(mnCursos);
		
		JMenu mnCalendrio = new JMenu("Calend\u00E1rio");
		mnCalendrio.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\calend\u00E1rio.png"));
		menuBar.add(mnCalendrio);
		
		JMenuItem mntmResgistrarContedo = new JMenuItem("Previsao de aulas");
		mnCalendrio.add(mntmResgistrarContedo);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCadastrarProfessor = new JMenuItem("Cadastrar Professor");
		mnCadastro.add(mntmCadastrarProfessor);
		
		JMenuItem mntmCadastrarAluno = new JMenuItem("Cadastrar Aluno");
		mnCadastro.add(mntmCadastrarAluno);
		
		JMenuItem mntmDisciplina = new JMenuItem("Cadastrar Disciplina");
		mnCadastro.add(mntmDisciplina);
		
		JMenuItem mntmCadastrarTurma = new JMenuItem("Cadastrar Turma");
		mnCadastro.add(mntmCadastrarTurma);
		
		JMenu mnDisciplina = new JMenu("Disciplina");
		mnDisciplina.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\disciplina.png"));
		menuBar.add(mnDisciplina);
		
		JMenuItem mntmAtualizar = new JMenuItem("Cadastrar Aluno");
		mnDisciplina.add(mntmAtualizar);
		
		JMenu mnAulas = new JMenu("Registro");
		mnAulas.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\registro.png"));
		menuBar.add(mnAulas);
		
		JMenu mnTurmas = new JMenu("Turmas");
		mnAulas.add(mnTurmas);
		
		JMenu mnDepartamento = new JMenu("Departamento");
		mnDepartamento.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\departamento.png"));
		menuBar.add(mnDepartamento);
		
		JMenuItem mntmDeprtamento = new JMenuItem("Deprtamento");
		mnDepartamento.add(mntmDeprtamento);
		
		JMenu mnListaDeAtividades = new JMenu("Lista de Atividades");
		mnListaDeAtividades.setIcon(new ImageIcon("C:\\Users\\gouveia\\Pictures\\imagens java\\lista.png"));
		menuBar.add(mnListaDeAtividades);
		
		JMenuItem mntmDetalhe = new JMenuItem("Detalhe");
		mnListaDeAtividades.add(mntmDetalhe);
		
		JMenu mnTurma = new JMenu("Turma");
		menuBar.add(mnTurma);
		setVisible(true);
	}

}
