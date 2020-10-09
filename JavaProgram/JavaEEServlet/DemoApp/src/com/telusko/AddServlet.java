package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	/**
	 * method belong to servlet life cycle
	 * we cannot use other method name
	 * 
	 * Even if we call the doPost or doGet, servlet will
	 * call "service" methods internally
	 * @throws ServletException 
	 * @throws IOException 
	 */
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		int sum = num1 + num2;
		System.out.println("result is "+sum);

		request.setAttribute("sum", sum);
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("k", sum);

//		response.sendRedirect("sqroo");


		RequestDispatcher rd = request.getRequestDispatcher("sqroo");
		rd.forward(request, response);

		//		res.getWriter().print(sum);

	}
}