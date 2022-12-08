<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();  // HashMap구조(키:값)
	json.put("id", "root");
	json.put("pw", "1234");
	json.put("name", "홍길동");
	json.put("tel", "011");
	
	JSONObject json2 = new JSONObject();
	json2.put("id", "admin");
	json2.put("pw", "5678");
	json2.put("name", "김길동");
	json2.put("tel", "099");
	
	JSONArray array = new JSONArray();  // ArrayList상속 받아 만들었음.(add())
	array.add(json);
	array.add(json2);
	
	//PrintWriter out = new PrintWriter();
	//out.print(json.toJSONString());
	out.print(array.toJSONString());
%>