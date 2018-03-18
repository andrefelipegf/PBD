package br.com.control.registro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.model.facade.RegistrarFacade;
import br.com.model.vo.Falta;
import br.com.model.vo.Turma;
import br.com.view.registro.TelaCadastrarRegistro;

public class ControleTelaCadastrarRegistro implements ActionListener{
	TelaCadastrarRegistro tlr;
	RegistrarFacade rf;
	Turma t;

	public ControleTelaCadastrarRegistro(TelaCadastrarRegistro tela, Turma t) {
		tlr = tela;
		rf  = new RegistrarFacade ();
		this.t = t;
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tlr.getBsalvar()) {
			try {
				Date dt = new Date();
				dt.setMonth(Integer.parseInt(tlr.getTextMes().getText()));
				dt.setDate(Integer.parseInt(tlr.getTextData().getText()) );
				int linhas = tlr.getTl().getTable().getRowCount();
				for (int i = 0; i < linhas; i++) {
					String f = (String)tlr.getTl().getTable().getValueAt(i, 3);
					String j = (String)tlr.getTl().getTable().getValueAt(i, 4);
					Falta fa = new Falta();
					fa.setData(dt);

					if(f.equals("f") || f.equals("F")) {
						fa.setFalta(true);
					}else {
						fa.setFalta(false);
					}

					if(j.equals("f") || j.equals("F")) {
						fa.setJustificado(true);
					}else {
						fa.setJustificado(false);
					}

					t.getSituacoes().get(i).getFaltas().add(fa);
				}

				rf.registrarAula(this.t, dt, tlr.getTextAssunto().getText());
				JOptionPane.showMessageDialog(tlr, "Registrou");
				tlr.dispose();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(tlr, "Erro no Registro");
			}
			

		}
	}
}
