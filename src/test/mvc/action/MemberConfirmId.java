package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.mvc.model.LogonDBBean;

public class MemberConfirmId implements SuperAction{
	public String service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		HttpSession session =  request.getSession();
		String id = (String)session.getAttribute("memId");

		
		    LogonDBBean manager = new LogonDBBean();
			int check = 0;
			
			  try {
		     check = manager.confirmId(id);
			  }catch (Exception e) {
				  e.printStackTrace();
			  }
		    
		    
		    session.setAttribute("memId",id);
		    
		    
		return "/member/confirmId.jsp";
	}
}
