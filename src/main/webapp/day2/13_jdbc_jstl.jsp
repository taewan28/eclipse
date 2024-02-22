<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>
<%@page import="project.dao.TblCustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri ="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>13_jdbc_jstl</title>
</head>
<body>
	<h3>2번 소스파일 스크립트릿과 출력시을 jstl과 el로 변경하기</h3>
	<hr>
<%
	TblCustomerDao dao = new TblCustomerDao();
	List<CustomerVo> list = dao.allCustomers();
	pageContext.setAttribute("list",list);
%>
	<table>
	<!-- el 기호에서 지정된 이름 list 애트리뷰트를 가져오는 동작 : getAttribute(list) 
				pageContext.getAttribute(list); 실행하기-->
	<c:forEach items="${list }" var="vo" varStatus="status">
	<tr>
		<td><c:out value="${vo.customId }"/></td>
		<td><c:out value="${fn:toUpperCase(vo.customId) }" /></td>
		<td><c:out value="${vo.name }"/></td>
		<td><c:out value="${vo.email }"/></td>
		<td><c:out value="${vo.age }"/></td>
		<td><fmt:formatDate value="${vo.reg_date}"
					pattern="yyyy-mm-dd a hh:mm:ss"/></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>
<!-- 애트리뷰트 내용은 교재 : 111페이지 ~ 134 참고 
	 jstl과 el 은 교재 : 343페이지 ~ 422
	 교재 422페이지 taglib의 uri 가 다릅니다.(톰캣 버전 차이)
-->






