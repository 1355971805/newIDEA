<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/7/2
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/UserInfoServlet?action=setNews" method="post">
    <table border="1">
        <tr>
            <td>用户编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>日期</td>
            <td>操作</td>
        </tr>
<c:forEach items="${list}" var="item">
        <tr>
        <td>${item.uid}</td>
        <td>${item.uname}</td>
        <td>${item.usex}</td>
        <td>${item.uage}</td>
        <td>${item.utime}</td>
        <td><a>删除</a><a>修改</a></td>
        </tr>
</c:forEach>
    </table>
    <input type="submit" value="全部用户">
</form>
</body>
</html>
