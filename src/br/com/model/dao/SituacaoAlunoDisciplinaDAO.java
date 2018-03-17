package br.com.model.dao;

import java.util.List;
import javax.persistence.Query;
import br.com.model.vo.SituacaoAlunoDisciplina;


@SuppressWarnings("static-access")
public class SituacaoAlunoDisciplinaDAO {
	public static synchronized void persist(SituacaoAlunoDisciplina object) {
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
	public static synchronized void remove(SituacaoAlunoDisciplina object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(SituacaoAlunoDisciplina.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(SituacaoAlunoDisciplina object) {
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

	public static synchronized SituacaoAlunoDisciplina getById(final int id) {
		return Connection.getInstance().getEntityManager().find(SituacaoAlunoDisciplina.class, id);
	}

	public static synchronized SituacaoAlunoDisciplina getByNome(final String nome) {
		SituacaoAlunoDisciplina a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select SituacaoAlunoDisciplina from Autor autor where nome = ?");
			query.setParameter(0, nome);
			a = (SituacaoAlunoDisciplina) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}

		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<SituacaoAlunoDisciplina> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " +SituacaoAlunoDisciplina.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			SituacaoAlunoDisciplina cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
