<%--
  Created by IntelliJ IDEA.
  User: KDLin
  Date: 2021/4/7
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--    <a href="test">test</a>--%>
<br>
<a href="book/1">get</a>
<br>
<form action="book/1" method="post">
    <input type="submit" value="add">
</form>
<form action="book/1" method="post">
    <input name="_method" type="hidden" value="delete">
    <input type="submit" value="delete">
</form>
<form action="book/1" method="post">
    <input name="_method" value="put"/>
    <input type="submit" value="put">
</form>
<br>
update book name
<form action="/test" method="post">
    <input name="_method" value="put">
    name:<input name="name">
    <input type="submit">
</form>

</body>
</html>
