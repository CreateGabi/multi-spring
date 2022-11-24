<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
도서 관리 페이지입니다.<br>
<hr>
<h3>도서 등록</h3>
<form action="insertBookstore">
	id : <input name="id"><br>
	title : <input name="title"><br>
	writer : <input name="writer"><br>
	publish : <input name="publish"><br>
	<button>서버로 전송</button>
</form>
<hr>
<h3>도서 삭제</h3>
<form action="deleteBookstore">
	id : <input name="id"><br>
	<button>서버로 전송</button>
</form>
<hr>
<h3>도서 수정</h3>
<form action="updateBookstore">
	id : <input name="id"><br>
	title : <input name="title"><br>
	writer : <input name="writer"><br>
	publish : <input name="publish"><br>
	<button>서버로 전송</button>
</form>
<hr>
<h3>도서 검색</h3>
<form action="oneBookstore">
	id : <input name="id"><br>
	<button>서버로 전송</button>
</form>
</body>
</html>