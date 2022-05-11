%--
  Created by IntelliJ IDEA.
  User: k1netic
  Date: 05.04.2022
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h2>Title: ${goods.title}</h2>
<h2>Price: ${goods.cost}</h2>

<c:url var="deleteUrl" value="/goods/delete">
    <c:param name="id" value="${goods.id}"/>
</c:url>

<a href="${deleteUrl}">DELETE</a>
</body>
</html>
