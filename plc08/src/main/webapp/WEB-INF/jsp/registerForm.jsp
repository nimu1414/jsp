<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="NewFile.css">
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<form action = "RegisterUser" method = "post" class="center">
<div class = "area">
<label for = "coment">
ログインID:
</label>
<input type ="text" name = "id" class = "text">
</div>
<div class = "area">
<label for = "coment">
パスワード:
</label>
<input type = "password" name = "pass" class = "text"></div>
<div class = "area">
<label for = "coment">
名前:
</label>
<input type = "text" name = "name" class = "text">
</div>
<div>
<input type = "submit" value = "送信">
</div>
</form>
</body>
</html>