package com.org.gen;

import jakarta.servlet.http.HttpServlet;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{  
			  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    Cookie c[]=request.getCookies();  
		    out.print("Hello "+"Everyone how are"+ " " + " you all"); 
		    
		  
		    out.close();  
		  
		         }catch(Exception e){System.out.println(e);}  
		    }  
	}

}
