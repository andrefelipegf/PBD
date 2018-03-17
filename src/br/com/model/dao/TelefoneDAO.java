package br.com.model.dao;


import java.util.List;

import javax.persistence.Query;

import br.com.model.vo.Telefone;

@SuppressWarnings("static-access")
public class TelefoneDAO {
	
	public static synchronized void persist(Telefone object) {
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
	public static synchronized void remove(Telefone object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Telefone.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Telefone object) {
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

	public static synchronized Telefone getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Telefone.class, id);
	}

	public static synchronized Telefone getByNome(final String nome) {
		Telefone a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select Telefone from Autor autor where nome = ?");
			query.setParameter(0, nome);
			a = (Telefone) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}

		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Telefone> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " +Telefone.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Telefone cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
	
	

}
