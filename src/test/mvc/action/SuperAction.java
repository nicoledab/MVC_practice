package test.mvc.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SuperAction { //최고조상
		public String service(HttpServletRequest request,
					HttpServletResponse response) 
					throws ServletException, IOException;
	
}
