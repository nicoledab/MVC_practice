package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberMainAction implements SuperAction {
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("memId");
		
		request.setAttribute("id", id);
		
		return "/member/main.jsp";
		}
}
