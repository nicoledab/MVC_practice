<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> jstl06 페이지 !!</h1>

<%--         변수     시작값      종료값      증가값      --%>
<c:forEach var="a" begin="1" end="10" step="2">
	${a}  <br /> 
</c:forEach>

<%-- 결과 
jstl06 페이지 !!
 1 
 3 
 5 
 7 
 9 

 --%>
 
<%--          변수           반복대상      --%>
 <c:forEach var="dto" items="${list}">
 	${dto.id} <br />
</c:forEach>





 
 