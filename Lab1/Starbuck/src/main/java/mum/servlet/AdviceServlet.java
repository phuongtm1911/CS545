package mum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.data.*;
 
/**
 * Servlet implementation class AdviceServlet
 */
@WebServlet("/AdviceServlet")
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdviceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roast = request.getParameter("roast");

		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		List<String> advice = data.getAdvice(roast);
		String adviceOutput = prepareAdviceOutput(roast, advice);
		request.setAttribute("roast", roast.toUpperCase());
		request.setAttribute("advice", adviceOutput);

		RequestDispatcher dispatcher = request.getRequestDispatcher("../display.jsp");
		dispatcher.forward(request, response);
	}
	
	private String prepareAdviceOutput(String roast, List<String> advice) {
		StringBuilder sb = new StringBuilder();
		sb.append("<table>\n");
		for( int i=0;i<advice.size();i++) {
			if (i%2 == 0)  sb.append("<tr style=\"background-color:cyan\">");
			else sb.append("<tr style=\"background-color:yellow\">");
			sb.append("<td>" + advice.get(i) + "</td></tr>\n");
		}
		sb.append("</table>\n");
		return sb.toString();
	}

}
