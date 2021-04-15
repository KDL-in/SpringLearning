<%--
  Created by IntelliJ IDEA.
  User: KDLin
  Date: 2021/4/12
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <fmt:message key="welcomeinfo"></fmt:message>
</h1>
<form action="">
    <fmt:message key="username"/><br>
    <fmt:message key="password"/><br>
</form>
</body>
</html>