<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/8/28
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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

                var address=/*$("#add option[selected]").val();*/
                               $("#add").attr("SELECTED","SELECTED").val();

                 if(address==0){
                     alert("出库商品必选")
                     $("#add").focus();
                     return false;
                 }
                if(username=="")
                {
                    alert("出库数量必填！");
                    $("#count").focus();
                    return false;
                }
                if(age=="")
                {
                    alert("经手人必填");
                    $("#name").focus();
                    return false;
                }
                if($("[name=quantity]").val()>$("select option:checked").attr("kc")){
                     alert('库存不足,当前库存为：'+$("select option:checked").attr("kc"));
                     return false;
                }
               alert('操作成功！');
            });

        });
</script>
<body>

<center>

    <h1>商品出库</h1>
<form  action="${pageContext.request.contextPath}/adds" method="post" id="myform">
    出库商品:<select id="add" name="productid">
    <option value="0">请选择出库商品</option>
    <c:forEach items="${list}" var="item">
    <option value="${item.id}" kc="${item.quantity}">${item.productname}</option>

    </c:forEach>

     </select>
   </br>
    数量：<input  id="count" name="quantity"></br>
    经手人：<input  id="name" name="handler"></br>
    <input type="submit" value="提交">
    <input type="button" value="重置">
</form>
</center>
</body>
</html>
