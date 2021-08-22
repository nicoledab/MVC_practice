<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1>jstl03 페이지 ! </h1>

<c:set var="id" value="admin" />
<c:choose>
	<c:when test="${id=='guest'}"> 손님 입장 </c:when>
	<c:when test="${id=='admin'}"> 직원 입장 </c:when>
	<c:otherwise> 누구세요 ? </c:otherwise>	

</c:choose>