<%@ page import="cn.edu.zjut.model.UserBean" %><%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/11
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% UserBean user=(UserBean)(request.getAttribute("USER")); %>
注册成功,欢迎您,<%=user.getUsername() %>!
</body>
</html>
