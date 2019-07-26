package com.naveen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Factoreal extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("n1");
		int x=Integer.parseInt(s1);
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>"+fact+"</h1></body></html>");

	}

}
