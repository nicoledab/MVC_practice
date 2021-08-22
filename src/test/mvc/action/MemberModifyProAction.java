package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.mvc.model.LogonDBBean;
import test.mvc.model.LogonDataBean;

public class MemberModifyProAction implements SuperAction{
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		HttpSession session = request.getSession();
	    String id = (String)session.getAttribute("memId");
	    
	    LogonDataBean member = new LogonDataBean();
	    
		member.setId(id);
		member.setPasswd(request.getParameter("passwd"));
		member.setName(request.getParameter("name"));
		member.setEmail(request.getParameter("email"));
		member.setBlog(request.getParameter("blog"));

		LogonDBBean manager = LogonDBBean.getInstance();
	    try {
			manager.updateMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	    
	return "/member/modifyPro.jsp";
	}
}
