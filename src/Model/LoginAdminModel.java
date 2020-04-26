package Model;

import javax.persistence.EntityManager;

import Entities.Admin;
import Utils.JpaUtils;

public class LoginAdminModel {
	public static Admin SearchInfo(String username) {
		EntityManager em= JpaUtils.getEntityManagerFactory().createEntityManager();
		Admin admin= em.find(Admin.class, username);
		em.close();
		return admin;
	}
}
