<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/24
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>博客标题展示</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
</head>
<body>

<h3>${param.title}</h3>
<hr>
    ${param.content}

</body>
</html>
