<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 글쓰기</h3>
<form action="insert2.multi">
title : <input name="title"><br>
content : <input name="content"><br>
writer : <input name="writer"><br>
<button>게시판 글쓰기 완료</button>
</form>
<hr>
<h3>게시판 글삭제</h3>
<form action="delete2.multi">
	id : <input name="id"><br>
	<button>서버로 전송</button>
</form>
<hr>
<h3>게시판 하나 검색</h3>
<a href="one?id=100">100번 검색</a><br>
<a href="one?id=200">200번 검색</a><br>
</body>
</html>