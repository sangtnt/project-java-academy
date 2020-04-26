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
import Model.CategoryModel;

/**
 * Servlet implementation class DeleteCatServlet
 */
@WebServlet("/DeleteCatServlet")
public class DeleteCatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		CategoryModel.Delete(id);
		List<Category> category= CategoryModel.getAll();
		HttpSession session= request.getSession();
		session.setAttribute("category", category);
		request.getRequestDispatcher("/WEB-INF/viewAdmin/category.jsp").forward(request, response);
	}

}
