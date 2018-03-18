package br.com.control.turma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.view.observacao.TelaRegistrarObservacao;
import br.com.view.professor.TelaRegistrarNotas;
import br.com.view.registro.TelaCadastrarRegistro;
import br.com.view.turma.TelaParciais;
import br.com.view.turma.TelaTurma;

public class ControleTelaTurma implements ActionListener{
	
	private TelaTurma t;
	
	public ControleTelaTurma(TelaTurma t) {
		this.t=t;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == t.getrAula()) {
			new TelaCadastrarRegistro(t.getT());
		}else if(e.getSource() == t.getrNotas()){
			new TelaRegistrarNotas(t.getT());
		}else if(e.getSource() == t.getrObservaes()){
			new TelaRegistrarObservacao(t.getT());
		}else if(e.getSource() == t.getParciais()){
			new TelaParciais(t.getT());
		}
	}
}
