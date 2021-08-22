package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberModifyAction implements SuperAction{
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
		
		
		return "/member/modify.jsp";
		}
}
