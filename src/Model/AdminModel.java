package Model;

import javax.persistence.EntityManager;

import Entities.Admin;
import Utils.JpaUtils;

public class AdminModel {
	public static void Update(Admin admin) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(admin);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
