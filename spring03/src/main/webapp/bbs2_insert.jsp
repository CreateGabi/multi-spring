<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert3"
	  method="post"
	  enctype="multipart/form-data">
제목: <input type="text" name="title"><br>
내용: <input type="text" name="content"><br>
작성자: <input type="text" name="writer"><br>
파일 <input type="file" name="file"> <br>
<button>서버로 파일 업로드</button>
</form>
</body>
</html>