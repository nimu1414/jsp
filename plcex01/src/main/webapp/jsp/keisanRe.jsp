<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="model.keisan" %>
    <%
    	keisan keisan = (keisan)request.getAttribute("keisan");
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お会計</title>
</head>
<body>
<h1>本日のお会計</h1>
<p>
<%= keisan.getKaikei() %>
</p>
</body>
</html>