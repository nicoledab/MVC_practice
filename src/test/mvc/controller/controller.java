package test.mvc.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.mvc.action.ListAction;
import test.mvc.action.LoginFormAction;
import test.mvc.action.MainAction;
import test.mvc.action.SuperAction;


@WebServlet("*.nhn") //http://localhost:8080/mvc/board/list.nhn
public class controller extends HttpServlet {
	
	
	private Map map = new HashMap();
	
	
	//오버라이드 만들기  source -> ovderride -> generalservlet - > innit(serveletconfig) 체크하고 확인
	// 서버 실행 후.. 최초 한번만 실행된다. 
	          //ServletConfig config 서버에서 받는 정보 
	public void init(ServletConfig config) throws ServletException {
	 String proPath ="C:\\Users\\Nicole Jung\\eclipse-workspace\\mvc\\WebContent\\WEB-INF\\properties\\﻿command.properties";
	  //web-inf의 proerties 폴더의 command.properties 우클릭 , 속성 - 경로 복사.넣기 
	 
	 InputStream is = null;
	 
	 	try {
	 		is = new FileInputStream(proPath);
	 		Properties p = new Properties();   //map
	 		p.load(is);    //string 타입으로. 이걸 객체화 시키는 작업이 필요.
	 		                //key도 string,  value도 string
	 		//객체화 시키기~ 
	 		Iterator iter = p.keySet().iterator();  //list.nhn,  login.nhn,  main.nhn 
	 		while(iter.hasNext()) {
	 			String key = (String)iter.next();  // list.nhn 
	 			String value = p.getProperty(key);  // ListAction 
	 			Class c = Class.forName(value);   //클래스 로딩
	 			Object obj = c.newInstance();    // 객체생성 new ListAction() 
	 			map.put(key, obj);
	 		}
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 	}
	}  // init 끝 

	
	
	
	
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("요청주소="+request.getRequestURI()); 이게 곧 키
		
		String view="/main.jsp";
		SuperAction sa =null;
		
		String uri = request.getRequestURI();
		Object obj = map.get(uri);
		if(obj != null) {
			if(obj instanceof SuperAction) { //instanceof 다형성 
				
				sa =(SuperAction)obj;
				view=sa.service(request, response);
				
			}
		}
		
		
		//해당 뷰 쪽으로 포워드 시키기 
		request.getRequestDispatcher(view).forward(request, response);
	}

}
