<%--
  Created by Josef David 10/12/2018, 8:11 PM
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOME</title>
    <style><%@include file="/WEB-INF/css/styles.css"%></style>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<form action="/logout" method="post" style="text-align: center">
    <input class="btn btn-danger" type="submit" value="Logout">
</form>
<div id="app">
    <section class="todo-wrapper">
        <h1 class="todo-title">Welcome, ${name}!</h1>
        <form action="/home" method="post">
            <input type="text" class="input-todo" placeholder="Add something here.." name="todo" autofocus>
            <button class="btn btn-dark" type="submit">ADD
            </button>
        </form>
        <div>
            <p class="status busy">Chat List (Every user can see the list)</p>
            <ul class="todo-list">
                <c:forEach items="${todos}" var="todo">
                    <li>
                        <label></label>
                        <span class="todo-text">${todo.name}</span>
                        <a href="/todo-delete?todo=${todo.name}"><span class="delete"></span></a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </section>
</div>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/popper.js/1.14.3/popper.min.js"></script>
</body>
</html>
