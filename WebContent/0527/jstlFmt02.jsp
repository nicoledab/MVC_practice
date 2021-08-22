<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>
<h1> jstlFmt02 페이지 ! </h1>

<fmt:formatNumber value="12345.678" pattern=".0" /> <br /> 
<fmt:formatNumber value="12345.678" pattern=".00" /> <br /> 
<fmt:formatNumber value="12345.678" pattern=".000" /> <br /> 


<fmt:formatNumber value="12345.678" type="number" /> <br /> 
<fmt:formatNumber value="12345.678" type="currency" pattern="$"/> <br /> 
<fmt:formatNumber value="12345.678" type="percent" /> <br /> 

<%-- 결과

jstlFmt02 페이지 ! 
12345.7 
 12345.68 
 12345.678 
 12,345.678 
 $12346 
 1,234,568% 


 --%>

