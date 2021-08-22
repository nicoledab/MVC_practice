<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x"   uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
 
<h1>jstl01 페이지 ! </h1>


<%-- request.setAttribute("id","java") 랑 같다-     --%>
<c:set var="id" value="java" />
<%-- id란 값을 출력:  결과 java  --%>
변수 확인 : ${id}


<br /> 
<c:remove var="id"/>
변수확인 : ${id}
