package com.naveen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sum extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String num1=request.getParameter("n1");
		
		String num2=request.getParameter("n2");
		
		int x=Integer.parseInt(num1);
		int y=Integer.parseInt(num2);
		int sum=x+y;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>"+sum+"</h1></body></html>");
		
		

	}

}
