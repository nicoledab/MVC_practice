<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> jstl05 페이지 !!</h1>

<c:url var="data" value="main.jsp"> 
	<c:param name="id" value="java" />
	<c:param name="num" value="2" />
</c:url>

<a href="${data}"> 이동 </a>
<%-- 메인페이지 이동, 
그리고 그 주소:
 http://localhost:8080/mvc/0527/main.jsp?id=java&num=2--%>
 
 
 
 