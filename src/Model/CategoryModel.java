package Model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Entities.Category;
import Utils.JpaUtils;

public class CategoryModel {
	public static List<Category> getAll() {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		String hql="From Category";
		TypedQuery<Category> query=em.createQuery(hql,Category.class);
		List<Category> category=query.getResultList();
		em.close();
		return category;
	}
	public static void Insert(Category category) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(category);
			em.getTransaction().commit();
			em.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void Delete(int id) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		Category cat= em.find(Category.class, id);
		try {
			em.getTransaction().begin();
			em.remove(cat);
			em.getTransaction().commit();
			em.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Category getDetail(int id) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		Category category =em.find(Category.class, id);
		return category;
	}
}
