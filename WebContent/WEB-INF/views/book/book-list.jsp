<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>책번호</th>
		<th>책제목</th>
		<th>지은이</th>
		<th>책내용</th>
		<th>출간일</th>
	</tr>
<c:forEach items="${bookList}" var="book">
	<tr>
		<td>${book.b_num}</td>
		<td><a href="/book/view?b_num=${book.b_num}">${book.b_tile}</td>
		<td>${book.b_author}</td>
		<td>${book.b_desc}</td>
		<td>${book.b_credat}</td>
	</tr>
</c:forEach>
</table>
<a href="/views/book/book-insert"><button>도서추가</button>
</body>
</html>