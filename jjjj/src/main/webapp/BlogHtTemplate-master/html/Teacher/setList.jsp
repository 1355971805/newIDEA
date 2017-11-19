<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/7/7
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<link  rel="stylesheet"  href="/BlogHtTemplate-master/bootstrap/css/bootstrap.css"></link>
<script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/jquery-1.12.4.js"></script>
<script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/bootstrap.js"></script>
<body>
<div class="panel panel-default">
    <!-- Default panel contents -->
    <div class="panel-heading">学生管理</div>
    <!-- Table -->
    <table class="table">
        <tr>
            <td>编号</td>
            <td>班级</td>
            <td>教员</td>
            <td>章节</td>
            <td>内容</td>
            <td>时间</td>
            <td>操作</td>

        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item.homeId}</td>
                <td>${item.homeGrade}</td>
                <td>${item.homeTacher}</td>
                <td>${item.homeChapter}</td>
                <td>${item.homeContent}</td>
                <td>${item.homeTime}</td>
                <td><a href="">修改</a><a href="">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
