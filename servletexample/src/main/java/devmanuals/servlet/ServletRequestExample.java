package devmanuals.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestExample extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<br>getAuthType()- "+request.getAuthType());
		out.println("<br>getDateHeader()- "+request.getDateHeader("temp"));
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()){
			out.println("<br>"+headers.nextElement());
		}		
		out.println("<br>getMethod()- "+request.getMethod());
		out.println("<br>getPathInfo()- "+request.getPathInfo());
		out.println("<br>getPathTranslated()- "+request.getPathTranslated());
		out.println("<br>getQueryString()- "+request.getQueryString());
		out.println("<br>getRemoteUser()- "+request.getRemoteUser());
		out.println("<br>getRequestedSessionId()"+request.getRequestedSessionId());
		out.println("<br>getRequestURI()- "+request.getRequestURI());
		out.println("<br>getRequestURL()- "+request.getRequestURL());
		out.println("<br>getServletPath()"+request.getServletPath());
		out.println("<br>isRequestedSessionIdFromCookie()- "+request.isRequestedSessionIdFromCookie());
		out.println("<br>isRequestedSessionIdFromUrl()- "+request.isRequestedSessionIdFromUrl());
		out.println("<br>isRequestedSessionIdFromURL()- "+request.isRequestedSessionIdFromURL());
		out.println("<br>isRequestedSessionIdValid()- "+request.isRequestedSessionIdValid());
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}