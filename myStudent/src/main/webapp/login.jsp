<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/8/9
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/UserServlet" method="post">
   用户名：<input name="sid" type="text"></br>
     密码：<input name="sname" type="password"></br>
<input type="submit" value="登陆">
</form>
</body>
</html>
