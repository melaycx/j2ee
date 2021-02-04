<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/11/11
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <s:head theme="xhtml"/>
</head>
<body>
<s:actionerror/>
<s:actionmessage/>
<s:form action="login" method="post">
    <s:textfield name="loginUser.account" key="login.account.label"/>
    <s:password name="loginUser.password" key="login.password.label"/>
    <s:submit key="login.submit.button"/>
</s:form>
</body>
</html>