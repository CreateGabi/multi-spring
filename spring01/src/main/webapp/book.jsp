<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
북마크 페이지입니다.<br>
<hr>
<h3>북마크 전체 검색하기</h3>
<a href="list.multi">전체검색</a>
<hr>
<h3>북마크 검색하기</h3>
<form action="one3.multi">
id : <input name="id"><br>
<button>북마크 검색</button>
</form>
<hr>
<h3>북마크 삭제하기</h3>
<a href="delete3.multi?id=1">1번 북마크 삭제</a>
<hr>
<h3>북마크 글쓰기</h3>
<form action="insert3.multi">
name : <input name="name"><br>
url : <input name="url"><br>
img : <input name="img"><br>
<button>서버로 전송</button>
</form>
</body>
</html>