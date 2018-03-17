package br.com.model.facade;

import java.util.Date;

import br.com.model.dao.TurmaDAO;
import br.com.model.vo.Registro;
import br.com.model.vo.Turma;

public class RegistrarFacade {

	@SuppressWarnings("finally")
	
	public boolean registrarAula(Turma turma,Date data, String registroS) {
		try {		
			
			Registro registro = new Registro();
			registro.setData(data);
			registro.setRegistro(registroS);
			turma.getRegistro().add(registro);
			
			TurmaDAO.merge(turma);
		} catch (Exception e) {
			return false;
		} finally {
			return true;
		}
	}
	
	
	
	
	
}
