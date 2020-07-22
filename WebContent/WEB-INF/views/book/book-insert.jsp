<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책정보입력</title>
</head>
<body>
	<form method="post" action="/book/insert">
		<table border="1">
			<tr>
				<th>책제목</th>
				<td><input type="text" name="b_tile"></td>
			</tr>
			<tr>
				<th>지은이</th>
				<td><input type="text" name="b_author"></td>
			</tr>
			<tr>
				<th>책내용</th>
				<td><input type="text" name="b_desc"></td>
			</tr>
			<tr>
				<th colspan="2"><button>책정보입력</button></th>
			</tr>
		</table>
	</form>
</body>
</html>