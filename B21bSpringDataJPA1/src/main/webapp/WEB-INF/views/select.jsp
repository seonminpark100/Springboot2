<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SELECT</title>
	</head>
	<body>
		<h2>Springboot 프로젝트</h2>
		<ul>
			<li><a href="/">루트</a></li>
		</ul>
		
		<h2>Spring Data JPA - select</h2>
		<p>
			아이디: ${member.id }<br>
			이름: ${member.username }<br>
			날짜: ${member.createDate }<br>
		</p>
	</body>
</html>