<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
    <head>
        <title>添加作业</title>
        <nk  rel="stylesheet"  href="/BlogHtTemplate-master/bootstrap/css/bootstrap.css"></nk>
        <script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/jquery-1.12.4.js"></script>
        <script type="text/javascript"  src="/BlogHtTemplate-master/bootstrap/js/bootstrap.js"></script>

        <%--引入百度文本编辑器--%>
        <script type="text/javascript"  src="/BlogHtTemplate-master/ueditor/ueditor.config.js"></script>
        <script type="text/javascript"  src="/BlogHtTemplate-master/ueditor/ueditor.all.min.js"> </script>
        <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
        <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
        <script type="text/javascript"  src="/BlogHtTemplate-master/ueditor/lang/zh-cn/zh-cn.js"></script>

        <style type="text/css">
            div{
                width:100%;
            }
        </style>
    </head>
    <body>
        <form class="navbar-form navbar-left" action="/HomeWorkServlet" method="post" role="search">
            <div class="form-group">
                年级：<input type="text" name="homeGrade" class="form-control" placeholder="请输入年级"></input><br/>
                老师：<input type="text" name="homeTacher" class="form-control" placeholder="请输入姓名"></input><br>
                所属章节<input type="text" name="homeChapter" class="form-control" placeholder="请输入章节"></input><br>
                <div>
                    <script id="editor" type="text/plain" name="homeContent"></script>
                </div>
                <%--<input type="text" name="homeContentxxxx" class="form-control" placeholder="请输入内容">--%>
            </div>
            </div>
            <button type="submit" class="btn btn-danger">添加</button>
        </form>
        <script type="text/javascript">
            //实例化编辑器
            var ue = UE.getEditor( 'editor', {
                autoHeightEnabled: true,
                autoFloatEnabled: true,
                initialFrameWidth: 690,
                initialFrameHeight:483
            });
        </script>
    </body>
</html>

