<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/4/29
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
