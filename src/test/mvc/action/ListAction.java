package test.mvc.action;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.model.BoardDBBean;

public class ListAction implements SuperAction{
	public String service(HttpServletRequest request, 
			   			HttpServletResponse response) throws ServletException, IOException {
		
		int pageSize = 10;
		String pageNum = request.getParameter("pageNum");
	    if (pageNum == null) {
	        pageNum = "1";
	    }
	    int currentPage = Integer.parseInt(pageNum);
	    int startRow = (currentPage - 1) * pageSize + 1;
	    int endRow = currentPage * pageSize;
	    int count = 0;
	    int number=0;
	    List articleList = null;
	    BoardDBBean dbPro = new BoardDBBean();
	    try {
		    count = dbPro.getArticleCount();
		    if (count > 0) {
		        articleList = dbPro.getArticles(startRow, endRow);
		    }
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		number=count-(currentPage-1)*pageSize;
		
		
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("startRow", startRow);
		request.setAttribute("endRow", endRow);
		request.setAttribute("count", count);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("number", number);
		request.setAttribute("articleList", articleList);
		request.setAttribute("pageNum", pageNum);
		
		return "/board/list.jsp";
	}
}









