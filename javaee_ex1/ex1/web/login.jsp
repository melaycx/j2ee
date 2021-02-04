<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/10
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录页面</title>
</head>
<body>
<form name="free" action="login" method="post" onsubmit="return check()">
    <table>
        <tr>
            <td width="180">请输入用户类型:</td>
            <td width="100">
               <select name="selectName">
                   <option value="管理员">管理员</option>
                   <option value="普通用户">普通用户</option>
               </select>

            </td>
        </tr>
        <tr>
            <td width="180">请输入用户名：</td>
            <td width="100"> <input name="username" type="text"></td>
        </tr>
        <tr>
            <td width="180">
                请输入密码：
            </td>
            <td width="100">
                <input name="password" type="password">
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>
        <tr><td><a href="register.jsp">注册</a></td> </tr>
    </table>
</form>
</body>
</html>
<script language="JavaScript">
    function check() {
       if(document.free.username.value.length==0||document.free.username.value.length>6){
           alert("用户名不能为空或者超过6位");
           document.free.username.focus();
           return false;
       }
        if(document.free.password.value.length==0||document.free.password.value.length>6){
            alert("密码不能为空或者超过6位");
            document.free.password.focus();
            return false;
        }
    }
</script>