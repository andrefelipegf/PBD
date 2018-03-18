package br.com.view.professor;

import javax.swing.JInternalFrame;

import java.awt.BorderLayout;
import javax.swing.JPanel;

import br.com.control.professor.ControleTelaListarAluno;
import br.com.view.falta.TabelaPadrao;

public class TelaListarALunos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private TabelaPadrao tabela;
	private ControleTelaListarAluno controle;
	public TelaListarALunos() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		tabela = new TabelaPadrao("Alunos");
		tabela.setColumns(new Object[]{"ID","Nome","CPF","Código","Matrícula","E-mail","Telefone","Endereço"});
		tabela.podeSelecionar(true);
		getContentPane().add(tabela, BorderLayout.CENTER);
		
		setControle(new ControleTelaListarAluno(this));
		
		
	}
	public TabelaPadrao getTabela() {
		return tabela;
	}
	public ControleTelaListarAluno getControle() {
		return controle;
	}
	public void setControle(ControleTelaListarAluno controle) {
		this.controle = controle;
	}
	
}
