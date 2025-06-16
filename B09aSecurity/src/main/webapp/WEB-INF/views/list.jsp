<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
<script>
    function validateSearch() {
        var searchKeyword = document.getElementById("searchKeyword").value;
        if (searchKeyword.trim() === "") {
            alert("검색어를 입력하세요.");
            return false; 
        }
        return true; 
    }
</script>
</head>
<body>
    <h2>회원목록</h2>
    

    <form action="list.do" method="get" onsubmit="return validateSearch();">
        <select name="searchField">
            <option value="id">아이디</option>
            <option value="name">이름</option>
        </select>
        <input type="text" name="searchKeyword" id="searchKeyword" placeholder="검색어를 입력하세요.">
        <input type="submit" value="검색">
    </form>

    <table border="1">
        <thead>
            <tr>
                <th>아이디</th>
                <th>패스워드</th>
                <th>이름</th>
                <th>등록일</th>
                <th>수정/삭제</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${empty memberList}">
                    <tr>
                        <td colspan="5">등록된 회원이 없습니다.</td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach var="dto" items="${memberList}">
                        <tr>
                            <td>${dto.id}</td>
                            <td>${dto.pass}</td>
                            <td>${dto.name}</td>
                            <td>${dto.regidate}</td>
                            <td>
                                <a href="edit.do?id=${dto.id}">수정</a> /
                                <a href="delete.do?id=${dto.id}" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
                            </td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
    <p>
        <a href="regist.do">회원등록</a>
    </p>
</body>
</html>