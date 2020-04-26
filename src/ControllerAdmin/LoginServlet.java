package ControllerAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entities.Admin;
import Model.LoginAdminModel;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String password=request.getParameter("password");
		Admin admin= LoginAdminModel.SearchInfo(username);
		if (admin!=null&&admin.getPassword().equals(password)) {
			HttpSession session=request.getSession();
			session.setAttribute("admin", admin);
			request.getRequestDispatcher("/WEB-INF/viewAdmin/home.jsp").forward(request, response);
		}
		else {
			request.setAttribute("message", "Username or Password is incorrect!");
			request.getRequestDispatcher("/WEB-INF/viewAdmin/login.jsp").forward(request, response);
		}
	}

}
