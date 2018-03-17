package br.com.view.registro;


import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.control.registro.ControleTelaCadastrarRegistro;
import br.com.model.vo.SituacaoAlunoDisciplina;
import br.com.model.vo.Turma;
import br.com.view.falta.TabelaPadrao;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaCadastrarRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textAssunto;
	private JTextField textData;
	private JTextField textMes;
	
	private JButton btnSalvar;
	
	private ControleTelaCadastrarRegistro ct;
	
	private TabelaPadrao tl;
	
	public TelaCadastrarRegistro(Turma t) {
		
		setResizable(true);
		setTitle("Regstro de Aula");
		 setSize(500,800);
		 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 
		 getContentPane().setLayout(null);
		
		textAssunto = new JTextField();
		textAssunto.setBounds(130, 11, 185, 70);
		getContentPane().add(textAssunto);
		textAssunto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ASSUNTO DA AULA");
		lblNewLabel.setBounds(10, 11, 110, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDia = new JLabel("DIA");
		lblDia.setBounds(10, 86, 46, 14);
		getContentPane().add(lblDia);
		
		textData = new JTextField();
		textData.setBounds(140, 83, 86, 20);
		getContentPane().add(textData);
		textData.setColumns(10);
		
		JLabel lblMs = new JLabel("M\u00CAS");
		lblMs.setBounds(10, 117, 46, 14);
		getContentPane().add(lblMs);
		
		textMes = new JTextField();
		textMes.setBounds(140, 114, 86, 20);
		getContentPane().add(textMes);
		textMes.setColumns(10);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(194, 589, 89, 23);
		getContentPane().add(btnSalvar);
	
		
		tl= new TabelaPadrao("Faltas");
		tl.setBounds(10, 143, 456, 434);
		tl.setColumns(new Object[]{"ID","Nome","CPF","Faltou","Justificou"});
		getContentPane().add(tl);
	

		ct = new ControleTelaCadastrarRegistro(this, t);
		btnSalvar.addActionListener(ct);
		
		addDados(t);
		setVisible(true);
		
		
	}
	private void addDados(Turma t){
		ArrayList<SituacaoAlunoDisciplina> a = new ArrayList<SituacaoAlunoDisciplina>(t.getSituacoes());
		for (SituacaoAlunoDisciplina al : a) {
			this.tl.setRow(new Object[]{al.getAluno().getId(),al.getAluno().getNome(),al.getAluno().getCpf(), "", "" });
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
	public void setBsalvar(JButton bsalvar) {
		this.btnSalvar = bsalvar;
	}


	public JTextField getTextAssunto() {
		return textAssunto;
	}


	public void setTextAssunto(JTextField textAssunto) {
		this.textAssunto = textAssunto;
	}


	public JTextField getTextData() {
		return textData;
	}


	public void setTextData(JTextField textData) {
		this.textData = textData;
	}


	public JTextField getTextMes() {
		return textMes;
	}


	public void setTextMes(JTextField textMes) {
		this.textMes = textMes;
	}
}
