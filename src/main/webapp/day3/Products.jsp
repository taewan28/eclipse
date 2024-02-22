<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri ="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/Project.css">
</head>
<body>
	<h3>상품 전체 조회</h3>
		<hr>
		<ul>
		<!-- list 이름의 애트리뷰를 대상으로 합니다. 애트리뷰트 저장은 서블릿에서-->
		<c:forEach items="${list }" var="vo" varStatus="status">
			<ul class="row">
				<li><c:out value="${status.index+1 }"/></li>
				<li><c:out value="${vo.pcode }"/></li>
				<li><c:out value="${vo.category }" /></li>
				<li><c:out value="${vo.pname }"/></li>
				<li><c:out value="${vo.price }"/></li>
			</ul>
			</c:forEach>
		</ul>
</body>
</html>