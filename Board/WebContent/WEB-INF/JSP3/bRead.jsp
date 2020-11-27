<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>READ</title>
<style>
	h2 {
		text-decoration: underline;
	}
 	table, th, tr, td {
 		border-collapse: collapse;
 	}
 	th {
 		background-color: pink;
 		width: auto;
 	}
 	td {
 		width: 300px;
 		height: 100px;
 	}
</style>
</head>
<body>
	<h2>READ</h2>
	<table border=1>
		<tr>
			<th>제목 : ${content.title }</th>
			<th>${content.i_board }</th>
		</tr>
		<tr>
			<td colspan="2">${content.ctnt }</td>
		</tr>
		<tr>
			<th colspan="2">작성일 : ${content.r_dt }</th>
		</tr>
	</table>
	<a href="/v3/bList">Back to List</a><br/>
	<a href="/v3/bUpdate?i_board=${content.i_board }">Update</a><br/>
	<a href="/v3/bDelete?i_board=${content.i_board }">Delete</a>
</body>
</html>