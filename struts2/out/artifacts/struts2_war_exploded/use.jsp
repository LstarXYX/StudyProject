<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/4/26
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
</head>
<body>
<%--<a href="${pageContext.request.contextPath}/add_User">增加用户</a>--%>
<%--<hr/>--%>
<%--<a href="${pageContext.request.contextPath}/update_User">更新用户</a>--%>
<%--<hr/>--%>
<%--<a href="${pageContext.request.contextPath}/delete_User">删除用户</a>--%>
<%--<hr/>--%>
<%--<a href="${pageContext.request.contextPath}/find_User">查询用户</a>--%>

<a href="${pageContext.request.contextPath}/user!addUser">增加用户</a>
<hr/>
<a href="${pageContext.request.contextPath}/user!updateUser">更新用户</a>
<hr/>
<a href="${pageContext.request.contextPath}/user!deleteUser">删除用户</a>
<hr/>
<a href="${pageContext.request.contextPath}/user!findUser">查询用户</a>

</body>
</html>
