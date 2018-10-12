<%--
  Created by Josef David 10/12/2018, 8:11 PM
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOME</title>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
Welcome, ${name}!
<ul>
    <c:forEach items="${todos}" var="todo">
        <li>${todo.name} &nbsp; <a href="/todo-delete?todo=${todo.name}">DELETE</a></li>
    </c:forEach>
</ul>
<form action="/home" method="post">
    <input type="text" name="todo"/>
    <input class="btn btn-danger" type="submit" value="add">
</form>
<form action="/logout" method="post">
    <input class="btn btn-danger" type="submit" value="Logout">
</form>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/popper.js/1.14.3/popper.min.js"></script>
</body>
</html>
