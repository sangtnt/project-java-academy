package ControllerAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entities.Admin;
import Model.AdminModel;

/**
 * Servlet implementation class UpdateAccountServlet
 */
@WebServlet("/UpdateAccountServlet")
public class UpdateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/viewAdmin/infoAdmin.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname");
		String username=request.getParameter("username");
		String phone=request.getParameter("phone");
		HttpSession session = request.getSession();
		Admin admin= (Admin) session.getAttribute("admin");
		admin=new Admin(username,admin.getPassword(),fullname,phone);
		AdminModel.Update(admin);
		session.setAttribute("admin", admin);
		request.getRequestDispatcher("/WEB-INF/viewAdmin/home.jsp").forward(request, response);
	}

}
