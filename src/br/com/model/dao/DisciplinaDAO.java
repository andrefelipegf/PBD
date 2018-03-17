package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;


import br.com.model.vo.Disciplina;

@SuppressWarnings("static-access")
public class DisciplinaDAO {

	public static synchronized void persist(Disciplina object) {
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
	public static synchronized void remove(Disciplina object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Disciplina.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Disciplina object) {
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
	
	public static synchronized Disciplina getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Disciplina.class, id);
	}
	
	public static synchronized Disciplina getByNome(final String nome) {
		Disciplina a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select Disciplina from Autor autor where nome = ?");
            query.setParameter(0, nome);
            a = (Disciplina) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Disciplina> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " +Disciplina.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Disciplina cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
}
