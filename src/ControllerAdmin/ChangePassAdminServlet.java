package ControllerAdmin;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entities.Admin;
import Model.AdminModel;
import Model.LoginAdminModel;
import Utils.JpaUtils;

/**
 * Servlet implementation class ChangePassAdminServlet
 */
@WebServlet("/ChangePassAdminServlet")
public class ChangePassAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/viewAdmin/changepass.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password= request.getParameter("newpass");
		HttpSession session= request.getSession();
		Admin admin=(Admin) session.getAttribute("admin");
		admin=new Admin(admin.getUsername(),password,admin.getFullname(),admin.getPhone());
		AdminModel.Update(admin);
		session.setAttribute("admin", admin);
		request.getRequestDispatcher("/WEB-INF/viewAdmin/home.jsp").forward(request, response);;
	}

}
