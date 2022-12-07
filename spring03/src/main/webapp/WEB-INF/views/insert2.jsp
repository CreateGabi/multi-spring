<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이미지 업로드 성공! <img src="resources/upload/${savedName }">
<hr color="red">
등록된 영화 아이디는 ${movieVO.movie_id } <br>
등록된 영화 타이틀은 ${movieVO.title } <br>
등록된 영화 링크는 ${movieVO.link } <br>
</body>
</html>