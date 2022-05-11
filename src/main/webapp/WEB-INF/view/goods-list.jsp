<%--
  Created by IntelliJ IDEA.
  User: k1netic
  Date: 05.04.2022
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List:</h1>
<ul>
    <c:forEach var="goods" items="${goods}">
        <c:url var="viewUrl" value="/goods/ + ${goods.id}"/>
        <li>
            <a href="${viewUrl}">View</a>
            <br>
            Title: ${goods.title}
            <br>
            Price: ${goods.cost}
        </li>
    </c:forEach>
</ul>
<br>
<c:url var="createUrl" value="/goods"/>

<a href="${createUrl}">CREATE</a>
</body>
</html>
