package Servlet.Feedback_form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/feedback")
public class Feedback_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// to get the form data
		
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String feedbackMessage = req.getParameter("feedback_message");
		
		//form data process
		
		// provide responses
		
		resp.setContentType("text/html");
		PrintWriter writer =resp.getWriter();
		
		
		writer.print("<h1>feedback servlet working</h1>");
		System.out.println("Hello");
		
		writer.println("""
				
				<h2> Your form details that you have submitted</h2>
				<h3> Email adress %s </h3>
				<h3>Phone number %s</h3>
				<h3> Feedback message %s </h3>
				
				""".formatted(email,phone,feedbackMessage));
	}
	// @Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	    resp.setContentType("text/html");
//	    PrintWriter writer = resp.getWriter();
//	    writer.print("GET request working for FeedbackServlet");
//	}


}
