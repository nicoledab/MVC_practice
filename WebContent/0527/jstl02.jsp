<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1>jstl02 페이지 ! </h1>

<c:if test="${100 > 0 }">  <%--조건에 맞는것만 동작함. --%>
	100보다 크다 
</c:if>

<c:if test="${100 == 0 }">
	0이다 
</c:if>

<c:if test="${100 < 0 }">
	0보다 작다
</c:if>

<br />
<c:if test="${sessionScope.memId ==null }">
	로그인하세요 ..
</c:if>

<c:if test="${sessionScope.memId !=null }">
	
</c:if>