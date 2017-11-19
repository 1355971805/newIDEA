<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <title>博客列表</title>
    <link  rel="stylesheet"  href="/BlogHtTemplate-master/bootstrap/css/bootstrap.css"></link>
    <link rel="stylesheet" href="/BlogHtTemplate-master/css/add.css"><link>
    <link  rel="stylesheet"  href="/BlogHtTemplate-master/css/myCSS.css"></link>
    <script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/jquery-1.12.4.js"></script>
    <script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        function editBlog(id,obj){
            $("#rid").val(id);
            //location.href="BlogInfoServlet?action=updateblog&blogId="+id;

        }

    </script>
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
    <!-- 学伴 -->
    <div class="clearfix" id="home_partner">
        <div class="container">
            <h2 class="btitle">
                有伴有爱有力量，再也不怕学习没动力
            </h2>
            <h4 class="subtitle">
            <span>
                学习从来不是轻松事，与其孤身奋战，不如找到志同道合小伙伴一起坚持到底，土上方方
            </span>
            </h4>
            <br>
            <div class="row text-center">
                <c:forEach items="${page.bloglist}" var="item">
                    <div class="col-sm-4">
                        <div class="partneritem">
                            <%--<img width="319px" height="319px" class="img-responsive" src="/BlogHtTemplate-master/image/${item.blogAuthor}.jpg" alt="">--%>
                            <h4>
                                ${item.blogAuthor}
                            </h4>
                            <p>
                                <a>${item.blogAddress}</a>
                            </p>

                            <p><a href="#mymodal" data-toggle="modal" onclick="editBlog(${item.blogId},this)">修改</a><a href="BlogInfoServlet?action=deleteblog&blogId=${item.blogId}" onclick="deleteblog()">删除</a></p>
                        </div>
                    </div>
                </c:forEach>

               <%-- <div class="col-sm-4">
                    <div class="partneritem">
                        <img width="319px" height="319px" class="img-responsive" src="/BlogHtTemplate-master/image/敖晴.jpg" alt="">
                        <h4>
                            出国旅行，口语太差
                        </h4>
                        <p>
                            学伴功能，免费添加全部旅伴。
                            一起恶补，齐心协力出国不愁！
                        </p>
                    </div>
                </div>--%>
              <%--  <div class="col-sm-4">
                    <div class="partneritem">
                        <img width="319px" height="319px" class="img-responsive" src="/BlogHtTemplate-master/image/沈际星.jpg" alt="">
                        <h4>
                            是英语课，也是交友会
                        </h4>
                        <p>
                            20多个城市，70多家美联中心，
                            I Show活动课，欢迎一起来玩耍！
                        </p>
                    </div>
                </div>--%>
            </div>
        </div>

    </div>
    <div style="text-align: center">
        <a href="/BlogInfoServlet?pageIndex=1">首页</a> &nbsp;&nbsp;&nbsp;
        当前页:[${page.pageIndex} / ${page.totapages}] &nbsp;&nbsp;&nbsp;
        <a href="/BlogInfoServlet?pageIndex=${page.pageIndex-1}">上一页</a> &nbsp;&nbsp;&nbsp;
        <a href="/BlogInfoServlet?pageIndex=${page.pageIndex+1}">下一页</a> &nbsp;&nbsp;&nbsp;
        <a href="/BlogInfoServlet?pageIndex=${page.totapages}">尾页</a>
    </div>


    <div id="mymodal" class="modal fade bs-examlpe-modal-sm"><!-- modal固定布局，上下左右都是0表示充满全屏，支持移动设备上使用触摸方式进行滚动。。-->
        <div class="modal-dialog modal-sm"><!-- modal-dialog默认相对定位，自适应宽度，大于768px时宽度600，居中-->
            <div class="modal-content"><!-- modal-content模态框的边框、边距、背景色、阴影效果。-->
                <div class="modal-header">
                    <button class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">
                        修改博客
                        <small>土上方方</small>
                    </h4>
                </div>
                <div class="media-body">
                   <%-- <c:forEach items="${blogList}" var="item">--%>
                    <form action="/BlogInfoServlet?action=updateList" method="post">
                        <input type="hidden" name="blogId" value="" id="rid"/>
                        <div class="col-md-10 col-md-offset-1 myMP">
                            作者名<input class="form-control" type="text" name="blogName" value="${item.blogAuthor}" placeholder=""/>
                        </div>
                        <div class="col-md-10 col-md-offset-1 myMP">
                            地址<input class="form-control" type="text" name="blogAddress" value="${item.blogAddress}" placeholder=""/>
                        </div>

                        <div class="col-md-12 myB">
                            <input class="btn btn-danger form-control" type="submit" value="修改"/>
                        </div>
                    </form>
                  <%-- </c:forEach>--%>
                </div>
                <div class="modal-footer">
                </div>
            </div>

        </div>

    </div>

</body>


</html>