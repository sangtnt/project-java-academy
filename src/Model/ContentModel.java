package Model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Entities.Category;
import Entities.Content;
import Utils.JpaUtils;

public class ContentModel {
	public static List<Content> getAll() {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		String hql="From Content";
		TypedQuery<Content> query=em.createQuery(hql,Content.class);
		List<Content> content=query.getResultList();
		em.close();
		return content;
	}
	public static void Insert(Content content) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(content);
			em.getTransaction().commit();
			em.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Content> getType(int catid) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		String hql="From Content Where category.id='"+catid+"'";
		TypedQuery<Content> query=em.createQuery(hql,Content.class);
		List<Content> content=query.getResultList();
		em.close();
		return content;
	}
}
