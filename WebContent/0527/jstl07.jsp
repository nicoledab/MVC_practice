<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> jstl06 페이지 !!</h1>


<c:forTokens var="data" items="java,jsp,mvc,framework" delims=",">
	${data}  <br />
</c:forTokens>

<%-- 
                 결과: 
jstl06 페이지 !!
java 
jsp 
mvc 
framework 
--%>