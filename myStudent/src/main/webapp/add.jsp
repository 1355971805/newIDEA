<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/8/9
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="/UserServlet?action=adds" method="post">
    <input name="nid"/>
    <input name="name"/>
    <input type="submit" value="添加"/>
</form>

</body>
</html>
