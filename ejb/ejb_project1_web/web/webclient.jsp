<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2021/1/2
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="javax.naming.*, java.util.Properties" %>
<%@ page import="cn.edu.zjut.ejb.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% try {
    final Hashtable jndiProperties = new Hashtable();
    jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
    final Context context = new InitialContext(jndiProperties);
    final String appName = "";
    final String moduleName = "ejb-project1";
    final String distinctName = "";
    final String beanName = "UserService";
    final String viewClassName = UserServiceRemote.class.getName();
    final String namespace = "ejb:/ejb_ex_ejb_exploded/UserService!cn.edu.zjut.ejb.UserServiceRemote";
    UserServiceRemote usBean = (UserServiceRemote) context.lookup(namespace);
    System.out.println(usBean);
    if (usBean.login("zjut", "zjut")) out.println("login ok!");
    else out.println("login failed!");
} catch (NamingException e) {
    e.printStackTrace();
} %>
</body>
</html>
