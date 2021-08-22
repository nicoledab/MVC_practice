package test.mvc.action;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.model.BoardDBBean;
import test.mvc.model.BoardDataBean;

public class WriteProAction  implements SuperAction {
	public String service(HttpServletRequest request, 
   			HttpServletResponse response) throws ServletException, IOException {
	
		
		request.setCharacterEncoding("euc-kr");
		BoardDataBean dto = new BoardDataBean();
		dto.setNum(Integer.parseInt(request.getParameter("num")));
		dto.setWriter(request.getParameter("writer"));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setPasswd(request.getParameter("passwd"));
		dto.setReg_date(new Timestamp(System.currentTimeMillis()));
		dto.setRe_level(Integer.parseInt(request.getParameter("re_level")));
		dto.setRe_step(Integer.parseInt(request.getParameter("re_step")));
		dto.setRef(Integer.parseInt(request.getParameter("ref")));
		dto.setContent(request.getParameter("content"));
		dto.setIp(request.getRemoteAddr());
		
		 BoardDBBean dbPro = new BoardDBBean();
		 try {   
		 dbPro.insertArticle(dto);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		    
		    
		return "/board/writePro.jsp";
	}
}
