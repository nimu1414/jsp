<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "model.Health" %>
    <%
    Health health = (Health)request.getAttribute("health");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康診断</title>
</head>
<body>
<h1>診断結果</h1>
<p>
<%double bmi = health.getBmi();
%>
身長:<%=health.getHeight() %><br>
体重:<%=health.getWeight() %><br>
BMI:<%=Math.floor(bmi) %><br>
体型:<%= health.getBodetype() %>
</p>
<a href ="HealthCheck">戻る</a>
</body>
</html>