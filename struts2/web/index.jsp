<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/4/25
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Struts2入门案例</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/hello">访问第一个struts2应用</a>
  <hr/>
  <a href="${pageContext.request.contextPath}/hello2">hello2</a>
  <hr/>
  <a href="${pageContext.request.contextPath}/hello3">hello3</a>
  <hr/>
    <a  href="findAllCustomer">客户列表</a>
  <hr/>
  <a href="ognl.jsp">OGNL的用法</a>
  <a href="demo1">OGNL的用法</a>
  <hr/>
  <a href="${pageContext.request.contextPath}/ljq">拦截器</a>
  <hr/>
  <a href="${pageContext.request.contextPath}/main.jsp">xxx论坛</a>
  </body>
</html>
