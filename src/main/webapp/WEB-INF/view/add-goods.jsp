<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: k1netic
  Date: 05.04.2022
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Goods</title>
</head>
<body>
<%--@elvariable id="goods" type=""--%>
<form:form action="addGoods" modelAttribute="goods">
    <form:hidden path="id" value="${product.id}"/>
    Title: <form:input path="title"/>
    <br>
    Price: <form:input path="cost"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
