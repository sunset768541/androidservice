package lee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
// Servlet����̳�HttpServlet��
@WebServlet(name="firstServlet"
	, urlPatterns={"/firstServlet"})
public class FirstServlet extends HttpServlet
{
	File file=new File("F:/hh11.txt");
	 FileOutputStream filout;
	
	public void FirstServlet() throws ServletException{ 
		 //super();
		  try {
			filout=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void init() throws ServletException{ 
		try {
			filout=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		// �ͻ��˵���Ӧ������ʹ�ø÷���������Ӧ�ͻ����������͵�����
	public void service(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException,java.io.IOException
	{
		// ���ý��뷽ʽ
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charSet=GBK");
		// ��ȡname���������ֵ
		String name = request.getParameter("name");
		// ��ȡgender���������ֵ
		
		PrintStream out = new PrintStream(response.getOutputStream());
		//���HTMLҳ���ǩ
		 
       
		byte[] bb=request.getParameter("name").getBytes();
		filout.write(bb);
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet����</title>");
		out.println("</head>");
		out.println("<body>");
		// ������������ֵ��name
		out.println("�������֣�" + name + "<hr/>");
		// ������������ֵ��gender

		out.println("</body>");
		out.println("</html>");
	}
}
