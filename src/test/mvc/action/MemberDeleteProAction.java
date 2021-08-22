package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.mvc.model.LogonDBBean;

public class MemberDeleteProAction  implements SuperAction{
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
			
		
		HttpSession session =  request.getSession();
		String id = (String)session.getAttribute("memId");
		 String passwd  = request.getParameter("passwd");
			
		 LogonDBBean manager = new LogonDBBean();
			int check = 0;
			
			  try {
		     check = manager.deleteMember(id,passwd);
			  }catch (Exception e) {
				  e.printStackTrace();
			  }
			  
			  
			  session.setAttribute("memId",id);
			  request.setAttribute("passwd",passwd);
			 
			  
			  
		return "/member/deletePro.jsp";
	}
}
