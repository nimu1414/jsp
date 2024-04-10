<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習問題5-2</title>
<style type="text/css">
body{

	font-size: 16pt;
	font-family: meiryo;
}
textarea{
	height: 100px;
	width: 300px;
	font-size: 14pt;
}
#list{
	height: 30px;
	width: 200px;
	font-size: 12pt;
}
#text{
	font-size: 12pt;
	width: 193px;
}
label{
	margin-right: 4em;
	font-size: 14pt;
}
</style>
</head>
<body>
<form action="testenq" method = "post">
<label>名前:</label><br>
<input type = "text" name ="name" placeholder="名前を入力してください" id = "text">
<br>
<select name = "qtype" id = "list">
<option value = "company" >会社について</option>
<option value = "product" >製品について</option>
<option value = "support" >アフターサポートについて</option>
</select>
<br>
<label>お問い合わせ内容:</label><br>
<textarea  name = "body" placeholder="お問い合わせ内容をご記入ください"
maxlength="200"></textarea>
<br>
<input type ="submit" value = "送信">

</form>
</body>
</html>