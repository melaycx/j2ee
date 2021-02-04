<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/10/11
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form name="free" action="register" method="post" onsubmit="return check()">
    <table>
        <tr>
            <td width="220">请输入注册用户名：</td>
            <td width="100"> <input name="username" type="text"></td>
        </tr>
        <tr>
            <td width="220">
                请输入登录密码：
            </td>
            <td width="100">
                <input name="password1" type="password">
            </td>
        </tr>
        <tr>
            <td width="220">
                请再次输入登录密码：
            </td>
            <td width="100">
                <input name="password2" type="password">
            </td>
        </tr>

        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>

    </table>
</form>
</body>
</html>
<script language="JavaScript">
    function check() {
        if(document.free.password1.value!=(document.free.password2.value)){
            alert("两次密码不一致");
            return false;
        }
        if(document.free.username.value.length==0||document.free.username.value.length>6){
            alert("用户名不能为空或者超过6位");
            document.free.username.focus();
            return false;
        }
        if(document.free.password1.value.length==0||document.free.password1.value.length>6){
            alert("密码不能为空或者超过6位");
            document.free.password1.focus();
            return false;
        }
    }
</script>