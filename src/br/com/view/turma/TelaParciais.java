package br.com.view.turma;


import javax.swing.JLabel;

import br.com.model.facade.Parciais;
import br.com.model.vo.Turma;

import javax.swing.JFrame;

public class TelaParciais extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel matricula;
	private JLabel reprovado;
	
	private JLabel cursando;
	private JLabel aprorovaMedia;
	private JLabel aprovadofinal;
	private JLabel reprovadoPorMdia;
	private JLabel reprovadoMedia;
	private JLabel teprovadoPorFinal;
	private JLabel reprovadoFinal;
	
	Parciais pa;
	
	public TelaParciais(Turma t) {
		pa = new Parciais(t);
		
		setResizable(true);
		setTitle("Parciais");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reprovados por faltas");
		lblNewLabel.setBounds(182, 10, 122, 17);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Cursando");
		lblNewLabel_2.setBounds(10, 83, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Matriculados");
		lblNewLabel_3.setBounds(10, 11, 66, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Aprovados por  média");
		lblNewLabel_5.setBounds(182, 48, 122, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Aprovados Final");
		lblNewLabel_6.setBounds(181, 83, 105, 14);
		getContentPane().add(lblNewLabel_6);
		
		matricula = new JLabel(pa.getMatriculados()+"");
		matricula.setBounds(86, 8, 86, 20);
		getContentPane().add(matricula);
		
		reprovado = new JLabel(pa.getReprovadosGeral()+"");
		reprovado.setBounds(315, 8, 86, 20);
		getContentPane().add(reprovado);
		
		cursando = new JLabel(pa.getCursando()+"");
		cursando.setBounds(86, 83, 86, 20);
		getContentPane().add(cursando);
		
		aprorovaMedia = new JLabel(pa.getAprovadosPorMedia()+"");
		aprorovaMedia.setBounds(314, 45, 86, 20);
		getContentPane().add(aprorovaMedia);
		
		aprovadofinal = new JLabel(pa.getAprovadosPorFinal()+"");
		aprovadofinal.setBounds(315, 80, 86, 20);
		getContentPane().add(aprovadofinal);
		
		reprovadoPorMdia = new JLabel("Reprovado por  média");
		reprovadoPorMdia.setBounds(182, 125, 122, 14);
		getContentPane().add(reprovadoPorMdia);
		
		reprovadoMedia = new JLabel(pa.getReprovadosPorMedia()+"");
		reprovadoMedia.setBounds(315, 122, 86, 20);
		getContentPane().add(reprovadoMedia);
		
		teprovadoPorFinal = new JLabel("Reprovado por  Final");
		teprovadoPorFinal.setBounds(182, 156, 122, 14);
		getContentPane().add(teprovadoPorFinal);
		
		reprovadoFinal = new JLabel(pa.getReprovadosNaFinal()+"");
		reprovadoFinal.setBounds(315, 153, 86, 20);
		getContentPane().add(reprovadoFinal);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}	
	
}
