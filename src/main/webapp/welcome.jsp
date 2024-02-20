<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- language="java" : java 언어로 컴파일 된다 
    	 contentType= "text/html; charset=UTF-8" : 응답으로 만들어질 형식은 html
    -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 - Welcome</title>
</head>
<body>
 <h1>WELCOME</h1>
    <h3>회원 가입이 완료되었습니다.</h3>

<!--  자바 프로그래밍을 하는 스크립트 작성 부분입니다.(스크립트릿) -->
<%
	// form 태그안의 입력양식이 서버로 제출될 때, 그 값을 받아 저장하는 코드입니다.
	// getParameter 메소드이므로 앞으로는 입력 요소를 파라미터라고 부르겠습니다.
	
	// input요소의 name 속성값을 인자로 합니다. 	
	String id = request.getParameter("userid");			//아이디			
	String password = request.getParameter("password");	//패스워드
	out.print("<h3>아이디</h3>");
	out.print(id);
	out.print("<h3>비밀번호</h3>");
	out.print(password);
%>
    <hr>
    <p>form 제출 확인 페이지 입니다.</p>
</body>
</html>
<!-- jsp는 서버축에서 컴파일 되고 실행이 됩니다.
	-> 컴파일 전에는 .java 파일로 변경되고
	-> .java 를 컴파일해서 .class 를 생성합니다.
	-> 웹페이지를 요청한 클라이언트에게는 .class 파일로 html 문서를 작성하여 응답합니다.
 -->
<!-- 이클립스는 jsp 에 대한 소스파일이 여기에 있습니다.
	ㄴD:\Class231228\eclipse-workspace\.metadata\.plugins\org.wst.server.
	실제 실행 환경에서는 tomcat 폴더 안에서 바로 찾을 수 있습니다.
	
	이클립스는 webapp 폴더에 저장된 파일들은 jsp 제외하고 여기에 있습니다.
	ㄴ D:\Class231228\eclipse-workspace\.metadata\.plugins\org.wst.server.
	실제 실행 환경에는 tomcat 폴더 안에서 바로 찾을 수 있습니다.
 -->