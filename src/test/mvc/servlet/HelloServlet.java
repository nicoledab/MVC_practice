package test.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/hello.do")  // 실행 주소!!   http://localhost:8080/mvc/hello.do?id=java
public class HelloServlet extends HttpServlet {
	
     // java로 친다면 main() 역할  -get/post 둘다 처리 가능 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		if(id.equals("java")) {
			id+="_ok";
		}else {
			id+="_no";
		}
		
	     //request.에 저장. 
		request.setAttribute("result", id);     // request. 결과 저장 
		request.setAttribute("aaa", 1000);     // request. 결과 저장 
		request.setAttribute("bbb", null);     // request. 결과 저장 
		request.setAttribute("ccc", "100");     // request. 결과 저장 
		
		
		// controller 에서 session 사용   .세션 저장 
		HttpSession session = request.getSession();
		session.setAttribute("memId", id);
		session.setAttribute("aaa", 700);
		
		
		//view로 포워딩 
		request.getRequestDispatcher("/0526/hello.jsp").forward(request, response);
		
	}

}
