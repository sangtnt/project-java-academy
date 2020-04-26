package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entities.Content;
import Entities.RandomList;
import Model.ContentModel;

/**
 * Servlet implementation class ContentRandomServlet
 */
@WebServlet("/ContentRandomServlet")
public class ContentRandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int catid=Integer.parseInt(request.getParameter("catid"));
		List<Content> contentList= ContentModel.getType(catid);
		Content content=RandomList.Random(contentList);
		HttpSession session= request.getSession();
		session.setAttribute("catid", catid);
		request.setAttribute("content", content);
		request.getRequestDispatcher("/WEB-INF/view/ContentRan.jsp").forward(request, response);
	}

}
