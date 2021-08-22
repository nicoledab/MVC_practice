package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.model.BoardDBBean;

public class DeleteProAction  implements SuperAction{
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
	
		  int num = Integer.parseInt(request.getParameter("num"));
		  String pageNum = request.getParameter("pageNum");
		  String passwd = request.getParameter("passwd");

		  BoardDBBean dbPro = new BoardDBBean();
		  int check = 0;
		  try {
		    check = dbPro.deleteArticle(num, passwd);
		  }catch (Exception e) {
			  e.printStackTrace();
		  }
	     
		  request.setAttribute("num", num);
		  request.setAttribute("pageNum", pageNum);
		  request.setAttribute("passwd",passwd);
		  request.setAttribute("check", check);
		
		
		return "/board/deletePro.jsp";
	}
}
