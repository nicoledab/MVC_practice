package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAction implements SuperAction{
		public String service(HttpServletRequest request, 
	   			HttpServletResponse response) throws ServletException, IOException {
			
			
			  request.setAttribute("num",  Integer.parseInt(request.getParameter("num")));
		      request.setAttribute("pageNum", request.getParameter("pageNum"));
		     
			
			return "/board/deleteForm.jsp";
		}
}
