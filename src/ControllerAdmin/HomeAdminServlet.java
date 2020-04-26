package ControllerAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entities.Category;
import Entities.Content;
import Model.CategoryModel;
import Model.ContentModel;

/**
 * Servlet implementation class HomeAdminServlet
 */
@WebServlet("/admin")
public class HomeAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		List<Content> content= ContentModel.getAll();
		List<Category> category= CategoryModel.getAll();
		session.setAttribute("category", category);
		session.setAttribute("content", content);
		if (session.getAttribute("admin")!=null) {
			request.getRequestDispatcher("/WEB-INF/viewAdmin/home.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/WEB-INF/viewAdmin/login.jsp").forward(request, response);
		}
	}

}
