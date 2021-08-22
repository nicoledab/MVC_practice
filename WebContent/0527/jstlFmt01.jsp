<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.Date" %> 

<h1> jstlFmt01 페이지 !</h1>
<%// request.setCharacterEncoding("UTF-8"); %>
<fmt:requestEncoding value="UTF-8" />


<c:set var="day" value="<%=new Date()%>" />

                                <%--dateStyle= default, short, medium, long, full --%>
<fmt:formatDate var="d1" value="${day}" type="date" dateStyle="full" /> 
<fmt:formatDate var="d2" value="${day}" type="time" timeStyle="full" /> 
<fmt:formatDate var="d3" value="${day}" type="both" /> 

<fmt:formatDate var="d4" value="${day}" type="both" pattern="yyyy년 MM월 dd일" /> 


<%--영국 표준시  --%>
  <fmt:timeZone value="GMT">
 	 <fmt:formatDate var="d3" value="${day}" type="both" /> 
  </fmt:timeZone>


date: ${d1} <br />
date: ${d2} <br />
date: ${d3} <br />
date: ${d4} <br />

<%-- 결과:

date: 2021년 5월 27일 목요일 
date: 오전 11시 50분 40초 대한민국 표준시 
date: 2021. 5. 27. 오전 11:50:40 
date: 2021년 05월 27일 

 --%>

