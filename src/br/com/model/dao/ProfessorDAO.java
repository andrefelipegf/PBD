package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.vo.Aluno;
import br.com.model.vo.Professor;

@SuppressWarnings("static-access")
public class ProfessorDAO {

	public static synchronized void persist(Professor object) {
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
	
	public static synchronized void remove(Professor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Professor.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	
	public static synchronized void merge(Professor object) {
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
	
	public static synchronized Professor getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Professor.class, id);
	}
	
	public static synchronized Professor getByNome(final String nome) {
		Professor a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select professor from Professor professor where nome = ?");
            query.setParameter(0, nome);
            a = (Professor) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return a;
	}
	
	public static synchronized Professor getBycpf(final String nome) {
		Professor a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select professor from Professor professor where cpf = ?");
            query.setParameter(0, nome);
            a = (Professor) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Professor> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Professor.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Professor cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
