package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;


import br.com.model.vo.Registro;

@SuppressWarnings("static-access")
public class RegistroDAO {

	public static synchronized void persist(Registro object) {
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
	public static synchronized void remove(Registro object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Registro.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Registro object) {
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

	public static synchronized Registro getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Registro.class, id);
	}

	public static synchronized Registro getByNome(final String nome) {
		Registro a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select Registro from Autor autor where nome = ?");
			query.setParameter(0, nome);
			a = (Registro) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}

		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Registro> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " +Registro.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Registro cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
}
