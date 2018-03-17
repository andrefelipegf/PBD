package br.com.control.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.facade.UsuarioFacade;
import br.com.model.vo.ObjetoReturn;
import br.com.view.aluno.TelaDelfosAluno;
import br.com.view.login.TelaLogin;
import br.com.view.professor.TelaDelfosProfessor;

public class TelaLoginController implements ActionListener {


	private TelaLogin tela;
	private UsuarioFacade uf;


	public TelaLoginController(TelaLogin tela) {
		this.tela = tela;
		this.uf = new UsuarioFacade();


		// TODO Auto-generated constructor stub
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tela.getLoginButton()){
			String cpf= tela.getCpfField().getText();
			char[] chars = this.tela.getTxtsenha().getPassword();  
			String senha = String.valueOf(chars);  
			ObjetoReturn objr = uf.verificarLogin(cpf, senha);
			System.out.println(objr.isPodelogar());
			if(objr.isPodelogar()) {
				if(objr.isEaluno()) {
					new TelaDelfosAluno(objr.getAluno());
					this.tela.setVisible(false);
					return;
				}
				else if(objr.isEprofessor()) {
					new TelaDelfosProfessor(objr.getProfessor());
					this.tela.setVisible(false);
					return;
				}
			}
			
			System.out.println(" Senha ou Nome invalidos, por favor tente novamente");
			JOptionPane.showMessageDialog(tela," Senha ou Nome invalidos, por favor tente novamente" );
		}

	}

}
