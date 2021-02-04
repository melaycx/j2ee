<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/18
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 数据标签property -->
<s:property value="loginUser.name"/>
<!-- 控制标签if/else -->
<s:if test="%{loginUser.sex==1}">
    <s:text name="register.man.label"/>
</s:if>
<s:else>
    <s:text name="register.woman.label"/>
</s:else>
<s:text name="register.message"/>
<!-- 数据标签set -->
<s:set var="user" value="loginUser" scope="session"/>
</body>
</html>
