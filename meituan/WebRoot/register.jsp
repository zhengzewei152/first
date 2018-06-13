<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>bookStore注册页面</title>
<%--导入css --%>
<link rel="stylesheet" href="css/register.css" type="text/css" />
<script type="text/javascript">
	function changeImage() {

		document.getElementById("img").src = "${pageContext.request.contextPath}/imageCode?time="
				+ new Date().getTime();
	}
</script>
</head>


<body class="main">
		<div id="divmain">

  <div id="divhead">
    <div id="divhead1">
         <image  id="divhead1image" src="images/17001023143713.png"/>
    </div>
  </div>

  <div id="divmid"> 
         <div  id="divmid2">
                    <br><br>
          <span id="divmid11">账号注册</span><br><br>
           <span><input id="login-mobile"  name="mobile" value="" placeholder="请输入邮箱" type="text"></span><br><br>
          <span><input id="login-mobile"  name="mobile" value="" placeholder="请输入用户名" type="text"></span><br><br>
          <span><input name="code" id="login-verify-code" autocomplete="off" value="" placeholder="请输入密码" type="password"></span><br><br>
           <span><input id="login-mobile"  name="mobile" value="" placeholder="请输入电话" type="text"></span><br><br>
          <span><input id="btn" name="commitpassword" value="同意并注册" type="submit"></span><br><br>
           <span id="divmid13">已同意《美团网用户协议》</span><br><br>
           
  </div>



<hr>

  <div id="divfoot">
     <li style="list-style-type:none" align="center"  id="footfont">©2018 美团网团购 meituan.com 京ICP证070791号 京公网安备11010502025545号 电子公告服务规则</li>
  </div>

  </div>


</body>
</html>
