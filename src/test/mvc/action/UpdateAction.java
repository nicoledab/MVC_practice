package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.model.BoardDBBean;
import test.mvc.model.BoardDataBean;

public class UpdateAction implements SuperAction{
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
		
		 int num = Integer.parseInt(request.getParameter("num"));
		 String pageNum = request.getParameter("pageNum");
		
		 BoardDBBean dbPro = new BoardDBBean();
		 BoardDataBean article = null;
	      try {
	      article = dbPro.updateGetArticle(num);
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      
	      request.setAttribute("num", num);
	      request.setAttribute("pageNum", pageNum);
	      request.setAttribute("article", article);
	
		
		return "/board/updateForm.jsp";
	}
}
