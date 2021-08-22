package test.mvc.action;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.model.LogonDBBean;
import test.mvc.model.LogonDataBean;

public class MemberInputPro implements SuperAction{
	public String service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		
		
		 
		 LogonDataBean member = new LogonDataBean();
	    member.setReg_date(new Timestamp(System.currentTimeMillis()));
	    member.setId(request.getParameter("id"));
	    member.setPasswd(request.getParameter("passwd"));
	    member.setName(request.getParameter("name"));
	    member.setJumin1(request.getParameter("jumin1"));
	    member.setJumin2(request.getParameter("jumin2"));
	    member.setEmail(request.getParameter("email"));
	    member.setBlog(request.getParameter("blog"));
	    
	     LogonDBBean manager = LogonDBBean.getInstance();
	    
	    try { 
			manager.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "/member/inputPro.jsp";
	}
	
}
