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
등록된 게시글 아이디는 ${bbs2VO.bbsId } <br>
등록된 게시글 타이틀은 ${bbs2VO.title } <br>
등록된 게시글 내용은 ${bbs2VO.content } <br>
등록된 게시글 작성자는 ${bbs2VO.writer } <br>
</body>
</html>