<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 2017/8/9
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改学生成绩</title>
</head>
<body>
<form method="post" action="/UserServlet?action=updateStu&id=${score.sid}">
    学生姓名<input name="sname" value="${score.sname}"/>
    学生所在班级<input name="sgrade" value="${score.grade}"/>
    学生成绩<input name="score" value="${score.score}"/>
    考试科目<input name="subject" value="${score.subject}"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
