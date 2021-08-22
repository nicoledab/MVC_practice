<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> jstl04 페이지 !!</h1>

<%-- inclue 기능과 유사하다. --%>
<c:import var="m" url="main.jsp" />

${m}

<%-- 결과: 
jstl04 페이지 !!

main 페이지 

--%>