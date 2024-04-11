package ex;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int r = new Random().nextInt(9);
//		int r = (int) (Math.random() * 10);
		if(r % 2 == 1) {
			response.sendRedirect("jsp/redirect.jsp");
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("jsp/forward.jsp");
			dis.forward(request, response);
		}
	}

}
