package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;


import br.com.model.vo.Falta;

@SuppressWarnings("static-access")
public class FaltaDAO {

	public static synchronized void persist(Falta object) {
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
	public static synchronized void remove(Falta object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Falta.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Falta object) {
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
	
	public static synchronized Falta getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Falta.class, id);
	}
	
	public static synchronized Falta getByNome(final String nome) {
		Falta a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select Falta from Autor autor where nome = ?");
            query.setParameter(0, nome);
            a = (Falta) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Falta> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " +Falta.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Falta cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
}
