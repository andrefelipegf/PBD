package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.vo.Professor;
import br.com.model.vo.Turma;

@SuppressWarnings("static-access")
public class TurmaDAO {

	public static synchronized void persist(Turma object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void remove(Turma object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Turma.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Turma object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	
	public static synchronized Turma getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Turma.class, id);
	}
	
	public static synchronized Turma getByNome(final String nome) {
		Turma a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select Turma from Turma Turma where nome = ?");
            query.setParameter(0, nome);
            a = (Turma) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Turma> getByProfessor(Professor p) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select Turma from Turma Turma where professor_id = ?");
            query.setParameter(0, p.getId());
			Connection.getInstance().getEntityManager().getTransaction().commit();
			return query.getResultList();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return null;
		
	}
	
	@SuppressWarnings( "unchecked")
	public static synchronized List<Turma> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " +Turma.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Turma cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
}
