package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFormAction  implements SuperAction {
		public String service(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			//controller.java�� �ִ� �޼ҵ� ����. public String ���� �ٲٰ� 
			
			System.out.println("Model --- LoginFormAction ���� ..!!! ");
			return "/member/loginForm.jsp";
		}
}
