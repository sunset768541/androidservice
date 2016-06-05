package com.wang.androidtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class androidask
 */
@WebServlet(name="androidask"
	, urlPatterns={"/androidask"})
public class androidask extends HttpServlet {
	 File file;
	 FileOutputStream filout;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public androidask() {
        super();
         file=new File("F:/hh.txt");
         try {
			filout=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		byte[] bb=request.getParameter("ll").getBytes();
		filout.write(bb);
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Jsp!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Jsp!</h1>");
		out.println("</body>");
		out.println("</html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
