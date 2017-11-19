<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/8/9
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>班级列表</h3>
    <table  border="1">

        <tr>
            <td bgcolor="aqua">班级编号</td>
            <td bgcolor="#ff69b4">编辑名称</td>

            <td bgcolor="#7fffd4">操作</td>
        </tr>

        <c:forEach items="${list}" var="e">
            <tr>
                <td>${e.nid}</td>
                <td>${e.nname}</td>

                <td><a href=""> 修改</a>
                    <a href="">删除</a></td>
            </tr>
        </c:forEach>
    </table>

</center>

</body>
</html>
