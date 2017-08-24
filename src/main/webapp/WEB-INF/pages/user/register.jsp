<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/23
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
</head>
<body>

<form action="/register" method="post">
    <div class="col-sm-offset-2 col-sm-4">
        <label for="username">用户名</label>
        <input type="text" name="name" class="form-control" id="username" placeholder="请输入用户名">
        <br>
        <label for="password">密码</label>
        <input type="password" name="password"  class="form-control" id="password" placeholder="请输入密码">
        <br>
        <label for="passwordAgain">重复密码</label>
        <input type="password" name="passwordAgain"  class="form-control" id="passwordAgain" placeholder="请再次输入密码">
        <br>
        <label for="phone">电话</label>
        <input type="tel" name="tel" class="form-control" id="phone" placeholder="请输入电话">
        <br>
        <label for="address">地址</label>
        <input type="text" name="address"  class="form-control" id="address" placeholder="请输入地址">
        <br>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit"  class="btn btn-default">提交注册</button>
        </div>
    </div>
</form>

</body>
</html>
