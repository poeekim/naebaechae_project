<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
// 선언문 : 현재 jsp 페이지 전체에서 위치에 상관없이 사용이 가능한 변수, 메소드가 필요한 경우 사용되는 구문

	String name = "홍길동"; // 전역변수의 성격(Static이 있는 느낌)
	public String getName(){ // 정적메소드? 일반메소드??
		return name;
	}
	
%>
	name의 값은? <%=name %><p>
	getName()을 호출?<%=getName() %>


<html>
<head>
<meta charset="UTF-8">
<title>jsp 3번째 예제(표현식 활용, 선언문의 메소드 작성)</title>
</head>
<body>
<%
	float	f = 2.3f;
	int i = Math.round(f); // 반올림 x -> 0.3 -> 화면에는 2가 출력됨.
	// import 할 필요 X (자동 인식 하므로)
	java.util.Date d = new java.util.Date();
	out.println("d의 값은? : " + d); // d.toString() 과 동일 %>
	<hr><p>
		정수f 의 반올림 값 = <%=i %><p>
		현재 날짜와 시간 = <%=d.toString() %><p> <!--  객체명.호출할 메소드명 -->
</body>
</html>