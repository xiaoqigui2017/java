<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/23
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加博客</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
</head>
<body>
<br>
<br>
<br>
<form class="form-horizontal" action="/addBlog" method="post">

    <div class="form-group">
        <label for="title" class="col-sm-2 control-label">标题</label>
        <div class="col-sm-10">
            <input type="text" name="title" class="form-control" id="title" >
        </div>
    </div>
    <hr>

    <div class="form-group">
        <label for="describe" class="col-sm-2 control-label">描述</label>
        <div class="col-sm-10">
            <input type="text"  name="des"   class="form-control" id="describe" placeholder="请简要描述一下博客的内容">
        </div>
    </div>
    <hr>

    <div class="form-group">
        <label for="describe" class="col-sm-2 control-label">内容</label>
        <div class="col-sm-10">
            <textarea class="form-control"  placeholder="请输入内容"  name="content"  rows="5"></textarea>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">提交</button>
            <%--<button type="submit" class="btn btn-default">提交</button>--%>
            <a href="/showBlogPage" class="btn btn-default">返回</a>
        </div>
    </div>
</form>
</body>
</html>
