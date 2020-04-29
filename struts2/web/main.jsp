<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/4/29
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>XXX论坛</title>
</head>
<body>
<h1>XXX论坛</h1>
<%--只有登录成功的用户才能够访问板块链接，否则前往登录界面--%>
<h3>
    <a href="${pageContext.request.contextPath}/Act1.action">板块一</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/Act2.action">板块二</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/Act3.action">板块三</a>
</h3>
</body>
</html>
