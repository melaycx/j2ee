<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/15
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<s:actionmessage/>--%>
<%--<s:text name="login.result1.label"/>--%>
<%--<br>--%>
<%--<s:property value="count"/>--%>

<%--本站访问次数为：<s:property value="#application.counter"/><br>--%>
<%--<s:property value="#session.user"/>，--%>
<%--<s:property value="#request.tip"/>--%>

<table border=1>
    <s:iterator value="#session.shoppingcart.itemsOrdered" >
        <tr>
            <th>编号</th><th>名称</th><th>说明</th><th>单价</th><th>数量</th>
        </tr> <tr>
        <td><s:property value="item.itemID"/></td>
        <td><s:property value="item.name"/></td>
        <td><s:property value="item.description"/></td>
        <td><s:property value="item.cost"/></td>
        <td><s:property value="numItems"/></td>
    </tr>
    </s:iterator>
</table>
</body>
</html>
