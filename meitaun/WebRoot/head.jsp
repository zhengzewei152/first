<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta charset="utf-8">
<title>无标题文档</title>
<style type="text/css">
a{text-decoration:none}
#divhead{
	width:1262.67px;
	height:80px;
	margin-left:auto;
	margin-right:auto;  /*边界左自动，右自动是居中*/
	padding-dowm:16px;
}
#divhead1{
	width:980px;
	
	height:48px;
	margin-left:141px;
	margin-right:auto;  /*边界左自动，右自动是居中*/
	margin-top:16px;
}
#divhead10{
	width:260px;
	
	height:40px;
	
}
</style >
</head>

<body>

<div id="divhead">
  <div id="divhead1">
  <table  cellspacing="0">
  <tr >
      <td width="296">
    	<img src="images/logo.png" width="163" height="48" border="0" /> </td> <td width="94.5">
	<a href="#">首页</a></td> <td width="144.5">
    <a href="#"> 我的订单</a></td> <td width="144.5">     
	<a href="#">入驻加盟</a></td> <td >
	<input id="divhead10" placeholder="搜索商家，美食" type="text" ></td> 
	<td><img src="images/search1_.jpg" style="width="40" height="40"  />
	    </td>
	  </tr>
	</table>
	</div>
</div>
</body>
</html>
