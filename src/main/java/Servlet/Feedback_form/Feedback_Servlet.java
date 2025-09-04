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
		
		//form data process
		
		// provide responses
		
		resp.setContentType("text/html");
		PrintWriter writer =resp.getWriter();
		
		
		writer.print("feedback servlet working");
		System.out.println("Hello");
	}
	// @Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	    resp.setContentType("text/html");
//	    PrintWriter writer = resp.getWriter();
//	    writer.print("GET request working for FeedbackServlet");
//	}


}
