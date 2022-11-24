<%@page import="com.multi.mvc01.BookstoreDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
도서 검색 결과
<hr>
도서 아이디 : ${dto.id }<br>
도서 제목 : ${dto.title }<br>
도서 지은이 : ${dto.writer }<br>
도서 출판사 : ${dto.publish }<br>
</body>
</html>