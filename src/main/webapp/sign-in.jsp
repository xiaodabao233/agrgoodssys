<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 2023/5/17
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录</title>

    <!-- Bootstrap -->
    <link href="css/font.css" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrapValidator.min.css">

<%--    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>--%>
<%--    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>
    <![endif]-->
</head>
<body style="background-image:url(agro/UIpic/background.jpg);background-repeat:no-repeat;background-attachment:fixed;background-size: 100%">
<div class="container-fluid">
    <div class="row" style="height:100px"></div>
    <div class="row">
        <div class="col-md-6 col-md-offset-2">
            <img src="agro/UIpic/agrgoodssys%20logo.png" style="height:100px">
        </div>
    </div>
    <br>
    <form id="signInForm" name="form" onsubmit="form.$valid && signIn()" role="form">
        <div class="row">

            <div class="col-md-8 col-md-offset-2" style="background-color:rgba(80,77,77,0.9);height:300px">
                <div class="biaoti">
                    登&nbsp;录
                </div>
                <div class="form-group">
                    <label class="col-md-2 col-md-offset-3 control-label normalfonts">&nbsp;&nbsp;&nbsp;用户名</label>
                    <div class="col-md-4">
                        <input type="text" style="height:25px" class="form-control" name="userName" required/>
                    </div>
                    <div class="col-md-3" style="height:50px"></div>
                </div>
                <div class="form-group">
                    <label class="col-md-2 col-md-offset-3 control-label normalfonts">&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                    <div class="col-md-4">
                        <input type="password" style="height:25px" class="form-control" name="userPass" required/>
                    </div>
                    <div class="col-md-3" style="height:50px"></div>
                </div>


                <div class="form-group">
                    <div class="col-md-2 col-md-offset-3">
                        <input type="text" class="form-control" style="height:25px; margin-left:20px" name="code"
                               size="8"
                               maxlength="4" placeholder="验证码"/>
                    </div>
                    <div class="col-md-4">
                        <img id="validateCodeImg" src="/user/validateCode" style="height:25px;margin-left:10px"
                             onclick="this.src=this.src+'?'+new Date() + Math.floor(Math.random() * 24)"/>
                        <a style="color:#E3E3E3;margin-left:5px" href="javascript:validateCodeImg.onclick()">
                            看不清,换一个</a>
                    </div>
                    <div class="col-md-3" style="height:50px"></div>
                </div>

                <div class="row">
                    <div class="col-md-2 col-sm-offset-5">
                        <button type="submit" name="submit" class="btn btn-md btn-primary btn-block"
                                style="background-color:rgba(88,88,88,0.7)">登&nbsp;&nbsp;录
                        </button>
                    </div>
                    <div class="col-md-5" style="height:50px"></div>
                </div>


                <div class="row">
                    <div style="text-align:center">
                        <p style="color:#FFFFFF">没有账号，前往 <a style="color:#E3E3E3" href="sign-up.jsp">注册</a></p>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>

<script src="lib/jquery-1.12.3.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="lib/bootstrap.min.js"></script>
<script src="lib/bootstrapValidator.min.js"></script>
<script src="js/sign.js"></script>
</body>
</html>
