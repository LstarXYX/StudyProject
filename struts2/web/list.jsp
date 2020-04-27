<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/4/27
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.0/jquery.min.js"></script>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<table class="table table-hover ">
    <tr>
        <td>客户名称</td>
        <td>客户级别</td>
        <td>客户来源</td>
        <td>所属行业</td>
        <td>联系地址</td>
        <td>联系电话</td>
        <td>操作</td>
    </tr>

    <c:forEach var="customer" items="${customers}" varStatus="st">
        <tr>
            <td>${customer.custName}</td>
            <td>${customer.custLevel}</td>
            <td>${customer.custSource}</td>
            <td>${customer.custIndustry}</td>
            <td>${customer.custAddress}</td>
            <td>${customer.custPhone}</td>
            <td><a href="" class="btn btn-primary">编辑</a>  <a href="" class="btn btn-primary">删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
