<%--
  Created by IntelliJ IDEA.
  User: 刘振宇
  Date: 2017/8/30
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="js/jQuery1.11.1.js">
</script>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
    $(document).ready(
        function() {
            $("#myform").submit(function(){
                var username=$("#count").val();
                var age=$("#name").val();
                var ages=$("#names").val();

                var address= $("#add").attr("SELECTED","SELECTED").val();

                if(address==0){
                    alert("请选择分类")
                    $("#add").focus();
                    return false;
                }
                if(username=="")
                {
                    alert("请选择标题！");
                    $("#count").focus();
                    return false;
                }
                if(age=="")
                {
                    alert("请填写内容");
                    $("#name").focus();
                    return false;
                }
                if($("[name=quantity]").val()>$("select option:checked").attr("kc")){
                    alert('库存不足,当前库存为：'+$("select option:checked").attr("kc"));
                    return false;
                }
                alert('保存成功！');
            });

        });
</script>

<body>
<form action="${pageContext.request.contextPath}/add" method="post" id="myform">
<center>
    <h1>添加常见问题</h1>


    分类：
    <select name="typeid" id="add">
        <option value="0">请选择分类</option>
        <c:forEach items="${typelist}" var="item">
     <option value="${item.typeid}">${item.typename}</option>
        </c:forEach>
    </select>
    <br/>
    标题：<input name="housedesc" required id="count"/>

    <br/>
    <br/>
    内容：<input name="monthlyrent" required id="names"/>
    <br/> <br/>
     </input>
    <input type="submit" required/>
    <button type="reset">重置</button>

</center>

</form>

</body>
</html>
