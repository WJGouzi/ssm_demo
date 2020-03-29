<%--
  Created by IntelliJ IDEA.
  User: gouzi
  Date: 2020/3/29
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="account/findAll">点击</a>

    <form action="account/saveAccount">
        <input type="text" name="name" placeholder="名">
        <input type="text" name="balance" placeholder="钱">
        <input type="submit" value="提交">
    </form>

</body>
</html>
