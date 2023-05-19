<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 2023/5/17
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>联系我们</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript"
            src="${APP_PATH}/js/jquery-3.3.1.js"></script>
    <link
            href="${APP_PATH}/css/font.css"
            rel="stylesheet">
    <script
            src="${APP_PATH}/js/bootstrap.min.js"></script>
    <script src="../js/sign.js"></script>
</head>
<body style="background-image:url(../agro/UIpic/managementbackground.jpg);background-repeat:no-repeat;background-attachment:fixed;background-size: 100%">
<div class="col-md-9">
    <div class="col-md-12 col-md-offset-4" style="margin-top:25px; margin-bottom:20px">
        <img src="../agro/UIpic/agro.png" style="height:50px">
    </div>
    <div class="col-md-8 col-md-offset-4" style="background-color:rgba(80,77,77,0.9);height:100%;color:#FFFFFF">
        <div class="row" style="height:50px">
            <div class="col-md-3" style="margin-top:10px;text-align:center;font-size:20px">联系我们</div>
        </div>
        <div style="font-size:20px"><br>农园农资管理系统<br>
        </div>
    </div>
</div>
</body>
</html>
