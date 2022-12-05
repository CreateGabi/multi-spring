<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- ajax의 views아래 jsp파일에는 부분코드만 넣자. -->
<!-- 
	success : function(x) {  // x에 들어가는 코드부분만 넣자.
		$('#result').html(x)
 -->
 <table border="1">
 	<tr style="background: lime;">
 		<td>영화제목</td>
 		<td>영화가격</td>
 	</tr>
 	<tr style="background: yellow;">
 		<td>${vo.movie }</td>
 		<td>${vo.price }</td>
 	</tr>
 	<tr style="background: yellow;">
 		<td>문자인증받기</td>
 	</tr>
 </table>