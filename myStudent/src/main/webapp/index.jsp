<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 2017/8/7
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>成绩系统</title>
</head>
<body>
<form method="post" action="">
    <div>
        <li class="banji">
            <a href="">班级管理</a>
            <dl class="two">
                <dd><a href="/add.jsp">添加班级</a></dd>
                <dd><a href="/UserServlet?action=all">班级列表</a></dd>
            </dl>
        </li>

        <li class="result">
            <a href="addScore.jsp">成绩录入</a>
            <dl class="two1">
                <dd><a href="/UserServlet?action=stu">成绩查看</a></dd>
            </dl>
        </li>
    </div>


</form>
</body>
</html>
