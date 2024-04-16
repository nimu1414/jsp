package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.keisan;
import model.keisanLogi;

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
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/NewFile.jsp");
		dispatcher.forward(request, response);
		String price = request.getParameter("syohin");
		String kosuu = request.getParameter("kosuu");
		String kaikei = request.getParameter("kaikei");

		keisan keisan = new keisan();
		keisan.setPrice(Integer.parseInt(price));
		keisan.setKosuu(Integer.parseInt(kosuu));
		keisan.setKaikei(Integer.parseInt(kaikei));

		keisanLogi keisanLogi = new keisanLogi();
		keisanLogi.execute(keisan);
		request.setAttribute("keisan", keisan);
		RequestDispatcher dis = request.getRequestDispatcher("jsp/keisanRe.jsp");
		dis.forward(request, response);
	}

}
