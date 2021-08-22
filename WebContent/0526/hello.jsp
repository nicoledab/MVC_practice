<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<h1> hello.jsp 페이지 !</h1>


<h2> result(EL) = ${result}</h2>
<h2> aaa(EL) = ${requestScope.aaa}</h2>

<h2> bbb(EL) = ${bbb}</h2> <%-- null --%>
<h2> ccc(EL) = ${ccc+100} </h2> <%-- 연산하고 출력된다~ 결과> 200  --%>

<h1>세션 = ${sessionScope.memId}</h1>
<h1>세션 = ${sessionScope.aaa} </h1> <%-- 리퀘스트랑 세션이랑 구분시키기 --%>


<h1>문자 = ${"hello world"} </h1>
<h1>문자 = ${'hello world'} </h1>


<h1> 비교 = ${10 == 10}</h1>  <%-- 결과 :  비교 = true   --%>
<h1> 비교 = ${10 eq 10}</h1>   <%-- 결과 :  비교 = true   --%>
<h1> 세션 = ${sessionScope.memId == 'java_ok'} </h1> 
                 <%-- 결과 :  세션 = true   --%>

<h2> bbb(EL) = ${"100"+200}</h2><%-- null이 아닌 300  --%>



