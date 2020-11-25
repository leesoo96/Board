<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
	<div>
		<div>
			<a href="/v2/boardReg"><button>글쓰기</button></a>
		</div>
		<div>
		<c:forEach items="${list }" var="item">
			번호 ${item.i_board } 
			제목 ${item.title } 
			내용 ${item.ctnt }
			날짜 ${item.r_dt }
		</c:forEach>
			
		</div>
	</div>
</body>
</html>