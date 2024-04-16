<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shop</title>
</head>
<body>
<form action = "Servlet" method = "get">
<h1>ようこそショッピングサイトへ</h1>
<p>
商品:
<select name= "syohin">
	<option value = "120">ボールペン</option>
	<option value = "60">鉛筆</option>
	<option value = "80">消しゴム</option>
	<option value = "150">定規</option>
</select>
</p>
<p>
個数:
<select name = "kosuu">
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="5">5</option>
	<option value="10">10</option>
</select>
</p>
<input type = "submit" value = "購入">
</form>
</body>
</html>