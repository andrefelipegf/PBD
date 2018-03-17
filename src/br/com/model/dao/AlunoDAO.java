package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.vo.Aluno;

@SuppressWarnings("static-access")
public class AlunoDAO {
	public static synchronized void persist(Aluno object) {
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
	public static synchronized void remove(Aluno object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Aluno.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Aluno object) {
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
	
	public static synchronized Aluno getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Aluno.class, id);
	}
	
	public static synchronized Aluno getByNome(final String nome) {
		Aluno a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select autor from Autor autor where nome = ?");
            query.setParameter(0, nome);
            a = (Aluno) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return a;
	}
	public static synchronized Aluno getBycpf(final String nome) {
		Aluno a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select aluno from Aluno aluno where cpf = ?");
            query.setParameter(0, nome);
            a = (Aluno) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Aluno> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Aluno.class.getName()).getResultList();
	}
	public static synchronized void removeById(final int id) {
		try {
			Aluno cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
