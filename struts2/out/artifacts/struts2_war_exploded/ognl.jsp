<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/4/28
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>OGNL的用法</title>
</head>
<body>
<%--    使用s:property标签把数据输出到浏览器上
        <s:property value="" />
         value的取值是一个ognl表达式
         标签会把value属性取值的所对应的内容输出到浏览器
         如果没任何对应内容则什么都不显示
--%>
OGNL的基本用法：<s:property value=""/><hr/>
<!--表达式转字符串
    %{''} | %{""}
    %{}可以去掉
    字符串转表达式：
    %{}套起来
-->
OGNL的转成普通字符串：<s:property value=""/> <br/>
OGNL的转成普通字符串：<s:property value="'asdasdasdasdsa'"/> <br/>
<hr/>
OGNL表达式调用字符串长度方法：<s:property value="'asdsadasdasdass'.length()"/>
<hr/>
<!--
    访问静态属性需要按照固定书写规范：
        @包名.包名..类名@静态属性名
-->
OGNL表达式访问类的静态属性：<s:property value="@java.lang.Integer@MAX_VALUE" /><br>
OGNL表达式访问类的静态方法：<s:property value="@java.lang.Math@random()" /><br>
</body>
</html>
