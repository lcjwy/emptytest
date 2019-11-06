<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/5
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="usertodo/login" method="post">
        账号：<input type="text" placeholder="账号" name="uid" /> <br>
        密码：<input type="password" placeholder="密码" name="uname"> <br>
        <input type="submit" value="登录">  &nbsp; <input type="reset" value="取消">
    </form>
</body>
</html>
