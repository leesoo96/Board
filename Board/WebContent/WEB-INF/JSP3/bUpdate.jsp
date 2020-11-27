<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE</title>
</head>
<body>
	<h2>UPDATE</h2>
	<form action="/v3/bUpdate" method="post">
		번호 <input type="text" name="i_board" value="${content.i_board }" readonly><br/>
		제목 <input type="text" name="title" value="${content.title }"><br/>
		내용 <textarea name="ctnt">${content.ctnt }</textarea><br/>
		작성일 <input type="date" name="r_dt" value="${content.r_dt }" readonly><br/>
		
		<input type="reset" value="다시쓰기">
		<input type="submit" value="확인">
	</form>
	<a href="/v3/bList">Back to List</a>
</body>
</html>