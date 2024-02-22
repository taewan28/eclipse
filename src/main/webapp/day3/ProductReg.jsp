<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri ="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN2</title>
<link rel="stylesheet"    href="assets/css/register.css" >
</head>
<body>
  <div class="contents-wrap">
  <h3 style="text-align: center;">상품 등록</h3>
  <hr>
          <form action="ProductReg.cc" method="post">
            <ul class="Productjoin-wrap">
              <li>상품코드</li>
              <li>
                <input name="pcode" type="text"
                 					 placeholder="상품코드를 입력해 주세요." />
              </li>
              <li>상품카테고리</li>
              <li><input id="category" name="category" type="text" placeholder="상품카테고리 입력해 주세요." /></li>
              <li>상품이름</li>
              <li><input id="pname" name="pname" type="text" placeholder="상품이름 입력해 주세요." /></li>
              <li>상품갯수</li>
              <li><input name="price" type="text" placeholder="상품갯수" /></li>
            </ul>
            <button class="Productjoin-btn">상품 등록</button>
          </form>
        </div>
  <script src="assets/js/script.js"></script>
</body>
</html>