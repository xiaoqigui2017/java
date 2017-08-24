<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/23
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
</head>
<body>

<form action="/login" method="post">
    <div class="col-sm-offset-2 col-sm-4">
        <label for="username">用户名</label>
        <input type="text" name="username" class="form-control" id="username" placeholder="请输入用户名">
        <label for="password">密码</label>
        <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码">
    </div>
    <div class="col-sm-offset-2 col-sm-6">
        <label>
            <input type="checkbox">自动登录
        </label>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>

<div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
        <form action="/registerPage">
            <button type="submit" class="btn btn-default">注册</button>
        </form>
    </div>
</div>
</body>
</html>
