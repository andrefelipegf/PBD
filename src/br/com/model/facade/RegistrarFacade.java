package br.com.model.facade;

import java.util.Date;

import br.com.model.dao.DisciplinaDAO;
import br.com.model.vo.Disciplina;
import br.com.model.vo.Registro;

public class RegistrarFacade {

	@SuppressWarnings("finally")
	
	public boolean registrarAula(Disciplina disciplina,Date data, String registroS) {
		try {		
			
			Registro registro = new Registro();
			registro.setData(data);
			registro.setRegistro(registroS);
			disciplina.getRegistro().add(registro);
			
			DisciplinaDAO.merge(disciplina);
		} catch (Exception e) {
			return false;
		} finally {
			return true;
		}
	}
	
	
	
	
	
}
