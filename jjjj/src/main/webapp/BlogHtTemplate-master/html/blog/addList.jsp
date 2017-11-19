<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/7/3
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link  rel="stylesheet"  href="/BlogHtTemplate-master/bootstrap/css/bootstrap.css"></link>
<script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/jquery-1.12.4.js"></script>
<script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/bootstrap.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="form-horizontal" action="/BlogInfoServlet?action=addList" method="post">
    <div class="control-group">
        <label class="control-label" for="inputEmail">作者名</label>
        <div class="controls">
            <input type="text" id="inputEmail" name="blogName">
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="inputPassword">博客地址</label>
        <div class="controls">
            <input type="text" id="inputPassword" name="blogAddress">
        </div>
    </div>
    <div class="control-group">


            <input type="submit" class="btn">Sign in</input>

    </div>
</form>
</body>
</html>
