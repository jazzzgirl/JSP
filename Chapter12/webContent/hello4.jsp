<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>

<!-- 선언문 -->
<%!
	String name = "김지연";
	public String getName(){ 
		return name;
	}
%>
<!-- 스크립트릿 (html 주석문) -->
<% 
	/* 스크립트릿 안에 주석문 사용 */
	/*   
	String age = request.getParameter("age"); 
	*/
%>  

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>주석문 연습 - 김지연</title>
	</head>
	
	<body>
		<!-- 표현식 주석문 <%-- --%> -->
		<h1>나이+10은 <%-- <%= Integer.parseInt(age)+10 %> --%>살입니다!!</h1>
	</body>
</html>
