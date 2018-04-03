package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String user=request.getParameter("un");
			String pass=request.getParameter("pw");
			
			
			PrintWriter pwr=response.getWriter();
	if(user.equals("Admin")&&pass.equals("cts"))
	{
		RequestDispatcher rd=request.getRequestDispatcher("Success.html");
		pwr.print("<html><body>Success</body></html>");
	     rd.forward(request,response);
	    
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		pwr.print("<html><body>Authentication failed.</body></html>");
	     rd.include(request,response);
	    
	}

	}
	}


