<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>home 화면</title>
	</head>
	<body>
		<h2>스프링 부트 프로젝트-파일업로드</h2>
		<ul>
			<li><a href="/">루트</a></li>
		</ul>
		
		<h2>Spring Data JPA</h2>
		<ul>
			<li><a href="insert.do?username=test1">데이터 추가</a></li>
			<li><a href="/select.do?id=1">개별 조회</a></li>
			<li><a href="/selectAll.do">전체 조회</a></li>
			<li><a href="/delete.do?id=2">데이터 삭제</a></li>
			<li><a href="/update.do?id=1&username=홍길동">데이터 수정</a></li>
		</ul>
	</body>
</html>