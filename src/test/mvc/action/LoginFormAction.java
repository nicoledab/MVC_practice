package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFormAction  implements SuperAction {
		public String service(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			//controller.java에 있는 메소드 복붙. public String 으로 바꾸고 
			
			System.out.println("Model --- LoginFormAction 실행 ..!!! ");
			return "/member/loginForm.jsp";
		}
}
