package com.pk2;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Servlet implementation class sign
 */
public class sign extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name =req.getParameter("username");
		String pass =req.getParameter("password");
		try {
			//make a connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into student values('"+name+"','"+pass+"')");
			out.println("Record inserted Succesfully");
			out.println("<br>");

		}
          catch(Exception e)
		
		{
        	  System.out.println(e);
		}
		out.println("<body></html>");
	}
}
	
