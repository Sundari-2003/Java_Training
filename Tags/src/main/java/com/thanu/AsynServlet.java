package com.thanu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsynServlet
 */
@WebServlet(urlPatterns="/async",asyncSupported=true)
public class AsynServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final long startTime=System.nanoTime();
		final AsyncContext context=request.startAsync(request,response);
		
		new Thread()
		{
			@Override
			public void run()
			{
				try
				{
					ServletResponse res=context.getResponse();
					response.setContentType("text/html");
					PrintWriter out=response.getWriter();
					
					out.println("work completed.time elapsed: "+System.nanoTime());
					out.flush();
					context.complete();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}.start();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
