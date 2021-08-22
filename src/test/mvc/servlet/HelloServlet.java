package test.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/hello.do")  // ���� �ּ�!!   http://localhost:8080/mvc/hello.do?id=java
public class HelloServlet extends HttpServlet {
	
     // java�� ģ�ٸ� main() ����  -get/post �Ѵ� ó�� ���� 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		if(id.equals("java")) {
			id+="_ok";
		}else {
			id+="_no";
		}
		
	     //request.�� ����. 
		request.setAttribute("result", id);     // request. ��� ���� 
		request.setAttribute("aaa", 1000);     // request. ��� ���� 
		request.setAttribute("bbb", null);     // request. ��� ���� 
		request.setAttribute("ccc", "100");     // request. ��� ���� 
		
		
		// controller ���� session ���   .���� ���� 
		HttpSession session = request.getSession();
		session.setAttribute("memId", id);
		session.setAttribute("aaa", 700);
		
		
		//view�� ������ 
		request.getRequestDispatcher("/0526/hello.jsp").forward(request, response);
		
	}

}
