<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>电子书城</title>
<link rel="stylesheet" href="css/main.css" type="text/css" />

<script type="text/javascript" src="js/my.js">
	onload = function(){
		setInterval(go,1000);
	}
	var x = 3;
	function go(){
		x--;
		if(x > 0){
			document.getElementById("second").innerHTML = x;
		}else{
			var localObj = window.location;
	    	var contextPath = localObj.pathname.split("/")[1];
	    	location.href= "/"+ contextPath + '/adminlogin.jsp';
		}
	}
</script>
</head>

<body class="main" onload="startSecond()">

	<jsp:include page="head.jsp"></jsp:include>
	<jsp:include page="menu_search.jsp" />



	<div id="divcontent">
		<table width="850px" border="0" cellspacing="0">
			<tr>
				<td style="padding:30px; text-align:center"><table width="60%"
						border="0" cellspacing="0" style="margin-top:70px">
						<tr>
							<td style="width:98"><img
								src="images/IconTexto_WebDev_009.jpg" width="128" height="128" />
							</td>
							<td style="padding-top:30px"><font
								style="font-weight:bold; color:#FF0000">注册成功</font><br />
								<br /> 
								<a href="adminlogin.jsp"><span id="second">3</span>秒后自动为您转跳回登录商家登录界面</a>
							</td>
						</tr>
					</table>
					<h1>&nbsp;</h1></td>
			</tr>
		</table>
	</div>



	<div id="divfoot">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td rowspan="2" style="width:10%"><img
					src="images/bottomlogo.gif" width="195" height="50"
					style="margin-left:175px" /></td>
				<td style="padding-top:5px; padding-left:50px"><a href="#"><font
						color="#747556"><b>CONTACT US</b> </font> </a></td>
			</tr>
			<tr>
				<td style="padding-left:50px"><font color="#CCCCCC"><b>COPYRIGHT
							2008 &copy; eShop All Rights RESERVED.</b> </font></td>
			</tr>
		</table>
	</div>


</body>
</html>
