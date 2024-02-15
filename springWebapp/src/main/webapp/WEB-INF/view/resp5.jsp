<%@ page  isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resp 5 page</title>
</head>
<body>
<h1>Response page from view layer for login</h1>
<br>
<h4 style="color: red">${msg}</h4>
<br>
<form action="Registration" method="post">
<input type="number" name="id" placeholder="Enter Id"><br>
<input type="text" name="name" placeholder="Enter full name"><br>
<input type="text" name="username" placeholder="Enter Username"><br>
<input type="number" name="password" placeholder="Enter password"><br>
<input type="submit" value="Registration"><br>
</form>
</body>
</html>