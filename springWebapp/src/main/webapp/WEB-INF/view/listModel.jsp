<%@ page  isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Models</title>
</head>
<body>
<h1>List View Model Objects</h1>
<br>
<c:forEach var="model" items="${list }">
${model.getId()}
${model.getName()}
<br>
 </c:forEach>
</form>
</body>
</html>