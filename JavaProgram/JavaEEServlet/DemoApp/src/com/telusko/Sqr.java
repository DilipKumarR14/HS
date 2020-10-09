package com.telusko;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

public class Sqr extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		
	
		HttpSession session = req.getSession();
		
		int k =(int)session.getAttribute("k");
		
		k=k*k;
		resp.getWriter().print(k);
		
	}
}
