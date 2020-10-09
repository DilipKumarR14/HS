package com.telusko;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;

public class Sqr extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		
	
		/**
		 * session way
		 */
//		HttpSession session = req.getSession();
//		
//		int k =(int)session.getAttribute("k");
		
//		k=k*k;
		
		/**
		 * Cookie way
		 */
		Cookie cookie[] = req.getCookies();
		String i  = null;
		for(Cookie c : cookie) {
			if(c.getName().equals("cookieValue")) {
				 i = c.getValue();
			}
		}
		
		
		resp.getWriter().print("In the sqroot class : "+i);
		
	}
}
