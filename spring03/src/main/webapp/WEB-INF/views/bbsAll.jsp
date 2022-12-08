<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>전체 게시물 count>> ${count }개</h3>
<%
	// Object로 자동형변환되어 들어가 있던 것을 int의 모든 기능을 사용하고자 하는 경우에는
	// 다시 int로 변경해주어야함.
	// Object <-- Integer <-- 오토박싱(포장)/오토언막싱 --> int
	// Integer(포장클래스(Wrapper class 기본형을 가지고 포장해서 만든 클래스)) <--- int(기본형)
	int pages = (int)request.getAttribute("pages");
	for (int p = 1; p <= pages; p++) {
%>
	<a href=bbsAll?page=<%=p %>> <%=p %> </a>
<%
	}
%>
<table class="table">
	<tr>
		<td>bbs_no</td>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>
	<c:forEach items="${list}" var="one">
	<tr>
		<td>${one.bbs_no}</td>
		<td>${one.id}</td>
		<td>${one.title}</td>
		<td>${one.content}</td>
		<td>${one.writer}</td>
	</tr>
	</c:forEach>
</table>