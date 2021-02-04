<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/15
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
    <title>Title</title>
    <s:head/>
</head>
<body>
<s:actionerror/>
<s:fielderror/>
<s:form action="login" method="post">
    <s:textfield name="loginUser.account" key="login.account.label"/>
    <s:password name="loginUser.password" key="login.password.label"/>
    <s:submit name="submit" key="login.submit.button" />
</s:form>
</body>
</html>
