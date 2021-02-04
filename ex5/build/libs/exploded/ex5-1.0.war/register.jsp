<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/18
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/> </head>
</head>
<body>
<s:form action="register" method="post">
    <s:textfield name="loginUser.customerId" key="register.customerID.label"/><BR>
    <s:textfield name="loginUser.account" key="register.account.label"/><BR>
    <s:password name="loginUser.password" key="register.password.label"/><BR>
    <s:password name="loginUser.repassword" key="register.repassword.label"/><BR>
    <s:radio name="loginUser.sex" list="#{1 : getText('register.sex.man.label'), 0 : getText('register.sex.woman.label')}" key
            ="register.sex.label"/><BR>
    <sx:datetimepicker name="loginUser.birthday" displayFormat
            ="yyyy-MM-dd" key="register.birthday.label"/><BR>
    <s:textfield name="loginUser.name" key="register.name.label"/><BR>
    <s:textfield name="loginUser.contactInfo.email" key="register.email.label"/><BR>
    <s:textfield name="loginUser.contactInfo.address" key="register.address.label"/><BR>
    <s:textfield name="loginUser.contactInfo.phone" key="register.phone.label"/><BR>
    <s:textfield name="loginUser.contactInfo.fax" key="register.fax.label"/><BR>
    <s:textfield name="loginUser.contactInfo.zipcode" key="register.zipcode.label"/><BR>
    <s:submit key="register.submit.button" /><BR>
    <s:reset key="register.reset.button" />
</s:form>
</body>
</html>
