<%--
  Created by IntelliJ IDEA.
  User: chenyj
  Date: 16/1/13
  Time: 下午10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
SSH的demo模板
<form action="teacher/getstudents" method="get">
    请输入教师名:<input name="name" id="name">(Tom,Bob)<br>
    <input type="submit" value="查询">
</form>
<a href="http://localhost:8088/authority/teacher/getstudents?name=Bob">访问</a>
</body>
</html>
