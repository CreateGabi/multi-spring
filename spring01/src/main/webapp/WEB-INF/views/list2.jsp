<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" class="table table-hover">
		<thead>
			<tr class="table-warning">
				<td>게시글</td>
				<td>내용</td>
				<td>작성자</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
				<tr class="table-info">
					<td>${dto.title }</td>
					<td><a href="one2?id=${dto.id }"> ${dto.content } </a></td>
					<td>${dto.writer }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>