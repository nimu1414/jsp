package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogi;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispacther = request.getRequestDispatcher("WEB-INF/jsp/healthCheck.jsp");
		dispacther.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		HealthCheckLogi healthCheck = new HealthCheckLogi();
		healthCheck.execute(health);

		request.setAttribute("health", health);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/healthCheckRe.jsp");
		dispatcher.forward(request, response);

	}
}
