<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 2017/8/7
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>成绩查看</title>
</head>
<body>
<center>
    <h3>成绩查看</h3>
    <table  border="1">

        <tr>
            <td bgcolor="aqua">姓名</td>
            <td bgcolor="#8a2be2">班级</td>
            <td bgcolor="#ff69b4">成绩</td>
            <td bgcolor="#8a2be2">考试日期</td>
            <td bgcolor="#7fffd4">操作</td>
        </tr>

        <c:forEach items="${list}" var="e">
            <tr>
                <td>${e.sname}</td>
                <td>${e.sclass.nname}</td>
                <td>${e.score}</td>
                <td>${e.stime}</td>
                <td><a href="/UserServlet?action=setstu&idss=${e.sid}"> 修改</a>
                 <a href="/UserServlet?action=delScore&ids=${e.sid}">删除</a></td>
            </tr>
        </c:forEach>
    </table>

</center>

</body>
</html>
