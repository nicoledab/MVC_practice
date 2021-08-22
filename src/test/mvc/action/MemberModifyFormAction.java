package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.mvc.model.LogonDBBean;
import test.mvc.model.LogonDataBean;

public class MemberModifyFormAction implements SuperAction{
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		HttpSession session = request.getSession();
	    String id = (String)session.getAttribute("memId");
	    
	    LogonDBBean manager = LogonDBBean.getInstance();
	    LogonDataBean c = null;
	    try {
			c = manager.getMember(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	    request.setAttribute("memId", id);
	    request.setAttribute("c", c);
		
		return "/member/modifyForm.jsp";
		}
}
