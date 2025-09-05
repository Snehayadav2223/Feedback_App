package Servlet.Feedback_form.session.manage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2")

public class Request2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 var writer =resp.getWriter();
		 Cookie [] cookies =req.getCookies();
		 
		 var flag = false;
		 StringBuilder content=new StringBuilder();
		 
		 if(cookies != null) {
			 
			
			 
			 for(Cookie c :cookies) {
				 String name = c.getName();
				 if(name.equals("username")) {
					 System.out.println("username :" +c.getValue());
					 content.append("""
					 		
					 		<h1> Welcome : %s </h1>
							""" .formatted(c.getValue()));
					 flag =true;
					 
				 }else if(name.equals("userid")) {
					 System.out.println("username :" +c.getValue());
					 content.append("""
					 		
					 		<h1> Userid : %s </h1>
							""" .formatted(c.getValue()));
					 flag = true;
					 
				 }
			 }
		 }
		 
		 HttpSession session = req.getSession();
		 String secret = (String)session.getAttribute("userSecret");
		 content.append("""
		 		<h1> Session secret : %s </h1>
		 		""".formatted(secret));
		 
		 if(flag) {
			 writer.println("<h1>user is present</h1>");
			 writer.println(content);
		 }
		 
		 else{
			 writer.println("<h1> No username found in cookies</h1>");
			 writer.println("<h1> username cookies is not thetre in request</h1>");
		 }
		   
	}

	
}
