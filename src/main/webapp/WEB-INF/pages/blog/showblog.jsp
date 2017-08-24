<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/21
  Time: 09:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>


<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>博客页面展示</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <%--<!— Brand and toggle get grouped for better mobile display —>--%>
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">博客</a>
        </div>

        <!— Collect the nav links, forms, and other content for toggling —>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/addBlogPage">新建博客 <span class="sr-only">(current)</span></a></li>
                <%--<li><a href="#">查看博客</a></li>--%>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="搜索内容..">
                </div>
                <button type="submit" class="btn btn-default">提交</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">${sessionScope.user.name} </a></li>
                <li><a href="#">切换用户</a></li>
            </ul>
        </div><!— /.navbar-collapse —>
    </div><!— /.container-fluid —>
</nav>

<center>
<table class="table table-bordered" id="tab">






</table>
<nav aria-label="Page navigation">
    <ul class="pagination">
        <li>
            <a href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
        </li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li>
            <a href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
    </ul>
</nav>
</center>
</body>
<script>

    function showBlog(id, title, des,content, how) {
        var tdleft = $("<td></td>");
        var tdright = $("<td></td>").html("<p>" + des + "</p>");
        var tdright1 =  $("<td></td>");
        $("<a href ='#'></a>").html(title).appendTo(tdleft).attr("titleId",id).click(showBlogTitle);
        $("<a href='#'>删除</a>").appendTo(tdright1).attr("deleteById",id).click(delfunc);
        var trOb = $("<tr></tr>").append(tdleft).append(tdright).append(tdright1).attr("id", "ss" + id);
        $("#tab").append(trOb)
    }

    function getAllMessage() {
        $.ajax({
            url: "/getAllById",
            success: function (result) {
                for (var i = 0; i < result.length; i++) {
//                    遍历返回的数组依次在table中添加一行
                    var blog = result[i];
                    showBlog(blog.id,blog.title,blog.des,blog.content,blog.userId)
                }
            }
        })
    }
    getAllMessage();

    function delfunc() {
        $.ajax({
            url: "/deleteById",
            type: "get",
            data: {
                deleteById: $(this).attr("deleteById")
            },
            success: function (result) {
                console.log(result);
            }
        });
    }


  function showBlogTitle() {
        $.ajax({
            url: "/showBlogTitle",
            type: "get",
            data: {
                titleId: $(this).attr("titleId")
            },
            success: function (result) {
                console.log(result);
                window.location.href="/showBlogTitlePage?title="+result.title+"&content="+result.content;
            }
        });
    }





</script>
</html>
