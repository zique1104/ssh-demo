<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ssh框架</title>
</head>
<body>
	<c:forEach items="${first}" var="fst" varStatus="i">
    名字:${fst.name} 密码:${fst.pass}<br>
    </c:forEach>
</body>
</html>