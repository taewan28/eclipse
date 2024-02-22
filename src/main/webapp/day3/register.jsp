<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN</title>
<!-- jsp 파일을 실행할 떄는 css 아래와 같이 하고요.... -->
<!-- <link rel="stylesheet"    href="../assets/css/register.css" > -->
<!-- 서블릿으로 화면을 보여 줄 때에는??? -->
<link rel="stylesheet"    href="assets/css/register.css" >
</head>
<body>
  <div class="contents-wrap">
  <h3 style="text-align: center;">고객 등록</h3>
  <hr>
          <form action="register.cc" method="post">
            <ul class="join-wrap">
              <li>아이디</li>
              <li>
                <input name="userid" type="text"
                 					 placeholder="아이디를 입력해 주세요." />
              </li>
              <li>이름</li>
              <li><input id="name" name="name" type="text" placeholder="이름" /></li>
              <li>이메일</li>
              <li><input id="email" name="email" type="text" placeholder="이메일을 입력해 주세요." /></li>
              <li>나이</li>
              <li><input name="age" type="text" placeholder="나이" /></li>
            </ul>
            <button class="join-btn">회원가입</button>
          </form>
        </div>
  <script src="assets/js/script.js"></script>
</body>
</html>