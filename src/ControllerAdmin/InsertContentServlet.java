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
 * Servlet implementation class InsertContentServlet
 */
@WebServlet("/InsertContentServlet")
public class InsertContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String word= request.getParameter("word");
		String meaning=request.getParameter("meaning");
		int catid=Integer.parseInt(request.getParameter("category"));
		Category cat= CategoryModel.getDetail(catid);
		ContentModel.Insert(new Content(0, word, meaning, cat));
		HttpSession session=request.getSession();
		List<Content> content= ContentModel.getAll();
		List<Category> category= CategoryModel.getAll();
		session.setAttribute("category", category);
		session.setAttribute("content", content);
		request.getRequestDispatcher("/WEB-INF/viewAdmin/home.jsp").forward(request, response);
	}

}