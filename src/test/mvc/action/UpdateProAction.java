package test.mvc.action;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.model.BoardDBBean;
import test.mvc.model.BoardDataBean;

public class UpdateProAction implements SuperAction{

	public String service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		String pageNum = request.getParameter("pageNum");
		
		BoardDataBean dto = new BoardDataBean();
		dto.setNum(Integer.parseInt(request.getParameter("num")));
		dto.setWriter(request.getParameter("writer"));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setPasswd(request.getParameter("passwd"));
		dto.setContent(request.getParameter("content"));

		BoardDBBean dbPro = new BoardDBBean();
		int check = 0;
	    try {
	    	check = dbPro.updateArticle(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    request.setAttribute("pageNum", pageNum);
	    request.setAttribute("check", check);
	    
		return "/board/updatePro.jsp";
	}

}
