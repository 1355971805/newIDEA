<!--

 @Name：不落阁后台模板源码
 @Author：Absolutely
 @Site：http://www.lyblogs.cn

 -->
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <head>
        <meta charset="utf-8" />
        <title>数据列表页面</title>
        <link  rel="stylesheet"  href="/BlogHtTemplate-master/bootstrap/css/bootstrap.css"></link>
        <script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/jquery-1.12.4.js"></script>
        <script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/bootstrap.js"></script>
        <script type="text/javascript">
            function deleteblog() {
                var result = confirm('确定删除？');

                if (result) {
                    alert("删除成功！");
                }else
                {
                    alert("删除失败！");
                }

            }
        </script>

    </head>
<body>
<div class="panel panel-default">
    <!-- Default panel contents -->
    <div class="panel-heading">博客管理</div>
    <!-- Table -->
    <table class="table">
        <tr>
            <td>博客作者</td>
            <td>博客路径</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${page.bloglist}" var="item">
            <tr>
                <td>${item.blogAuthor}</td>
                <td><a href="${item.blogAddress}">${item.blogAddress}</a></td>
                <td><a href="BlogInfoServlet?action=updateblog&blogId=${item.blogId}">修改</a><a href="BlogInfoServlet?action=deleteblog&blogId=${item.blogId}" onclick="deleteblog()">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

<div style="text-align: center">
    <a href="<%=path%>/BlogInfoServlet?pageIndex=1">首页</a> &nbsp;&nbsp;&nbsp;
    当前页:[${page.pageIndex} / ${page.totapages}] &nbsp;&nbsp;&nbsp;
    <a href="<%=path%>/BlogInfoServlet?pageIndex=${page.pageIndex-1}">上一页</a> &nbsp;&nbsp;&nbsp;
    <a href="<%=path%>/BlogInfoServlet?pageIndex=${page.pageIndex+1}">下一页</a> &nbsp;&nbsp;&nbsp;
    <a href="<%=path%>/BlogInfoServlet?pageIndex=${page.totapages}">尾页</a>
</div>
</body>
</html>