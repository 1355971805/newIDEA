<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/8/9
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩录入</title>
</head>
<body>
<form action="/UserServlet?action=addGrade" method="post">

    班级：<input name="grade"></br>
    姓名：<input name="sname" type="text"></br>
    成绩：<input name="score"></br>
    科目：<input name="subject"></br>
    <input type="submit" value="录入">
</form>
</body>
</html>
